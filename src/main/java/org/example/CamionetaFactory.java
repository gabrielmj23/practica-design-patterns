package org.example;

public class CamionetaFactory implements CarroFactory {
    @Override
    public Carro crearCarro(String marca, String color) {
        return new Camioneta(marca, color);
    }
}
