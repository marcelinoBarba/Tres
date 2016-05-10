/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres;

/**
 *
 * @author marcelino
 */
public class Ejercicio6 {
    
    public void Tarjeta(){
        double deudaActual = 6000;
        double intereses = 0.15;
        int mes = 0;
        
        while(deudaActual <= 55000){
            mes++;
            deudaActual += deudaActual * intereses;

        }
        
        System.out.println(mes + " Meses");
    }
}
