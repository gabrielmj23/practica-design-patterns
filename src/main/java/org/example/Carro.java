package org.example;

public abstract class Carro implements CarroComponent {
    protected String marca;
    protected String color;

    public Carro(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    @Override
    public abstract String mostrarDetalle();
}
