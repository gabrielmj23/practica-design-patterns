package org.example;

public class Camion extends Carro {
    public Camion(String marca, String color) {
        super(marca, color);
    }

    @Override
    public String mostrarDetalle() {
        return "Camión para el transporte de mercancía\n- Marca: " + this.marca + "\n- Color: " + this.color;
    }
}
