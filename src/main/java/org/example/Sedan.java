package org.example;

public class Sedan extends Carro {
    public Sedan(String marca, String color) {
        super(marca, color);
    }

    @Override
    public String mostrarDetalle() {
        return "Vehiculo Sedan con espacio y confort para la familia\n- Marca: " + this.marca + "\n- Color: " + this.color;
    }
}
