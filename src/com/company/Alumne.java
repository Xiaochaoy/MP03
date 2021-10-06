package com.company;

import java.util.Objects;

public class Alumne {
    private String nom;
    private int nota;
    private String cicle;


    public Alumne(String nom, String cicle){
        this.nom = nom;
        this.cicle = cicle;
    }

    public Alumne(){}

    public String getNom() {return nom;}

    public void setNom(String nom){
        if (nom.length()>10) System.out.println("Massa llarg");
        else this.nom = nom;
    }
    public int getNota() {return nota;}
    public void setNota(int nota) {this.nota = nota;}

    @Override
    public String toString(){
        return nom + "," + cicle;
    }
    @Override
    public boolean equals(Object o){
        Alumne a = (Alumne) o;
        if (nom.equals(a.getNom())) return true;
        else return false;


        //if (this == o) return true;
        //if (o == null || getClass() != o.getClass()) return false;
        //Alumne alumne = (Alumne) o;
        //return  Objects.equals(nom, alumne.nom);
    }
    @Override
    public int hashCode(){
        return Objects.hash(nom);
    }
}
