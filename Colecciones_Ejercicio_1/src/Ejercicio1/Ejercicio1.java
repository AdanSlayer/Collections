/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in).useDelimiter("\n");

        List<String> lista = new ArrayList();
        String pregunta;

        do {
            System.out.println("Ingrese el nombre de la mascota: ");
            String nombre = consola.nextLine();
            System.out.println("Ingrese la raza de la mascota: ");
            String raza = consola.nextLine();
            System.out.println("Ingrese la edad de la mascota: ");
            int edad = consola.nextInt();
            System.out.println("Ingrese el peso de la mascota: ");
            double peso = consola.nextDouble();
            consola.nextLine();
            System.out.println("¿Desea ingresar otra mascota?");
            pregunta = consola.nextLine().toLowerCase();
            lista.add((nombre + " " + raza + " " + edad + " " + peso));
        } while (pregunta.equals("si"));
        
        for (String masco:lista) {
            System.out.println("Mascota " + masco);
        }
    }
}
