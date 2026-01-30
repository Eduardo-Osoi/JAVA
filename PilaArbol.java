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
public class PilaArbol {

    private NodoPila tope;

    public PilaArbol() {
        tope = null;
    }

    public void insertar(Nodo elemento) {
        NodoPila nuevo;
        nuevo = new NodoPila(elemento);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public void insertarCadena(char car) {
        NodoPila nuevo;
        nuevo = new NodoPila(car);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public boolean pilaVacia() {
        return tope == null;
    }

    public Nodo topePila() {
        return tope.dato;
    }

    public void reiniciarPila() {
        tope = null;
    }

    public Nodo quitar() {
        Nodo aux = null;
        if (!pilaVacia()) {
            aux = tope.dato;
            tope = tope.siguiente;
        }
        return aux;
    }
}
