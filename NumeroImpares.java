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
public class NumeroImpares {
 

    
     public static void main(String[] args) {
        // TODO code application logic here



int numero,i,n,p =1;
System.out.print("producto de numero impares:\n");

for (i=1;i<=15;i++){
    
    if (i%2 == 1){
        System.out.print("numero impar es :" +i +"\n");
         p=p*i;
    }
    }
    System.out.print("producto de numero impares es :"+p +"\n");
}
}


