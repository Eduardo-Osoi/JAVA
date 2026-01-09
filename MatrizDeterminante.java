/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.pkg1;
import java.util.Scanner;

/**
 *
 * @author jafet
 */
public class MatrizDeterminante {
     
     public static void main(String[] args) {
       int tabla[][]=new int[3][3];    
       //introducimos números en la tabla
       Scanner tam = new Scanner (System.in);
       System.out.print("introduce una matrix de 2x2 o 3x3 para calcular su determinante, cualquier otro tamaño no se podra\n\n");
        System.out.print("-------------------------------------\n");
        System.out.print("  tamaño de fila de la matriz: \n");
        int fila = tam.nextInt();
        System.out.print("  tamaño de columna de la matriz: \n\n");
        int columna = tam.nextInt();
        
        if(fila==3 && columna==3){
            
       System.out.println("     Introduce los números en la Tabla de la matriz 3x3 para ver determinate: \n");
       System.out.println("-----------------------------------------------------------------------------------");
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("["+(i)+"]["+(j)+"]= ");
                 tabla[i][j]= tam.nextInt();
            }     
       }
        System.out.println("------------------------------------------");
        
      
       System.out.println("Esta es la matriz introducida\n:");
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                
                 System.out.print(tabla[i][j]+" ");
      
            }   
            System.out.println("");
       }
      int determ;
      determ = (tabla[0][0]*tabla[1][1]*tabla[2][2]) + 
               (tabla[0][1]*tabla[1][2]*tabla[2][0]) +
               (tabla[1][0]*tabla[2][1]*tabla[0][2]) -
               (tabla[0][2]*tabla[1][1]*tabla[2][0]) - 
               (tabla[1][0]*tabla[0][1]*tabla[2][2]) - 
               (tabla[1][2]*tabla[2][1]*tabla[0][0]);
       
       //Mostramos su valor
       System.out.println("El Valor del determinante de esta matriz es: "+determ);
    
      }   
        if(fila==2 && columna==2){
       System.out.println("     Introduce los números en la Tabla de la matriz 2x2 para ver determinate: \n");
       System.out.println("-----------------------------------------------------------------------------------");
            
         for(int i=0;i<2;i++){
             for(int j=0;j<2;j++){
       System.out.print("["+(i)+"]["+(j)+"]= ");
       tabla[i][j] = tam.nextInt();    
             }
            }
     System.out.println("Esta es la matriz introducida\n:");
     for(int i=0;i<2;i++){
             for(int j=0;j<2;j++){
              System.out.print ( tabla[i][j]);  
             }
       System.out.println ();
            }

   int determ2;
       determ2 = (tabla[0][0] * tabla[1][1]) - (tabla[1][0] * tabla[0][1]);
       System.out.println("\n\nEl Valor del determinante de esta matriz es: "+determ2);
     }
        if ((fila!=3 || columna!=3) && (fila!=2 && columna!=2)) {
        System.out.println("--------------------------------------------------------------------------------------------------------------");
            System.out.println("\n\nCheca bien tus varuables determinates que podemis calcular es de 2x2 y 3x3, intenta de nuevo\n\n");
        }
          
       
}
}



