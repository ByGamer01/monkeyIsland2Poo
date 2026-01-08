// Una respuesta pertenece a un heroe
// Un insulto pertenece a un Pirata
// Un grupo de piratas pertenece a una Isla

package com.example;

/*  El héroe NO gestiona la isla ni el orden de combates.
Sólo gestiona sus respuestas y su vida. */

import java.util.Scanner;

public class Heroi extends Personatge implements Fight, Speak {
    // Atributos
    private String nom;
    // nom, vida
    private int vida;
    private boolean viu;
    // Solo hay un heroe, es estatico. (no hay varios que necesiten respuestas
    // personalizadas)
    private String[] respostes;
    protected String respuestaHeroi;

    Scanner sc = new Scanner(System.in);

    // Constructor
    public Heroi(String nom, int vida, String[] respostesDeFuera) {
        super(nom, vida);
        this.nom = nom; // izquierda = destino, derecha = origen.
        this.vida = vida;
        viu = true;

        this.respostes = respostesDeFuera;
    }

    // Getter / Setter

    public String getNom() {
        return nom;
    }

    public String getRespuestaHeroi() {
        return respuestaHeroi;
    }

    public int getVida() {
        return vida;
    }

    public boolean getViu() {
        return viu;
    }

    public String[] getRespostes() {
        return respostes;
    }

    /*
     * Mètode defensar:
     * - En Guybrush tendrá aventatge, como que ja es un pirata experimentat només
     * l’hi
     * surten sempre la meitat de les possibles respostes, però no sempre contindrá
     * la
     * correcte (es aleatori)
     * - Na Elaine, es la primera vegada que s’enfronta als pirates, per tant tendrá
     * totes les
     * possibles respostes
     */

    // Métodos
    public void defensar() {
        // Mostrar las respuestas
        System.out.println("Tus posibles respuestas son estas:");
        for (int index = 0; index < respostes.length; index++) {
            System.out.println(index + 1 + ": " + respostes[index]);
        }
        // Recoger la respuesta
        System.out.println("Introduce tu respuesta:");
        int numeroElegido = sc.nextInt(); // Almacena temporalmente la opción que el usuario ha escogido
        respuestaHeroi = respostes[numeroElegido - 1];
        /*
         * Restar 1 para ajustar al índice del array, imagina que la respuesta del
         * // usuario es la 1, la posicion del array es la 0, por lo que al
         * numeroElegido (respuesta del usuario) se le resta 1 -> 1 - 1 = 0
         */

    }

    public boolean vida() {
        this.vida--;
        if (this.vida == 0) { // si la vida es 0, jugador = muerto
            viu = false;
        }
        return viu;
    }

    public void sayHello() {
        System.out.println("Hola soy Elaine, la governadora. Encantada de conocerte!");
    }

    public void sayGoodBye() {
        System.out.println("Adiós, espero verte pronto por la isla.");
    }

    public void insultar() {

    }
}

// El nostre heroi ha de tenir tota la llista de respostes i mostrar-les a
// l'usuari per a que triï.
