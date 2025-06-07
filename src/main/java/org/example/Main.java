package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de personalización de vehículos:");
        SistemaPersonalizacion sistema = SistemaPersonalizacion.getInstance();
        CarroComponent carro = sistema.createCarro();
        System.out.println(carro.mostrarDetalle());
    }
}