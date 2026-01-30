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
public class NodoPila {
    Nodo dato;
    Object dato2;
    NodoPila siguiente;
    NodoPila(Nodo x){
        dato = x;
        siguiente = null;
    }
    NodoPila(char x){
        dato2 = x;
        siguiente = null;
    }
}
