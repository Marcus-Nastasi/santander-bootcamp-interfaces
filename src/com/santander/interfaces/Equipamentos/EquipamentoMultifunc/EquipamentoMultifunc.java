package com.santander.interfaces.Equipamentos.EquipamentoMultifunc;

import com.santander.interfaces.Equipamentos.Copiadora.Copiadora;
import com.santander.interfaces.Equipamentos.Digitalizadora.Digitalizadora;
import com.santander.interfaces.Equipamentos.Impressora.Impressora;

public class EquipamentoMultifunc implements Impressora, Copiadora, Digitalizadora {

    @Override
    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional...");
    }

    @Override
    public void digitaliza() {
        System.out.println("Digitalizando via equipamento multifuncional...");

    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo via equipamento multifuncional...");
    }
}

