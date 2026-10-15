package org.example;

public class TipoDespesaAquisicaoEmpresa implements TipoDespesa {

    private static TipoDespesaAquisicaoEmpresa tipoDespesaAquisicaoEmpresa = new TipoDespesaAquisicaoEmpresa();

    private TipoDespesaAquisicaoEmpresa() {}

    public static TipoDespesaAquisicaoEmpresa getTipoDespesaAquisicaoEmpresa() {
        return tipoDespesaAquisicaoEmpresa;
    }
}