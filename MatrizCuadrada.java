/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.pkg1;
import java.util.Scanner;



/**
 *
 * @author Eduardo
 */
public class MatrizCuadrada {
         public static void main(String[] args) {
        
        int matriz1 [][] ;
        int matriz2 [][] ;
        int matriz3 [][] ;
        int fila,columna ;
         
        Scanner tam = new Scanner (System.in);
        System.out.print("      creando matriz cuadrada\n");
        System.out.print("-------------------------------------\n");
        System.out.print("tamaño de fila de la matriz: \n");
        fila = tam.nextInt();
        System.out.print("tamaño de columna de la matriz: \n\n");
        columna = tam.nextInt();
        
        if(fila==columna && columna==fila){
         System.out.print("\n      la matriz es cuadrada ingrese los datos para llenar la matriz\n");
         System.out.print("------------------------------------------------------------------------------\n");
         matriz1 = new int [fila][columna];
         matriz2 = new int [fila][columna];
         matriz3 = new int [fila][columna];
         
         System.out.print("matriz A): \n");
         for (int f=0;f<matriz1.length;f++){
             for (int c=0;c<matriz1.length;c++){
                 System.out.print("A["+(f)+"]["+(c)+"]= ");
                 matriz1[f][c] = tam.nextInt();
             }
         }
         System.out.print("\n\n");
      
         
         System.out.print("matriz B): \n");
         for (int f=0;f<matriz2.length;f++){
             for (int c=0;c<matriz2.length;c++){
                 System.out.print("B["+(f)+"]["+(c)+"]= ");
                 matriz2[f][c] = tam.nextInt();
             }
         }
         
         System.out.print("-------------Datos de la matriz A) ---------------\n");
         
         System.out.print("matriz A): \n");
         for (int f=0;f<matriz1.length;f++){
             for (int c=0;c<matriz1.length;c++){
                 System.out.print(matriz1[f][c]+" ");  
             }
              System.out.print("\n");
         }
         
         System.out.print("-------------Datos de la matriz B) ---------------\n");
         
         System.out.print("matriz B): \n");
         for (int f=0;f<matriz2.length;f++){
             for (int c=0;c<matriz2.length;c++){
                 System.out.print(matriz2[f][c]+" ");  
             }
              System.out.print("\n");
         }
         
         System.out.print("=============================suma de las matrices=============================\n");
          
       for (int f=0;f<matriz3.length;f++){
           for (int c=0;c<matriz3.length;c++){
               matriz3[f][c] = matriz1[f][c] + matriz2[f][c];
               System.out.print(matriz3[f][c]+" ");  
           }
           System.out.print("\n");
       }             
        } 
        else {
         System.out.print("\n el tamaño de la fila y la columna\n");
         System.out.print("intente de nuevo e inicie el programa nuevmente\n");
     }
       
     }

    
}



