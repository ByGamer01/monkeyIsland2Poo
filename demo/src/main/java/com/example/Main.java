// David Gil Rosa
// 48782911A
// DAM 25 1r
// Game: The Secret of the Monkey Island
// MonkeyIsland with POO ("Programacion orientada a objetos")



package com.example;

public class Main {
    public static void main(String[] args) {
        String[] insultos = {
                "Ugh.. Hoy con brazo poderoso a doce hombres he vencido.", // 0
                "Tengo músculos en lugares que no conoces ni de nombre.",
                "Ríndete ahora o te aplastaré como a un tomate.",
                "Aargh.. Mi fuerza asombrosa te romperá el cúbito en mil pedazos.",
                "Aaarg... Eh!. ¡Mira allí!.",
                "¡A pulpos he vencido con estos fuertes brazos!.",
                "Veo que en tu boca asoma una mueca de agonía.",
                "Arrrgh... Mi bisabuela de 98 años tiene mejores biceps que tu.",
                "Uuggh... ¡Eres el bicho mas feo que en mi vida haya encontrado!...",
                "Luchas como un ganadero" // Insulto de LeChuck // 9
        };
        String[] respostes = {
                "Grrr... Al ver el tamaño de tu barriga, diríase que te los has comido.", // 0
                "Aarrgh... Lástima que no tengas ninguno en los brazos.",
                "Me rendiría si eso me evitara tener que mirarte.",
                "Grrrr... No me imaginaba que supieras contar hasta tan alto.",
                "Uugh.. Si, si, ya se. Es un mono de tres cabezas.",
                "Tu poder sin duda doblega a todo invertebrado.",
                "Es que tu toquecito me hace reír de cosquillas.",
                "Ugh... si pero tanto ella como yo tenemos mejor control de la vejiga que tú.",
                "Me asombra que nunca a tu mujer hayas mirado.",
                "Qué apropiado, tú peleas como una vaca" // Respuesta de LeChuck // 9
        };
        String[] nomPiratas = {
                "Blackbeard",
                "Calico Jack",
                "Anne Bonny",
                "Bartholomew Roberts",
                "Mary Read",
                "Henry Morgan",
                "Edward Low",
                "Stede Bonnet",
                "Charles Vane"
        };
        int index;
        boolean pirataViu;
        boolean heroeViu;
        String respostaHeroi;
        System.out.println("\nDeep in the Caribbean\n");
        System.out.println();
        System.out.println("----------------------- ╬ MONKEY ISLAND ╬ --------------------");
        System.out.println();
        System.out.println(
                "\n\n Ø ¡Bienvenido Aventurero! Ø\n\n ¤ El juego consiste en sobrevivir a los insultos de los piratas. \n Responde correctamente para ganar puntos y avanzar de ronda. \n Pero cuidado, si fallas perderás vidas. ¤ \n\n £ Si te quedas sin vidas, solo te esperará la muerte, piratilla! £ ");

        Heroi heroi = new Heroi("Gumbruh", 10, respostes);
        Illa isla = new Illa("Cuba", nomPiratas, insultos, respostes);

        System.out.println("\n\nBienvenido a la isla de los Piratas: " + isla.getNom() + "");

        System.out.println("\n\nLucharás contra: " + isla.getNumeroPiratas() + " piratas.\n"
                + "\nCada uno tendra entre 1 y 3 vidas." + "\nGanas al derrotar todos los piratas de la isla!"
                + "\n\n▓Buena suerte, piratilla! ▓");

        System.out.println("Tu nombre es: " + heroi.getNom() + "\n");

        System.out.println("¡Prepárate para enfrentarte al primer pirata!\n");

        Pirata pirata;

        heroeViu = heroi.getViu();
        index = 0;
     //   pirata = new Pirata("nom", 1, nomPiratas, index, insultos, respostes);
        Heroi heroi1 = new Guybrush("Guybrush", 10, respostes);
        heroi1.defensar();

        }
}
    /*     while (index < isla.getNumeroPiratas() && heroeViu) { // Condicion principal: mientras queden piratas y el heroe este vivo
            pirata = isla.vullUnPirata(index); // Cogemos el pirata de la isla segun el index
            pirataViu = pirata.getViu(); // Actualizamos la variable de si esta vivo el pirata (ya que fuera lo cogemos tambien)

            while (pirataViu && heroeViu) { // Le damos una pequeña intro del pirata, al jugador
                System.out.println("Te estás enfrentando al pirata: " + pirata.getNom());
                heroeViu = heroi.getViu(); // Actualizamos el dato de si esta vivo el jugador
                // metodo insultar
                pirata.insultar();
                System.out.println(); // espacio para que se vea mas bonito :D
                // Aquí el héroe debe responder despues de la impresion del insulto se muestran
                // todas las respuestas
                respostaHeroi = heroi.defensar(); // cogemos la respuesta del usuario y la comparamos con la respuesta propia del insulto propio del pirata

                // Comprobamos si la respuesta del usuario es correcta o no
                if (pirata.replica(respostaHeroi)) {
                    pirata.vida(); // Vida Jugador
                    System.out.println("Has acertado! Al pirata le quedan " + pirata.getVida() + " vidas.");
                } else {
                    heroi.vida();
                    System.out.println("Has fallado! Te quedan " + heroi.getVida() + " vidas.");
                }
                if (heroi.getVida() == 0) {
                    System.out.println("¡Has sido derrotado, piratilla! Has muerto.");
                    heroeViu = false;
                } else if (pirata.getVida() == 0) {
                    pirataViu = false;
                }
            }
            index++;
        }
        // Cuando acabamos el juego, imprimimos esto si al jugador le quedan vidas
        if (heroi.getVida() > 0) {
            System.out.println("Has ganado, piratilla!");
            System.out.println("Derrotaste a: " + isla.getNumeroPiratas() + " piratas.");
            System.out.println("Te quedaron: " + heroi.getVida() + " vidas restantes.");
        }
        
    }
} */
/*
 * Es crea un objecte Heroi i un objecte Illa.
 * 
 * 
 * L’illa genera aleatòriament un conjunt de pirates.
 * 
 * 
 * El nostre heroi s’enfronta, un per un, a tots els pirates de l’illa.
 * 
 * 
 * En cada combat, els dos personatges fan la batalla d’insults.
 * El pirata insulta.
 * L’heroi (usuari) contesta.
 * Si l’heroi encerta la resposta, el pirata perd vida. Si l’heroi falla,
 * l’heroi perd vida.
 * Guanya la batalla el que queda amb vida.
 * 
 * 
 * Si el Heroe arriba al final de l’Illa, guanya. Si mor antes, perd.
 * 
 */ 

