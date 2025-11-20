/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in); // Variables
        entrada.useLocale(Locale.US);
        int contador = 1;
        String mensaje = ""; // Variables
        String listadoEdad = "";
        String nombre;
        String posc;
        int edad;
        double estatura;
        double promedioEdad = 0;
        double promedioEstat = 0;
        
        while (contador <=5) {
            System.out.println("Ingrese nombre del jugador"); // Ingreso de datos
            nombre = entrada.nextLine();
            System.out.println("Ingrese posición del jugador");
            posc = entrada.nextLine();
            System.out.println("Ingrese edad del jugador");
            edad = entrada.nextInt();
            System.out.println("Ingrese estatura del jugador");
            estatura = entrada.nextDouble();
            entrada.nextLine();
            
            promedioEdad = promedioEdad + edad; // Sacar valores
            promedioEstat = promedioEstat + estatura;
            
            mensaje = String.format("%s%d. %s -%s-, edad %d, estatura %.2f\n", // Concatenar cadenas
                    mensaje, contador, nombre, posc, edad, estatura);
            listadoEdad = String.format("%s%d\n", listadoEdad, edad);
            
            contador = contador + 1;
        }
        promedioEdad = promedioEdad / 5;
        promedioEstat = promedioEstat / 5;
        
            System.out.printf("\nListado de jugadores \n%s"
                    + "Listado de Edades \n%s"
                    + "Promedio de edades: %.1f\n"
                    + "Promedio de estatura: %.2f\n", 
                    mensaje, listadoEdad, promedioEdad, promedioEstat);
        
    }
    
}
