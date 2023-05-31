/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ServiceTienda serv = new ServiceTienda();
        int choice = 0;
        System.out.println("MENÚ DE OPCIONES");
        System.out.println("1.- Introducir producto");
        System.out.println("2.- Modificar precio");
        System.out.println("3.- Eliminar producto");
        System.out.println("4.- Mostrar todos los productos");
        System.out.println("5.- Salir");

        while (choice != 5) {
            System.out.println("Elija una opción (1-5):");
            choice = read.nextInt();
            switch (choice) {
                case 1:
                    serv.nuevoProd();
                    break;
                case 2:
                    serv.modPrecio();
                    break;
                case 3:
                    serv.eliminarProd();
                    break;
                case 4:
                    serv.mostrar();
                    break;
                case 5:
                    System.out.println("Hasta la próxima");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
            System.out.println("-----------------------");
        }
    }

}
