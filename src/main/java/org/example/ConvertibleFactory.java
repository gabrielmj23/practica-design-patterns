package org.example;

public class ConvertibleFactory implements CarroFactory {
    @Override
    public Carro crearCarro(String marca, String color) {
        return new Convertible(marca, color);
    }
}
