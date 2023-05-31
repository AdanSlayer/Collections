/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ServiceTienda {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Producto item = new Producto();

    HashMap<String, Double> grocery = new HashMap();

    public void nuevoProd() {
        System.out.println("Ingrese el nombre del producto:");
        String item = read.nextLine();
        System.out.println("Ingrese el precio del producto:");
        Double price = read.nextDouble();
        read.nextLine();
        grocery.put(item, price);
    }

    public void modPrecio() {
        System.out.println("Ingrese el producto que desea modificar: ");
        String item2 = read.nextLine();
        System.out.println("Ingrese el nuevo precio: ");
        Double price2 = read.nextDouble();
        read.nextLine();
        if (grocery.containsKey(item2)) {
            grocery.replace(item2, price2);
            System.out.println("El nuevo precio es: $" + price2);
        }
    }

    public void eliminarProd() {
        System.out.print("Introduzca el producto que desea eliminar: ");
        String delete = read.nextLine();
        if (grocery.containsKey(delete)) {
            grocery.remove(delete);
            System.out.println(delete + " ha sido eliminado");
        } else {
            System.out.println(delete + " no se encuentra en el inventario");
        }
    }

    public void mostrar() {
        for (Map.Entry<String, Double> entry : grocery.entrySet()) {
            String Key = entry.getKey();
            Double Value = entry.getValue();
            System.out.println("Producto: " + Key + ", Precio:  $" + Value);
        }
    }
}
