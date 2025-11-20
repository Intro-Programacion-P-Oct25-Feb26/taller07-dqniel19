/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); // Variables
        entrada.useLocale(Locale.US);
        String mensaje = "";
        int contador = 0;
        int suma = 0;
        int valor;
        
        while (contador <= 6) {
            contador = contador + 1;
            valor = (int) (Math.pow(contador, 2) + 1);
            
            mensaje = String.format("%s%s\n", mensaje,valor);
        }
        System.out.printf("%s/n", mensaje);
    }
    
}
