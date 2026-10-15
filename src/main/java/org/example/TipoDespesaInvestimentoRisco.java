package org.example;

public class TipoDespesaInvestimentoRisco implements TipoDespesa {

    private static TipoDespesaInvestimentoRisco tipoDespesaInvestimentoRisco = new TipoDespesaInvestimentoRisco();

    private TipoDespesaInvestimentoRisco() {}

    public static TipoDespesaInvestimentoRisco getTipoDespesaInvestimentoRisco() {
        return tipoDespesaInvestimentoRisco;
    }
}