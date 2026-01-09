
package programacion.pkg1;
import java.util.Scanner;

/**
 *
 * @author jafet
 */
public class MatrizDeterminante_1 {
     
     public static void main(String[] args) {
       int tabla[][]=new int[3][3];    
       
       //introducimos números en la tabla
       Scanner tam = new Scanner (System.in);
       System.out.print("introduce una matrix de 2x2 o 3x3 para calcular su determinante, cualquier otro tamaño no se podra\n\n");
        System.out.print("-------------------------------------\n");
        System.out.print("  tamaño de fila de la matriz: \n");
        int fila = tam.nextInt();
        System.out.print("  tamaño de columna de la matriz: \n\n");
        int columna = tam.nextInt();
        
        if(fila==3 && columna==3){
            
       System.out.println("     Introduce los números en la Tabla de la matriz 3x3 para ver determinate: \n");
       System.out.println("-----------------------------------------------------------------------------------");
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("A) ["+(i)+"]["+(j)+"]= ");
                 tabla[i][j]= tam.nextInt();
            }     
       }
        System.out.println("------------------------------------------");
        
         System.out.println("Esta es la matriz A} DE 3X3\n:");
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                
                 System.out.print ( "["+tabla[i][j]+"] ");  
                 
                    
            }  
                System.out.println ();
       }
       System.out.println("-----------------------------------------------------------------------------------");
       System.out.println("Esta es la matriz con el metodo de sarrus\n:");
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                
                 System.out.print ( "["+tabla[i][j]+"] ");  
                 
                    
            }  
                System.out.println ();
       }
         
       for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               if (tabla[i][j]== tabla[0][0] ){
                 System.out.print ( "["+tabla[i][j]+"] ");  
               }
                
                 if (tabla[i][j]== tabla[0][1] ){
                 System.out.print ( "["+tabla[i][j]+"] ");  
               }
                 if (tabla[i][j]== tabla[0][2] ){
                 System.out.print ( "["+tabla[i][j]+"] ");  
               }
                  if (tabla[i][j]== tabla[1][0] ){
                 System.out.print ( "["+tabla[i][j]+"] ");  
               }
                  if (tabla[i][j]== tabla[1][1] ){
                 System.out.print ( "["+tabla[i][j]+"] ");  
               }
                  if (tabla[i][j]== tabla[1][2] ){
                 System.out.print ( "["+tabla[i][j]+"] ");  
               }
            }  
                System.out.println ();
       }
       System.out.println("\n----------------------Determiante de la Matriz-----------------------------");
      int determ;
      determ = (tabla[0][0]*tabla[1][1]*tabla[2][2]) + 
               (tabla[0][1]*tabla[1][2]*tabla[2][0]) +
               (tabla[1][0]*tabla[2][1]*tabla[0][2]) -
               (tabla[0][2]*tabla[1][1]*tabla[2][0]) - 
               (tabla[1][0]*tabla[0][1]*tabla[2][2]) - 
               (tabla[1][2]*tabla[2][1]*tabla[0][0]);
       
       //Mostramos su valor
       System.out.println("Det A) =\n((" +tabla[0][0] +"x" +tabla[1][1] +"x" +tabla[2][2] +") =  ("  +(tabla[0][0]*tabla[1][1]*tabla[2][2]) +"))\n  " 
                                  +"          +"
                                  +"\n((" +tabla[0][1] +"x" +tabla[1][1] +"x" +tabla[2][0] +") =  ("  +(tabla[0][1]*tabla[1][2]*tabla[2][0]) +"))\n  " 
                                  +"          +"    
                                  +"\n((" +tabla[1][0] +"x" +tabla[2][1] +"x" +tabla[0][2] +") =  ("  +(tabla[1][0]*tabla[2][1]*tabla[0][2]) +"))\n  " 
                                  +"          -" 
                                  +"\n((" +tabla[0][2] +"x" +tabla[1][1] +"x" +tabla[2][0] +") =  ("  +(tabla[0][2]*tabla[1][1]*tabla[2][0]) +"))\n  " 
                                  +"          -"   
                                  +"\n((" +tabla[1][0] +"x" +tabla[1][0] +"x" +tabla[2][2] +") =  ("  +(tabla[1][0]*tabla[0][1]*tabla[2][2]) +"))\n  " 
                                  +"          -"    
                                  +"\n((" +tabla[1][2] +"x" +tabla[2][1] +"x" +tabla[0][0] +") =  ("  +(tabla[1][2]*tabla[2][1]*tabla[0][0]) +"))\n-------------\n Det Matriz A)=   " +determ );

      }   
        if(fila==2 && columna==2){
        
       System.out.println("\n     Introduce los números en la Tabla de la matriz 2x2 para ver determinate: \n");
       System.out.println("-----------------------------------------------------------------------------------");
         for(int i=0;i<2;i++){
             for(int j=0;j<2;j++){
       System.out.print("A) ["+(i)+"]["+(j)+"]= ");
       tabla[i][j] = tam.nextInt();    
             }
            }
     System.out.println("Esta es la matriz  A) introducida :\n");
       
     for(int i=0;i<2;i++){
             for(int j=0;j<2;j++){
                 
              System.out.print ( " ["+tabla[i][j]+"] ");  
             }
       System.out.println ();
            }
         System.out.println("----------------------------------------------------------------\n");
    System.out.println("Esta es el  proceso paara optener deterimante de la matriz 2x2\n");
    
      System.out.println("(a1,1)  (a1,2) \n(a2,1)  (a2,2)\n");
      System.out.println("det Matriz [N] = ((a1,1) x (a2,2)) -  ((a2,1) x (a1,2))\n ");
       System.out.println("det Matriz [N] = Res1 - Res2 = Determinate  \n");
       System.out.println("-------------------------------------------------------------:\n");
     
   int determ2;
       determ2 = (tabla[0][0] * tabla[1][1]) - (tabla[1][0] * tabla[0][1]);
       System.out.println("operacion y el resulado para sacar la determiante de la matrix 2x2 es : \n");
       System.out.println("Det [A] = ((" +tabla[0][0] +" x " +tabla[1][1] 
      +") = ("+(tabla[0][0] * +tabla[1][1]) +")) - (("+tabla[1][0] +" x " +tabla[0][1] +") "
      + " = ("+(tabla[1][0] * +tabla[0][1]) +"))  = "  +determ2);
     }
        if ((fila!=3 || columna!=3) && (fila!=2 && columna!=2)) {
        System.out.println("--------------------------------------------------------------------------------------------------------------");
            System.out.println("\n\nCheca bien tus varuables determinates que podemis calcular es de 2x2 y 3x3, intenta de nuevo\n\n");
     }
  }
}



