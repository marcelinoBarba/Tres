/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author marcelino
 */
public class Ejercicio3 {
    
    public void Adivinanza()
    {
        Scanner leer = new Scanner(System.in);
        Random num1 = new Random();
        Random num2 = new Random();
        int a = 0;
        int b = 0;
        int pregunta = 0;
        int respuestaUsuario = 0;
        int contador = 0;
        boolean acierto = false; 
        
        a = num1.nextInt(9)+1;
        b = num2.nextInt(9)+1;
        
        pregunta = a*b;
        
        
        while(contador != 5 && acierto != true){
            
            System.out.println("Cuanto es " + a + "x" + b  );
            respuestaUsuario = leer.nextInt();
            
            if (respuestaUsuario == pregunta){
                acierto = true;
            } 
            
            contador++;
        }
        
        
        if (contador == 5)
        {
            System.out.println("Perdiste :c");
        }
        else{
            System.out.println("Ganaste!!");
        }
        
    }
    
}
