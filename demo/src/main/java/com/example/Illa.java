// Responsabilidad: administrar un conjunto de piratas.
// Una isla está compuesta por piratas.

package com.example;

import java.util.Random;

public class Illa {
    // Atributos
    private String nom;
    private Pirata[] piratas;
    private int numeroPiratas;
    private String[] insultos;
    private String[] respostes;
    Random rd;
    Pirata pirata;

    // Constructor
    public Illa(String nom, String[] nomPiratas, String[] insultosDeFuera, String[] respostesDeFuera) {
        this.nom = nom;
        rd = new Random();
        this.insultos = insultosDeFuera;
        this.respostes = respostesDeFuera;

        numeroPiratas = rd.nextInt(3, 8);
        piratas = new Pirata[numeroPiratas]; // contenedor vacío con el tamaño correcto.

        for (int numeroPiratasHechos = 0; numeroPiratasHechos < numeroPiratas; numeroPiratasHechos++) {
            piratas[numeroPiratasHechos] = new Pirata(nomPiratas, 0, this.insultos, this.respostes);

            // Crea piratas nuevos a medida que la variable de piratasHechos aumenta,
            // mediante la clase pirata (variable privada) [con el indice (variable de este
            // for)] y le pasamos los parametros de la clase Pirata
        }
    }

    // Getter / Setter

    public String getNom() {
        return this.nom;
    }

    public int getNumeroPiratas() {
        return numeroPiratas;
    }

    // Métodos
    public Pirata vullUnPirata(int index) { // Quiero un Pirata (indice)
        return piratas[index];
    }

}
/*
 * La classe haurà de tenir un mètode vullUnPirata(index) que farà que el nostre
 * heroi s’enfronti, un per un, a tots els pirates de l’illa. El métode
 * vullUnPirata ha de retornar un objecte de tipus pirata.
 */

// El mètode constructor de l’illa generarà i guardarà els pirates dins l’illa.