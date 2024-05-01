package com.santander.interfaces.Equipamentos.Impressora;

public class LaserJet implements Impressora {

    @Override
    public void imprime() {
        System.out.println("Imprimindo na LaserJet...");
    }
}

