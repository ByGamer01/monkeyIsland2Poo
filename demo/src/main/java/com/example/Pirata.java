package com.example;

// La lógica de combate del pirata, está dentro del pirata.
// Sólo actúa durante un combate. No sabe nada de las otras clases.

import java.util.Random;

public class Pirata extends Personatge implements Fight, Speak {

    /*
     * Array cuadruple: dos grandes categorías: insultos y respuestas
     * un array pequeños que contienen 3 insultos propios exclusivos de un pirata
     * otro array pequeño que contiene las respuestas a esos insultos propios -> respuestas propias
     */

    // Atributos
    Random rd;
    protected boolean viu;
    protected int indiceAleatorio;
    protected int indiceAleatorio1;
    protected int indiceAleatorio2;
    protected String[] insultos; // Puede ser constante, ya que nunca cambia en ningun momento del programa, pero como tengo que cambiar su nombre en todos los archivos donde se haya usado, no lo hare (ocurre lo mismo con sus respuestas)
    protected String[] respostes;
    protected String[] insultosPropis = new String[3]; // Ins Propios del pirata (mismo indice que sus respuestas propias)
    protected String[] respostesPropies = new String[3];
    protected int indiceElegido;
    protected String insultoElegido;

    // Constructor

    public Pirata(String nom, int vida, String[] nomPiratas, int vidaDeFuera, String[] insultosDeFuera, String[] respostesDeFuera) {
        super(nom, vida);
        viu = true;
        rd = new Random();
        this.nom = nomPiratas[rd.nextInt(nomPiratas.length)]; // este nombre viene de fuera tambien como los insultos y respuestas
        this.vida = rd.nextInt(1, 4); // Vida Aleatoria 1 y 3

        this.insultos = insultosDeFuera; //Array de insultos (main) -> variable de array pasada en el parametro del constructor (insultosDeFuera)
        this.respostes = respostesDeFuera; // igual que lo insultos

        // Tirar el dado, y coger respuesta/insulto aleatorio

        indiceAleatorio = rd.nextInt(insultosDeFuera.length - 1);
        insultosPropis[0] = insultosDeFuera[indiceAleatorio];
        respostesPropies[0] = respostesDeFuera[indiceAleatorio];


        // Dado 2
        indiceAleatorio1 = rd.nextInt(insultosDeFuera.length - 1);
        while (indiceAleatorio1 == indiceAleatorio) {
            indiceAleatorio1 = rd.nextInt(insultosDeFuera.length - 1);
        }
        insultosPropis[1] = insultosDeFuera[indiceAleatorio1];
        respostesPropies[1] = respostesDeFuera[indiceAleatorio1];

        // Dado 3
        indiceAleatorio2 = rd.nextInt(insultosDeFuera.length - 1);
        while (indiceAleatorio2 == indiceAleatorio || indiceAleatorio2 == indiceAleatorio1) {
            indiceAleatorio2 = rd.nextInt(insultosDeFuera.length - 1);
        }
        insultosPropis[2] = insultosDeFuera[indiceAleatorio2];
        respostesPropies[2] = respostesDeFuera[indiceAleatorio2];

    }

    // Getter / Setter
    public String getNom() {
        return this.nom;
    }
    public int getVida() {
        return vida;
    }
    public boolean getViu() {
        return viu;
    }
    // Métodos

    public void insultar() {
        // Coger aleatorio del array de insultos propios.
        indiceElegido = rd.nextInt(insultosPropis.length);
        insultoElegido = insultosPropis[indiceElegido];
        System.out.println(insultoElegido);
    }

    public boolean replica(String respostaHeroi) {
        return respostesPropies[indiceElegido].equals(respostaHeroi); // si la respuesta propia del indice elegido, del pirata es igual a la respuesta que eligio el heroe/usuario
    }

    public boolean vida() {
        this.vida--;
        if (this.vida == 0) { // si la vida es 0, jugador = muerto
            viu = false;
        }
        return viu;
    }

    
    public void defensar() {
        // No existe para él
    }

    public void sayHello() {

    }
    
    public void sayGoodBye() {

    }

   
}