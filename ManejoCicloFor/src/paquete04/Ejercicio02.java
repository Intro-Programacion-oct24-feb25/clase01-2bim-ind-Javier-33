/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class Ejercicio02 {
     public static void main(String[] args) {
        
        int contador = 0;
        for(double f = 20; f <= 100; f+=4){
            double c;
            contador += +1;
            c = ((5.0/9.0)*(f - 32));
            System.out.printf("Operacion(%d)Fahrenheit: %.2f ===> Celcius: %.2f\n",
                    contador,
                    f,
                    c);
             
         }
             
                    
                     
                     
                 
             
             
         
    }
}
