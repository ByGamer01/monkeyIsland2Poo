package com.example;
// En el hijo hay que poner las diferencias con respecto al padre
public class LeChuck extends Pirata {
    
    // Atributos exclusivos de LeChuck
    private String[] insultosLeChuck = new String[4];
    private String[] respostesLeChuck = new String[4];

    private String nomPropi;
    private int vidaPropia;
    

    public LeChuck(String nom, int vida, String[] nomPiratas, int vidaDeFuera, String[] insultosDeFuera, String[] respostesDeFuera) {
        super(nom, vida, nomPiratas, vidaDeFuera, insultosDeFuera, respostesDeFuera);
        this.nomPropi = nom;
        this.vidaPropia = vida * 2;
        for (int i = 0; i < insultosPropis.length; i++) { // Me rellena los insultos de LeChuck con los que saca el pirata normal
            this.insultosLeChuck[i] = insultosPropis[i]; // izquierda = destino, derecha = origen.
            this.respostesLeChuck[i] = respostesPropies[i];
        }
        this.insultosLeChuck[4] = insultosDeFuera[9];
        this.respostesLeChuck[4] = respostesDeFuera[9];

    }
    public String setNom(String nom) {
        this.nom = "LeChuck";
        return this.nom;
    }
    public int getVida() {
        return this.vidaPropia;
    }

    // Metodos
    @Override
    public void insultar() {
        // Coger aleatorio del array de insultos propios.
        indiceElegido = rd.nextInt(insultosLeChuck.length);
        insultoElegido = insultosLeChuck[indiceElegido];
        System.out.println(insultoElegido);
    }
}
