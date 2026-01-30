/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinariodeexpresiones;

/**
 *
 * @author Eduardo
 * 
 */
public class Arbol {

    Nodo raiz;
    int c = 0;
    boolean xd;

    public Arbol() {
        raiz = null;
    }

    public Arbol(String cadena) {
        raiz = crearArbolDeExp(cadena);
    }

    public void reiniciarArbol() {
        raiz = null;
    }

    public void creaNodo(Object dato) {
        raiz = new Nodo(dato);
    }

    public Nodo creaSubArbol(Nodo dato2, Nodo dato1, Nodo operador) {
        operador.izquierdo = dato1;
        operador.derecho = dato2;
        return operador;
    }

    public boolean arbolVacio() {
        return raiz == null;
    }

    private String preorden(Nodo subArbol, String c) {
        String cadena = "";
        if (subArbol != null) {
            cadena = c + subArbol.dato.toString() + "\n" + preorden((Nodo) subArbol.izquierdo, c) + preorden((Nodo) subArbol.derecho, c);
        }
        return cadena;
    }

    private String inorden(Nodo subArbol, String c) {
        String cadena = "";
        if (subArbol != null) {
            cadena = c + inorden((Nodo) subArbol.izquierdo, c) + subArbol.dato.toString() + "\n" + inorden((Nodo) subArbol.derecho, c);
        }
        return cadena;
    }

    private String posorden(Nodo subArbol, String c) {
        String cadena = "";
        if (subArbol != null) {
            cadena = c + posorden((Nodo) subArbol.izquierdo, c) + posorden((Nodo) subArbol.derecho, c) + subArbol.dato.toString() + "\n";
        }
        return cadena;
    }

    public String toString(int a) {
        String cadena = "";
        switch (a) {
            case 0:
                cadena = preorden(raiz, cadena);
                break;
            case 1:
                cadena = inorden(raiz, cadena);
                break;
            case 2:
                cadena = posorden(raiz, cadena);
                break;
        }
        return cadena;
    }

    private int prioridad(char c) {
        int p = 100;
        switch (c) {
            case '^':
                p = 3;
                break;
            case '*':
            case '/':
                p = 2;
                break;
            case '+':
            case '-':
                p = 1;
                break;
            default:
                p = 0;
        }
        return p;
    }

    private boolean esOperador(char c) {
        boolean resultado;
        switch (c) {
            case '(':
            case ')':
            case '^':
            case '*':
            case '/':
            case '+':
            case '-':
                resultado = true;
                break;
            default:
                resultado = false;
        }
        return resultado;
    }

    public boolean expresionCorrecta() {
        return xd;
    }

    private boolean puntosCorrectos(String cadena) {
        int x = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '.') {
                x++;
            }
        }
        if (x > 1) {
            return xd = false;
        } else {
            return xd = true;
        }
    }

    private Nodo crearArbolDeExp(String cadena) {
        PilaArbol pilaOperadores;
        PilaArbol pilaExpresiones;
        Nodo token;
        Nodo op1;
        Nodo op2;
        Nodo op;
        pilaOperadores = new PilaArbol();
        pilaExpresiones = new PilaArbol();
        char caracterEvaluado;
        String operando;
        boolean bandera = false;
        for (int i = 0; i < cadena.length(); i++) {
            caracterEvaluado = cadena.charAt(i);
            token = new Nodo(caracterEvaluado);
            if (!esOperador(caracterEvaluado)) {
                if (bandera == false) {
                    pilaExpresiones.insertar(token);
                    bandera = true;
                } else {
                    operando = pilaExpresiones.quitar().dato.toString();
                    operando += caracterEvaluado;
                    puntosCorrectos(operando);
                    token = new Nodo(operando);
                    pilaExpresiones.insertar(token);
                }

            } else {
                bandera = false;
                switch (caracterEvaluado) {
                    case '(':
                        pilaOperadores.insertar(token);
                        break;
                    case ')':
                        while (!pilaOperadores.pilaVacia() && !pilaOperadores.topePila().dato.equals('(')) {
                            op2 = pilaExpresiones.quitar();
                            op1 = pilaExpresiones.quitar();
                            op = pilaOperadores.quitar();
                            op = creaSubArbol(op2, op1, op);
                            pilaExpresiones.insertar(op);
                        }
                        pilaOperadores.quitar();
                        break;
                    default:
                        while (!pilaOperadores.pilaVacia() && prioridad(caracterEvaluado) <= prioridad(pilaOperadores.topePila().toString().charAt(1))) {
                            op2 = pilaExpresiones.quitar();
                            op1 = pilaExpresiones.quitar();
                            op = pilaOperadores.quitar();
                            op = creaSubArbol(op2, op1, op);
                            pilaExpresiones.insertar(op);
                        }
                        pilaOperadores.insertar(token);

                }
            }
        }
        while (!pilaOperadores.pilaVacia()) {
            op2 = pilaExpresiones.quitar();
            op1 = pilaExpresiones.quitar();
            op = pilaOperadores.quitar();
            op = creaSubArbol(op2, op1, op);
            pilaExpresiones.insertar(op);
        }
        op = pilaExpresiones.quitar();
        return op;
    }
    public Nodo getRaiz() {
        return raiz;
    }

    public double getEvaluacion() {
        return evaluacion(raiz);
    }

    private double evaluacion(Nodo subArbol) {
        double aux = 0;
        if (!esOperador(subArbol.dato.toString().charAt(0))) {
            return Double.parseDouble(subArbol.dato.toString());
        } else {
            switch (subArbol.dato.toString().charAt(0)) {
                case '^':
                    aux = aux + Math.pow(evaluacion((Nodo) subArbol.izquierdo), evaluacion((Nodo) subArbol.derecho));
                    break;
                case '*':
                    aux = aux + evaluacion((Nodo) subArbol.izquierdo) * evaluacion((Nodo) subArbol.derecho);
                    break;
                case '/':
                    aux = aux + evaluacion((Nodo) subArbol.izquierdo) / evaluacion((Nodo) subArbol.derecho);
                    break;
                case '+':
                    aux = aux + evaluacion((Nodo) subArbol.izquierdo) + evaluacion((Nodo) subArbol.derecho);
                    break;
                case '-':
                    aux = aux + evaluacion((Nodo) subArbol.izquierdo) - evaluacion((Nodo) subArbol.derecho);
                    break;
            }
        }
        return aux;
    }
}
