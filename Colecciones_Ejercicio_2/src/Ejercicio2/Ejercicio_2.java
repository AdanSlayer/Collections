/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> perros = new ArrayList();
        Scanner leer = new Scanner(System.in);
        String raza;
        boolean agregar = true;

        while (agregar) {
            System.out.println("Ingresar raza de perro: ");
            raza = leer.nextLine();
            perros.add(raza);
            System.out.println("Agregar otro.(s/n)");
            String respuesta = leer.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                agregar = false;
            }

        }

        System.out.println("Eliminar perro: ");
        String eliminarRaza = leer.nextLine();

        Iterator<String> it = perros.iterator();
        boolean encontrado = false;

        while (it.hasNext()) {
            String perro = it.next();
            if (perro.equals(eliminarRaza)) {
                it.remove();
                encontrado = true;
                break;
            }
        }

        System.out.println("Perros: ");
        for (String perro : perros) {
            System.out.println(perro);
        }
    }
}
