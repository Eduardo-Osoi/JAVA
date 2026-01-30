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
public class MatrizHorizontal {
 
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
                 System.out.print("------------------------------------------------------------------------ \n");
                 System.out.print("proceso de como se optiene la suma de matrices \n ");  
                  
              
                   System.out.print("matriz A)\n\n[a1,1] [a1,2] [a1,3] [an,n] ....\n[a2,1]"
                   + " [a2,2] [a2,3] [an,n] ....\n[a3,1] [a3,2] [a3,3] [an,n] ....\n");
                   System.out.print("[a4,1] [a4,2] [a4,3] [an,n] ....\n");
                   System.out.print("[an,n] [bn,n] [an,n] [an,n]\n");
                   System.out.print("  .       .      .      .  \n");
                   System.out.print("  .       .      .      .  \n");
                  
                   
                   System.out.print(" \n          +            \n");
                   
                   System.out.print("matriz B)\n\n[b1,1] [b1,2] [b1,3] [bn,n] ....\n"
                   + "[b2,1] [b2,2] [b2,3] [bn,n] ....\n[b3,1] [b3,2] [b3,3] [bn,n] ....\n");
                   System.out.print("[b4,1] [b4,2] [b4,3] [bn,n] ....\n");
                   System.out.print("[bn,n] [bn,n] [bn,n] [bn,n]\n");
                   System.out.print("  .       .      .      .  \n");
                   System.out.print("  .       .      .      .  \n");
                   System.out.print(" \n          =             \n");
                   
                   
                   System.out.print("matriz c) resultante \n\n(a[1,1]+[b1,1]) ({a1,2]+[b1,2]) ([a1,3]+[b1,3]) "
                           + "([bn,n]+[bn,n]) ....\n"
                           + "(a[2,1]+[b2,1]) ({a2,2]+[b2,2]) ([a2,3]+[b2,3]) ([an,n]+[bn,n] )....\n");
                   System.out.print("([a3,1]+[b3,1]) ({a3,2]+[b3,2]) ([a3,3]+[b3,3]) ([an,n]+[bn,n]) ....\n");
                   System.out.print("([a4,1]+[b4,1]) ({a4,2]+[b4,2]) ([a4,3]+[b4,3]) ([an,n]+[bn,n])\n");
                   System.out.print("([an,n]+[bn,n]) ({an,n]+[bn,n]) ([an,n]+[bn,n]) ([an,n]+[bn,n])\n");
                   System.out.print("  .       .      .      .  \n");
                   System.out.print("  .       .      .      .  \n");
                   
        for (int f=0;f<matriz3.length;f++){
            for (int c=0;c<matriz3.length;c++){
                matriz3 [f][c]= matriz1 [f][c] +matriz2 [f][c];
            }
           System.out.print("");
        }
   
         
         System.out.print("=============================suma de las matrices=============================\n");
           System.out.print("  Matriz (N)     +      Matriz (N)         =        Matriz resultante            \n\n");
         for (int f=0;f<matriz1.length;f++){
             for (int c=0;c<matriz1.length;c++){
                 System.out.print("["+ matriz1[f][c] +"]");
             }
                 System.out.print(" ");
             
           System.out.print("        +         ");
           
             for (int c=0;c<matriz1.length;c++){
                 System.out.print("["+matriz2[f][c] + "]");
                 System.out.print("");  
             }
           
             System.out.print("         =         "); 

             for (int c=0;c<matriz3.length;c++){
                 System.out.print("["+matriz3[f][c] +"]");         
             }
             System.out.println("");
         }
  
           }

        else {
         System.out.print("\n el tamaño de la fila y la columna\n");
         System.out.print("intente de nuevo e inicie el programa nuevmente\n");
     }
       
    }
    }

