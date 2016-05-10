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
public class Ejercicio2 {
    
    public void SumaAcumulada(){
        int num = 0;
        int suma = 0;
        int contador = 0;
        Scanner leer = new Scanner(System.in);
        
        while(contador != 5){
        System.out.println("Eliga un numero : ");
        num = leer.nextInt();
            
        if(num > 20)
            {
                suma = suma + num;
                
                if (num % 2 == 0)
                {
                    contador++;
                }
            }
        }
        
        System.out.println(suma);
        
        
    }
    
}
