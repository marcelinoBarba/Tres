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
import java.util.Random;
public class Ejercicio1 {
    
    public void Dados()
    {
        
        Random lanzamiento = new Random();
        int[] lista = new int[3];
        int tiro = 0;
        int contador = 0;
        
        for(int j=0; j<3; j++)
        {
             tiro = lanzamiento.nextInt(6)+1;
             lista[j] = tiro;
        }
        
        for(int i=0; i<3; i++)
        {    
            if (lista[i] == 6)
            {
              contador++;  
            }
             
        }
        
        if (contador == 0){
            System.out.println("Pesimo");
        }
        
        else if(contador == 1)
        {
            System.out.println("Regular");
        }
        
        else if(contador == 2 )
        {
            System.out.println("Muy Bien");
        }
        
        else if(contador == 3)
        {
            System.out.println("Excelente");
        }
        
       
        
    }
} 
        

