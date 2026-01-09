/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.pkg1;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jafet
 */
public class RFC {
    
   public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
         
        String nombre="",nom="",apePA="",apeMA=""; 
        String nac="",dia="",mes="",año="";
        
        int aleatorio,ale;
        Random rd=new Random();
        aleatorio=rd.nextInt(9);
        ale=rd.nextInt(9);
        
        
         char alf = (char) (rd.nextInt(26) + 'a');
        System.out.println(" X) dame tus datos para generar tu RFC  X)");
        System.out.println("\n--------------------------------------------\n");
        System.out.println("\n1._Introduce tu nombre con apelidos : \t");
        nombre=leer.nextLine(); 
        String[] cadena1=nombre.split(" ");
        
        System.out.println("\n2._Introduce tu fecha de nacimiento en el siguiente orden DD-MM-AAAA usando el separador '-':  \t");
        nac=leer.nextLine();
        String[] cadena2=nac.split("-");
        
        for(int i=0; i<cadena1.length; i++){
           if(i==0){
            nom=cadena1[i].substring(0,1);
        }
             if(i==1){
            apePA=cadena1[i].substring(0,2);
        }
                if(i==2){
            apeMA=cadena1[i].substring(0,1);
        }
        }
         for(int i=0; i<cadena2.length; i++){
            if(i==0){
            dia=cadena2[i].substring(0);
        }
                 if(i==1){
            mes=cadena2[i].substring(0);
        }
                      if(i==2){
            año=cadena2[i].substring(2,4);
        } 
         }
   
         System.out.println("\n-----------------------------------------\n");
        System.out.println("Su RFC ES: "+apePA.toUpperCase()
        +apeMA.toUpperCase()
        +nom.toUpperCase()
        +año+mes+dia+aleatorio
        +Character.toUpperCase(alf)+ale);
    }   
}
