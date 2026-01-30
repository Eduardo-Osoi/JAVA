/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.pkg1;
import java.util.Scanner;
import java.lang.Math;
/**3
 * 
 *
 * @author Eduardo
 */
public class Swith {
    
     public static void main(String[] args){
        int v;
        int a,b,c;
        float a2,r,y;
        
    
      Scanner valor = new Scanner (System.in);
         
         
         do {
             
         System.out.println("meni¿u de opciones");
         System.out.println("1) area de triangulo");
         System.out.println("2) area de rectangulo");
         System.out.println("3) area de de un circulo");
         System.out.println("opcion alegir ");
                 
         v = valor.nextInt();
         
         switch(v){
             case 1: 
                 System.out.println("triangulo");
                 System.out.println("dame la base del triangulo ");
                 a = valor.nextInt();
                 System.out.println("dame la altura del triangulo");
                 b = valor.nextInt();
                 
                 c = (a*b)/2;
                 System.out.println("area del triangulo es : "+c);
                 break;
             case 2:
                 System.out.println("rectangulo");
                 System.out.println("dame la base del rectangulo ");
                 a = valor.nextInt();
                 System.out.println("dame la altura del rectangulo");
                 b = valor.nextInt();
                 
                 c = a*b;
                 System.out.println("area del rectangulo es : "+c);
                 break;
             case 3:
                 System.out.println("circulo");
                 System.out.println("dame el radio del circulo ");
                 r = valor.nextFloat();
                 y= (float) Math.pow(r,2);
                 a2 = (float) (3.1416 *y);
                 
                 System.out.println("area del triangulo es : "+a2);
                 break;
             default:
                 System.out.println("saliendo del sistema ");
                 
         }
         }while (v != 4);
     }
}
