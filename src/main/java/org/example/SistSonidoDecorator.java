package org.example;

public class SistSonidoDecorator extends CarroDecorator {
    public SistSonidoDecorator(Carro carro) {
        super(carro);
    }

    @Override
    public String mostrarDetalle() {
        return this.envoltura.mostrarDetalle() + "\n- Con sistema de sonido SONY";
    }
}
