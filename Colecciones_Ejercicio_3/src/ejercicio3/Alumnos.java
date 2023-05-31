package ejercicio3;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Alumnos {
    public ArrayList<Integer> notas= new ArrayList();
    public ArrayList<String> alumn;

    public Alumnos() {
        this.alumn = new ArrayList();
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public ArrayList<String> getAlumn() {
        return alumn;
    }

    public void setAlumn(ArrayList<String> alumn) {
        this.alumn = alumn;
    }


  
}
