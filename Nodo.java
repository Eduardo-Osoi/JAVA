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
public class Nodo {
   Object dato;
   Object izquierdo;
   Object derecho;
   
   public Nodo(Object x){
       dato = x;
       izquierdo = null;
       derecho = null;
   }
}
