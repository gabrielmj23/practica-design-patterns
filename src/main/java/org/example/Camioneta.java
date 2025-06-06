package org.example;

public class Camioneta extends Carro {
    public Camioneta(String marca, String color) {
        super(marca, color);
    }

    @Override
    public String mostrarDetalle() {
        return "Camioneta con espacio extra y desempeño todoterreno\n- Marca: " + this.marca + "\n- Color: " + this.color;
    }
}
