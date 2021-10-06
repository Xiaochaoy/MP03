package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args){
        Alumne alumne = new Alumne();
        Alumne[] listaAlumnes = new Alumne[5];
        //List<Alumne> llista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            listaAlumnes[i] = new Alumne("Pere" + i, "DAM");
        }

        List<Alumne> lista = Arrays.asList(listaAlumnes);

        for (int j = 0; j < listaAlumnes.length; j++) {
            System.out.println(lista.get(j));
        }

        for (Alumne a: listaAlumnes){
            System.out.println(a);
        }

        lista.forEach(System.out::println);

        if (listaAlumnes[0].equals(listaAlumnes[1])) System.out.println("Son iguals");
        else System.out.println("No igual");
    }
}
