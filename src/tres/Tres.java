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
public class Tres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int menu = 0;
        
        Ejercicio1 e1 = new Ejercicio1();
        Ejercicio2 e2 = new Ejercicio2(); 
        Ejercicio3 e3 = new Ejercicio3();
        Ejercicio4 e4 = new Ejercicio4();
        Ejercicio5 e5 = new Ejercicio5();
        Ejercicio6 e6 = new Ejercicio6();
        
        System.out.print("Eliga el problema: ");
        menu = leer.nextInt();
        
        switch(menu)
        {
            case 1:
                e1.Dados();
            break;
            
            case 2:
                e2.SumaAcumulada();
            break;
            
            case 3: 
                e3.Adivinanza();
            break;
            
            case 5:
                e5.MayorMenor();
            break;
            
            case 4:
                e4.figura();
            break;
            
            case 6:
                e6.Tarjeta();
            break;
        }
                
    }
    
}
