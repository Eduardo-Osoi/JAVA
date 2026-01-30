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
 * @author Eduardo
 */
public class CuadradoNumero {
    
   
    public static void main(String[] args) {
       //linea superior

         
        for(int i=1; i<=100; i++){
            
             if (i>=i && i<=9){
                   System.out.printf(" " +i + " "); 
               }
           if (i>=10 && i<=50){
            System.out.printf(" " +i);
           }
        }
           
        
                
        for(int i=2; i<=100; i++){

           if (i<=51){
          System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t" +(48+i)+"\n"+i  );
      
           }
           else{
           System.out.printf(" " +i);
       
           }
        } 
    System.out.printf("\n");
        
    }   
    }
    
 

