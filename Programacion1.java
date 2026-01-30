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
 * @author Eduardo
 */
public class Programacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner leer = new Scanner(System.in);

 double a,b,c;
 double x1,x2,d,i;

System.out.print("Introduce el valor de A :");
 a=leer.nextFloat();
System.out.print("Introduce el valor de B :");
 b=leer.nextFloat();
System.out.print("Introduce el valor de C:");
 c=leer.nextFloat();
 
  d = Math.pow(b,2)-(4*a*c);
  
  if(d>= 1){
       x1 = ((b*(-1)) + Math.sqrt(d))/(2*a);
       x2 = ((b*(1)) + Math.sqrt(d))/(2*a);
       System.out.println ("el valor de x1= "+x1);
       System.out.println ("el valor de x2= "+x2);    
  }
          else if (d <= -1){   
                  System.out.println("existen dos soluciones imaginarias" ); 
                  System.out.println ("x1 ="+(-b)+"+"+"i"+"/"+(2*a));
                  System.out.println ("x2 ="+(-b)+"-"+"i"+"/"+(2*a));
          }
                 else if (d == 0){
                    System.out.println("el problema es negativo asi que la ecuacion no tiene sololucion  o un solo resultado" ); 
                    x1 = (b/(2*a))*(-1);
                    System.out.println("el valor de x1= " +x1+ "" );
    }
  }
}
