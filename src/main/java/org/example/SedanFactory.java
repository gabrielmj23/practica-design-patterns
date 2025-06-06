package org.example;

public class SedanFactory implements CarroFactory {
    @Override
    public Carro crearCarro(String marca, String color) {
        return new Sedan(marca, color);
    }
}
