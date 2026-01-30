/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.pkg1;

/**
 *
 * @author Eduardo
 */
public class Cadenas {

    public static void main(String[] args) {
        String s = "davey mendez alvarez";

        System.out.println("\n");
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            if (c == ' ') {
                System.out.println(" ");
            }
            else {
                  System.out.println(c);      
                        }

            }
        }
    }

