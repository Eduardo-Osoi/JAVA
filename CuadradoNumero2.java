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
public class CuadradoNumero2 {
    
   
    public static void main(String[] args) {
       //linea de arriba
        for ( int i = 1; i <=50; i++ ) {
            if (i>=1 && i<=8) {
              System.out.print("   "+i +"  ");
            }  
            if (i>=9 && i<=50){ 
            System.out.print("   "+i);
            }
        }
        System.out.println(" ");
        
        //linea de los lados
         for ( int i = 2; i <=50; i++ ) {
             System.out.println(i);
             for ( int j = 50; j <=100; j++ ) {  
                 System.out.print("     ");
             } 
             System.out.println((49+i));
         }
        //linea de abajo
        for ( int i = 51; i <=100; i++ ) {         
              if (i>=51 && i<=56) {
              System.out.print("  "+i +"  ");
            }  
            if (i>=57 && i<=100){ 
            System.out.print("   "+i);
            }
        }
        System.out.println("\n");
    }   
    }
    
 

