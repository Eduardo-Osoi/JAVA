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
public class ArregloEjemplo2 {
    
    @SuppressWarnings("empty-statement")
    public static void main( String args[] )
{
 // la lista inicializadora especifica el valor para cada elemento
 int arreglo[] = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };
 

 System.out.printf( "%s%8s\n", "Indice", "Valor" ); // encabezados de columnas

 // imprime el valor del elemento de cada arreglo
 for ( int contador = 0; contador < arreglo.length; contador++ )
 System.out.printf( "%5d%8d\n", contador, arreglo[ contador ] );
 } // fin de main
 } // fin de la clase InicArreglo

