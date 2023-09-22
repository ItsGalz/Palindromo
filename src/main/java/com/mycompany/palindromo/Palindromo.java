
package com.mycompany.palindromo;

import com.sun.source.tree.BreakTree;
import java.util.Scanner;


public class Palindromo {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el texto: ");
        
        String oracion = leer.nextLine().toLowerCase();
        
        System.out.println(esPalindromo(oracion));
   
    }
    public static boolean esPalindromo (String oracion){
    boolean rs = true;
    
    oracion = oracion.replace(" ", "").replace("á", "a")
            .replace("é", "e").replace("í ", "i")
            .replace("ó", "o").replace("ú", "u"
            .replace("!", "")).replace(",", "")
            .replace("¡", "");
    
        for (int i = 0; i < oracion.length(); i++){
        if (oracion.charAt(i) != oracion.charAt(oracion.length()-1-i)) {
            rs = false;
            break;
        }
    
   
        }
         return rs;
    }
}
