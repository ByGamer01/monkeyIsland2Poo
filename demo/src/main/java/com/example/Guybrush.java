package com.example;

import java.util.*;

public class Guybrush extends Heroi {
    Random rd;
    private String nom;
    private int indiceAleatorioRespuestas;
    private int vida;
    private boolean viu;
    private String[] respostes;
    private String[] mitadRespuestas;
    private int numeroRespuesta;
    private int mitad;
    private int indice;
    protected String respuestaElegida;

    public Guybrush(String nom, int vida, String[] respostesDeFuera) {
        super(nom, vida, respostesDeFuera);
        rd = new Random();
        this.nom = nom; // izquierda = destino, derecha = origen.
        this.vida = vida;
        viu = true;

        this.respostes = respostesDeFuera;
    }

    @Override
    public void defensar() {
        // Mostrar las respuestas
        System.out.println("Tus posibles respuestas son estas:");

        mitad = respostes.length / 2; /*
                                       * mitad de las respuestas, queremos que cada vez se reinicien las posibles
                                       * respuestas. Si se quedaran en el constructor siempre se
                                       * mostrarian/imprimirian las mismas
                                       */
        mitadRespuestas = new String[mitad];

        for (int i = 0; i < mitad; i++) { // Las respuestas que se muestran, dentro de ellas no esta garantizada la
                                          // correcta.
            indice = rd.nextInt(respostes.length);
            mitadRespuestas[i] = respostes[indice];
            System.out.println((i + 1) + ". " + mitadRespuestas[i]);
            /*
             * Esto hace que se imprimen en lista sucesiva/progresiva nuestras respuestas
             * elegidas.
             */
        }

        // Recoger la respuesta
        System.out.println("Introduce tu respuesta:");
        int numeroElegido = sc.nextInt() - 1;
        // Almacena temporalmente la opción que el usuario ha escogido, si el
        // usuario escribe 1 el insulto estaria en posicion 0, resultando en que
        // posicion de la respuesta deberia de ser 0.

        respuestaElegida = mitadRespuestas[numeroElegido]; // Privacidad para todo el paquete, 
        // ya que esta respuesta la tendremos que comprar luego.

        /*
         * Restar 1 para ajustar al índice del array, imagina que la respuesta del
         * // usuario es la 1, la posicion del array es la 0, por lo que al
         * numeroElegido (respuesta del usuario) se le resta 1 -> 1 - 1 = 0
         */
    }

    @Override
    public boolean vida() {
        this.vida = this.vida - 2; // Esta es la parte que cambia respecto al padre. Guybrush pierde dos vidas
        if (this.vida == 0) { // si la vida es 0, jugador = muerto
            viu = false;
        }
        return viu;
    }

    @Override // Lo sobreescribimos debido a que el padre/madre utiliza los mismos metodos, y nosotros cambiamos el contenido dentro de ellos
    public void sayHello() {
        System.out.println("Me llamo Guybrush Threepwood y ¡Quiero ser pirata!");
    }

    @Override
    public void sayGoodBye() {
        System.out.println("Zarpamos hacia costas extrañas... una nueva aventura en el horizonte se divisa en lontananza...");
    }
}
