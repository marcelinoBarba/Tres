/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres;

import java.util.Scanner;

/**
 *
 * @author marcelino
 */
public class Ejercicio4 {
    
    public void figura(){
     
        int tope = 0;
        int contador = 0;
        int contador2 = 0;
        
        System.out.print("Dame n ");
        Scanner leer = new Scanner(System.in);
        tope= leer.nextInt();
        contador2 = tope;
        
        for (int i = 0; i < tope; i++) {
            
            System.out.println();
            contador++;
            contador2--;
            
            for (int j = 0; j < contador; j++) {
                System.out.print("*");
            
            }
            
            System.out.print(" ");
            
            for (int k = contador2; k >= 0; k--) {
                System.out.print("*"); 
            }
            
                    
        }
        
        
        
    }
    
}
