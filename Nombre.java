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
public class Nombre {
        public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("dame tu nombre completo  \n" );
        String nom = sc.nextLine();
        String str = nom; 
        String[] newStr = str.split("\\s+");
        System.out.print("======tu datos son ======= \n\n" );
        
        for (int i=0; i < newStr.length; i++) 
        {
           if (i==0){
           System.out.println("nombre: "+newStr[i]);
           i++;}
           if (i==1){
           System.out.println("apellido paterno: "+newStr[i]);
           i++;}
           if (i==2){
           System.out.println("apellido materno: "+newStr[i]);
           i++;}
        }
    }  
}
    
   
