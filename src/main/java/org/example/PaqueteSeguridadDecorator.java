package org.example;

public class PaqueteSeguridadDecorator extends CarroDecorator {
    public PaqueteSeguridadDecorator(CarroComponent envoltura) {
        super(envoltura);
    }

    @Override
    public String mostrarDetalle() {
        return envoltura.mostrarDetalle() + "\n- Con paquete de máxima seguridad";
    }
}
