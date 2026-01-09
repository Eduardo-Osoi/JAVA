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
public class NewClass     {
        
     public static void main(String[] args) {
        // TODO code application logic here

System.out.print("producto de numero pares:\n");
Scanner sc = new Scanner (System.in);


int n,c=1;

 System.out.print("escriba cuantos pares quiere \n"); 
 n=sc.nextInt();

for (int i=1; i<=n*2 ;i+=2){
    
        System.out.print(c+"-." +i +"\n"); 
        c++;
    }
    
    }
   
}        
     
    

