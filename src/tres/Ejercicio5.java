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
public class Ejercicio5 {
    
    public void MayorMenor(){
        Scanner leer = new Scanner(System.in);
        int N = 0;
        int respuesta = 0;
        boolean acierto = false;
        
        System.out.print("Dame N ");
        N = leer.nextInt();
        
        while(acierto != true){
            
            System.out.print("Adivina N ");
            respuesta = leer.nextInt();
            
                    if (respuesta == N)
            {
                acierto = true;
                System.out.println("Ganaste!!");
            }
            
            if (respuesta < N)
            {
                System.out.println("Es mayor");
            }
            
            if (respuesta > N)
            {
                System.out.println("Es menor");
            }    
        }
    }
    
}
