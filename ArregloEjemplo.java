/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.pkg1;

/**
 *
 * @author Eduardo
 */
public class ArregloEjemplo {
    
    public static void main( String args[] )
 {
 int arreglo[]; // declara un arreglo con el mismo nombre

 arreglo = new int[ 10 ]; // crea el espacio para el arreglo

 System.out.printf( "%s%8s\n", "Indice", "Valor" ); // encabezados de columnas

 // imprime el valor de cada elemento del arreglo
 for ( int contador = 0; contador < arreglo.length; contador++ )
System.out.printf( "%5d%8d\n", contador, arreglo[ contador ] );
} // fin de main
} // fin de la clase InicArreglo

