package com.example;
// En el hijo hay que poner las diferencias con respecto al padre
public class LeChuck extends Pirata {
    
    // Atributos exclusivos de LeChuck
    private String insultoEspecial;
    private String nomPropi;
    private int vidaPropia;
    

    public LeChuck(String nom, int vida, String[] nomPiratas, int vidaDeFuera, String[] insultosDeFuera, String[] respostesDeFuera) {
        super(nom, vida, nomPiratas, vidaDeFuera, insultosDeFuera, respostesDeFuera);
        this.nomPropi = nom;
        this.vidaPropia = vida * 2;
        

    }

    public int getVida() {
        return this.vidaPropia;
    }
}
