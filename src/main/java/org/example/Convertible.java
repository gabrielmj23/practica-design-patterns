package org.example;

public class Convertible extends Carro {
    public Convertible(String marca, String color) {
        super(marca, color);
    }

    @Override
    public String mostrarDetalle() {
        return "Vehiculo Convertible con lujo y velocidad\n- Marca: " + this.marca + "\n- Color: " + this.color;
    }
}
