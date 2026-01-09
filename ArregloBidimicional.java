/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.pkg1;
import java.util.Scanner;
   
import java.io.PrintStream;
import javax.swing.*;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author jafet
 */
public class ArregloBidimicional {
   
    public static void main(String [] a)
{
int v[][]= new int[3][5];
 leer(v);
 visualizar(v);
}
    
    static void leer(int a[][])
{
      int i,j;
     Scanner entrada = new Scanner(System.in);
     System.out.println("Entrada de datos de la matriz");
         for (i = 0; i < a.length; i++){
 
       
          for (j = 0; j < a[i].length; j++){
               System.out.println("A) "  +"{"+i+","+j+"} = "  );
               a[i][j]= entrada.nextInt();
          }
}
}
    
    
    
    
static void visualizar (int a[][])
{
     int i,j;
   System.out.println("\n\t Matriz leída\n");
   for (i = 0; i < a.length; i++){
       
      for (j = 0; j < a[i].length; j++){
    System.out.print(a[i][j] + " ");
   }
      
   System.out.println(" ");
}
}
}
    

    
