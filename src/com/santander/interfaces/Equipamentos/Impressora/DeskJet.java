package com.santander.interfaces.Equipamentos.Impressora;

public class DeskJet implements Impressora {

    @Override
    public void imprime() {
        System.out.println("Imprimindo na DeskJet...");
    }
}
