/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.pkg1;
import java.io.PrintStream;
import javax.swing.*;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author jafet
 */
public class Potencia {
    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       int pot1,pot2,pot3 ,n;
       
            System.out.println("numero de  potencia que desea llegar \n");
            n=leer.nextInt();
            
            System.out.println("\n Numero "+" Potencia 2 "+" Potencia 3");
            System.out.println("-------------------------------------");
            
        for(int i=1;i<=n;i++){
         pot2=i*i;
         pot3=i*i*i;

        System.out.println(i+"             "+pot2+"            "+pot3);
        }
        
    }
}
