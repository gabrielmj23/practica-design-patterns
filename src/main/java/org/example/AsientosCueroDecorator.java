package org.example;

public class AsientosCueroDecorator extends CarroDecorator {
    public AsientosCueroDecorator(CarroComponent envoltura) {
        super(envoltura);
    }

    @Override
    public String mostrarDetalle() {
        return envoltura.mostrarDetalle() + "\n- Con asientos de cuero";
    }
}
