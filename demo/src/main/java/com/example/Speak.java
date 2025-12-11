package com.example;

public interface Speak { // Podria ser protected al estar en el mismo paquete, pero si trabajaramos con otros programadores (compañeros) tendría que ser public
    void sayHello();
    
    void sayGoodBye();
}
