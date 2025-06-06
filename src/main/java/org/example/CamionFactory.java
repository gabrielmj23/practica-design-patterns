package org.example;

public class CamionFactory implements CarroFactory {
    @Override
    public Carro crearCarro(String marca, String color) {
        return new Camion(marca, color);
    }
}
