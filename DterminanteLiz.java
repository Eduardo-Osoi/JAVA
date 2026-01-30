/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.pkg1;
import java.util.Scanner;
/**
 *
 * @author Eduardo
 */
public class DterminanteLiz {
    
public static void main (String [] args) {
   
   Scanner lea = new Scanner (System.in);
   int opc;
   do{
        System.out.print("Ingrese el tipo de matriz que desea, (1)Matriz2x2  (2)Matriz3X3: ");opc = lea.nextInt();
   }while(opc<0 || opc>2);
   
   if (opc==1){
       int matriz[][]=new int[2][2];
         System.out.println ("========Ingreso de los elementos de la Matriz 2x2======== ");
         for(int i=0;i<2;i++){
             for(int j=0;j<2;j++){
                 System.out.println("Elemento ("+(i+1)+","+(j+1)+"): ");
                 matriz[i][j] = lea.nextInt();    
             }
         }
         System.out.println ("Muestra de la Matriz");
         for(int i=0;i<2;i++){
             for(int j=0;j<2;j++){
                 System.out.print ("|" + matriz[i][j] +"|");  
             }
             System.out.println ();
         }
         System.out.println(" ");
         
         for(int i=0;i<2;i++){
             for(int j=0;j<2;j++){
                 int determinante;
                 determinante = (matriz[0][0] * matriz[1][1]) - (matriz[1][0] * matriz[0][1]);
                 System.out.println ("El determinante es: " +determinante);
                 System.out.println(" ");
                 break;
             }
             int determinante2;
     determinante2 = (matriz[0][0]*matriz[1][1]) - (matriz[1][0]*matriz[0][1]);
     System.out.println("operacion de la matriz 2x2 es:");
     System.out.println(" ");
     System.out.println("Primera operación");
     System.out.println("Det|A|: (" +matriz[0][0]+" x "+matriz[1][1]+") - ("+matriz[1][0] +" x " +matriz[0][1] +")");
     System.out.println("Segunda operación");
     System.out.println("= ("+matriz[0][0]*matriz[1][1]+") - (" +matriz[1][0]*matriz[0][1]+")");
     System.out.println("Resultado de Det|A|:"+ determinante2);
             break;
         }
    }
   
   if (opc==2){
         int matriz1[][]=new int[3][3];
         System.out.println ("========Ingreso de los elementos de la Matriz 3x3======== ");
         for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
                 System.out.println("Elemento ("+(i+1)+","+(j+1)+"): ");
                 matriz1[i][j] = lea.nextInt();
             }
         }
         System.out.println ();
         
System.out.println("Matriz para llevar a cabo el metodo de Sarrus");
     for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
       System.out.print ("|"+ matriz1[i][j]+"|");
             }
       System.out.println ();
            }
      for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
                 if (matriz1[i][j]== matriz1[0][0]){
                     System.out.print ("|"+ matriz1[i][j]+"|");
                 }
                 if (matriz1[i][j]== matriz1[0][1]){
                     System.out.print ("|"+ matriz1[i][j]+"|");
                 }
                 if (matriz1[i][j]== matriz1[0][2]){
                     System.out.print ("|"+ matriz1[i][j]+"|");
                 }
                 if (matriz1[i][j]== matriz1[1][0]){
                     System.out.print ("|"+ matriz1[i][j]+"|");
                 }
                 if (matriz1[i][j]== matriz1[1][1]){
                     System.out.print ("|"+ matriz1[i][j]+"|");
                 }
                 if (matriz1[i][j]== matriz1[1][2]){
                     System.out.print ("|"+ matriz1[i][j]+"|");
                 }
                 
       
             }
       System.out.println ();
            }
      
         for(int i=0;i<3;i++){
             for(int j=0;j<3;j++){
                 
                 int determinante;
                 determinante = ((matriz1[0][0] * matriz1[1][1] * matriz1[2][2]) + (matriz1[0][1] * matriz1[1][2] * matriz1[2][0]) + (matriz1[0][2] * matriz1[1][0] * matriz1[2][1]) ) - ( (matriz1[2][0] * matriz1[1][1] * matriz1[0][2]) + (matriz1[2][1] * matriz1[1][2] * matriz1[0][0]) + (matriz1[2][2] * matriz1[1][0] * matriz1[0][1]) );
                 System.out.println ("El determinante  es: " +determinante);
                 break;
             }
             int determinante3;
     determinante3 = ((matriz1[0][0]*matriz1[1][1]*matriz1[2][2]+matriz1[0][1]*matriz1[1][2]*matriz1[2][0]+matriz1[1][0]*matriz1[2][1]*matriz1[0][2])-(matriz1[0][2]*matriz1[1][1]*matriz1[2][0]+matriz1[0][1]*matriz1[1][0]*matriz1[2][2]+matriz1[1][2]*matriz1[2][1]*matriz1[0][0]));
     System.out.println("\noperacion de la matriz 3x3 es:");
     System.out.println(" ");
     System.out.println("Primera operación");
     System.out.println("Det|B|: ("+matriz1[0][0]+" x " +matriz1[1][1]+" x " +matriz1[2][2]+") + ("+matriz1[0][1]+" x " +matriz1[1][2]+" x " +matriz1[2][0]+") + ("+matriz1[1][0]+" x " +matriz1[2][1]+" x " +matriz1[0][2]+") - ("+matriz1[0][2]+" x " +matriz1[1][1]+" x " +matriz1[2][0]+") + ("+matriz1[0][1]+" x " +matriz1[1][0]+" x " +matriz1[2][2]+") + (" +matriz1[1][2]+" x " +matriz1[2][1]+" x " +matriz1[0][0]+")");
     System.out.println("Segunda operación");
     System.out.println("= ("+matriz1[0][0]*matriz1[1][1]*matriz1[2][2]+" + " +matriz1[0][1]*matriz1[1][2]*matriz1[2][0]+" + " +matriz1[1][0]*matriz1[2][1]*matriz1[0][2]+") - ("+matriz1[0][2]*matriz1[1][1]*matriz1[2][0]+" + " +matriz1[0][1]*matriz1[1][0]*matriz1[2][2]+" + " +matriz1[1][2]*matriz1[2][1]*matriz1[0][0]+")");
       int n1 = matriz1[0][0]*matriz1[1][1]*matriz1[2][2]+matriz1[0][1]*matriz1[1][2]*matriz1[2][0]+matriz1[1][0]*matriz1[2][1]*matriz1[0][2];
       int n2 = matriz1[0][2]*matriz1[1][1]*matriz1[2][0]+matriz1[0][1]*matriz1[1][0]*matriz1[2][2]+matriz1[1][2]*matriz1[2][1]*matriz1[0][0];
       System.out.println("Tercera operación");
       System.out.println("= ("+n1+")-("+n2+")"); 
       System.out.println("Resultado de Det|B|:"+ determinante3);
             break;
         }
   }

   } 
  
    }

