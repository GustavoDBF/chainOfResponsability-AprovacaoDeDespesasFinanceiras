package org.example;

public class TipoDespesaTreinamento implements TipoDespesa {

    private static TipoDespesaTreinamento tipoDespesaTreinamento = new TipoDespesaTreinamento();

    private TipoDespesaTreinamento() {}

    public static TipoDespesaTreinamento getTipoDespesaTreinamento() {
        return tipoDespesaTreinamento;
    }
}