/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); // Variables
        entrada.useLocale(Locale.US);
        String mensaje = "";
        int contador = 0;
        int subcontador = 0;
        int divisor = 3;
        int valor = 1;
        double total;
        
        while (contador <=6) {
            if (subcontador%2!=1) {
            mensaje = String.format("%s- %d/%d ", mensaje, valor, divisor);
            divisor = divisor + 2;
            contador = contador + 1;
            subcontador = subcontador + 1; }
            else {
            mensaje = String.format("%s+ %d/%d ", mensaje, valor, divisor);
            divisor = divisor + 2;
            contador = contador + 1;
            subcontador = subcontador + 1; }
            
            }
        total = 1 - 1.0/3 + 1.0/5 - 1.0/7 + 1.0/9 - 1.0/11 + 1.0/13 - 1.0/15;
        System.out.printf("1 %s\nTotal: %.3f\n", mensaje, total);
        
                
    }
    
}
