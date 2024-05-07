package com.santander.interfaces.Equipamentos.Copiadora;

public class Xerox implements Copiadora {

    @Override
    public void copiar() {
        System.out.println("Copiando via Xerox...");
    }
}

