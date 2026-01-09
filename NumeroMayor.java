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
public class NumeroMayor {
    
     public static void main(String[] args) {
        // TODO code application logic here
Scanner leer = new Scanner(System.in);


int mayor,c,n,numero;
System.out.print("Introduce cuantos numeros sera :");
 n=leer.nextInt();
 
 mayor = 0;
 c=1;
 numero =n;
if  (n >1){
while (c<=n){

System.out.print("Introduce el valor del numero:");
 numero=leer.nextInt();
  if (numero < mayor ){
      mayor = numero; 
  }
 c++;
     }
     System.out.print("el numero menor es:" +mayor);
     System.out.print("                   " );
     }
     
     else if (n<=0){
     System.out.print("el numero es un numero negativo:");
     System.out.print("intente de nuevo" );
     System.out.print("                " );
             
}
}
}
