package com.example;

public abstract class Personatge {
    protected String nom;
    protected int vida;

    public Personatge(String nom, int vida) { // Atributos de él mismo, y su hijo necesitará estos atributos
        this.nom = nom;
        this.vida = vida;
    }

    public abstract boolean vida(); // Queremos que el programador utilice el metodo vida.
}
