package org.example;

import java.util.Scanner;

public class SistemaPersonalizacion {
    public static SistemaPersonalizacion instance;

    private SistemaPersonalizacion() {}

    public static SistemaPersonalizacion getInstance() {
        if (instance == null) {
            System.out.println("Creando SistemaPersonalizacion");
            instance = new SistemaPersonalizacion();
        } else {
            System.out.println("El sistema ya existe");
        }
        return instance;
    }

    public CarroComponent createCarro() {
        Scanner in = new Scanner(System.in);
        // Datos iniciales
        System.out.print("Ingrese la marca del carro: ");
        String marca = in.nextLine();
        System.out.print("Ingrese la color del carro: ");
        String color = in.nextLine();
        // Tipo de carro
        System.out.print("Ingrese el tipo de carro en minúsculas (sedan, convertible, camioneta, camion): ");
        String tipo = in.nextLine();
        while (!tipo.equals("convertible") && !tipo.equals("camioneta") && !tipo.equals("camion") && !tipo.equals("sedan")) {
            System.out.println("Tipo de carro invalido");
            System.out.print("Ingrese el tipo de carro (sedan, convertible, camioneta, camion): ");
            tipo = in.nextLine();
        }
        // Crear el factory correspondiente
        CarroFactory factory = null;
        switch (tipo) {
            case "convertible":
                factory = new ConvertibleFactory();
                break;
            case "camioneta":
                factory = new CamionetaFactory();
                break;
            case "sedan":
                factory = new SedanFactory();
                break;
            case "camion":
                factory = new CamionFactory();
                break;
            default:
                System.out.println("Tipo de carro invalido");
                return null;
        }
        // Características adicionales
        System.out.print("Agregar sistema de sonido? (s/n): ");
        boolean usarSonido = in.nextLine().equalsIgnoreCase("s");

        System.out.print("Agregar asientos de cuero? (s/n): ");
        boolean usarAsientos = in.nextLine().equalsIgnoreCase("s");

        System.out.print("Agregar paquete de seguridad? (s/n): ");
        boolean usarSeguridad = in.nextLine().equalsIgnoreCase("s");

        // Construir con decoradores
        CarroComponent carro = factory.crearCarro(marca, color);
        if (usarSonido) {
            carro = new SistSonidoDecorator(carro);
        }
        if (usarAsientos) {
            carro = new AsientosCueroDecorator(carro);
        }
        if (usarSeguridad) {
            carro = new PaqueteSeguridadDecorator(carro);
        }

        return carro;
    }
}
