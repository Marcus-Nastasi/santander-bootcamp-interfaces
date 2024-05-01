package com.santander.interfaces.Estabelecimento;

import com.santander.interfaces.Equipamentos.Copiadora.Copiadora;
import com.santander.interfaces.Equipamentos.Copiadora.Xerox;
import com.santander.interfaces.Equipamentos.Digitalizadora.Digitalizadora;
import com.santander.interfaces.Equipamentos.Digitalizadora.Scanner;
import com.santander.interfaces.Equipamentos.EquipamentoMultifunc.EquipamentoMultifunc;
import com.santander.interfaces.Equipamentos.Impressora.Impressora;
import com.santander.interfaces.Equipamentos.Impressora.LaserJet;

public class Main {

    public static void main(String[] args) {
        Impressora impressora = new LaserJet();
        impressora.imprime();

        Digitalizadora digitalizadora = new Scanner();
        digitalizadora.digitaliza();

        Copiadora copiadora = new Xerox();
        copiadora.copiar();

        EquipamentoMultifunc equipamentoMultifunc = new EquipamentoMultifunc();
        equipamentoMultifunc.imprime();
        equipamentoMultifunc.copiar();
        equipamentoMultifunc.digitaliza();
    }
}


