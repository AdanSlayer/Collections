/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class ServiceAlumnos {

    Alumnos student = new Alumnos();
    Scanner read = new Scanner(System.in);
    String answer, nombre;

    public void crearAlumno() {
        boolean add = true;
        while (add) {
            System.out.println("Ingrese el nombre del alumno: ");
            nombre = read.next();
            student.alumn.add(nombre);
            System.out.println("¿Desea agregar otro alumno? (S/N): ");
            answer = read.next();
            if (answer.equalsIgnoreCase("n")) {
                add = false;
            }
        }
    }

    public void findAlumno() {
        System.out.println("Encontrar alumno");
        String padawan = read.next();
        Iterator<String> it = student.alumn.iterator();
        int c = 0;
        while (it.hasNext()) {
            if (it.next().equals(padawan)) {
                c++;
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Ingrese la nota " + i + " del alumno ");
                    int nota = read.nextInt();
                    student.notas.add(nota);
                }
                notaFinal();
            }
        }
        if (c == 0) {
            System.out.println("No está inscrito");
        }

    }

    public void notaFinal() {
        double prom = 0;
        for (int i = 0; i < 3; i++) {
            prom += student.getNotas().get(i);
        }
        System.out.println("el promedio es: " + prom / 3);

    }

}
