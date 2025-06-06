package org.example;

public abstract class CarroDecorator implements CarroComponent {
    protected CarroComponent envoltura;

    public CarroDecorator(CarroComponent envoltura) {
        this.envoltura = envoltura;
    }

    public abstract String mostrarDetalle();
}
