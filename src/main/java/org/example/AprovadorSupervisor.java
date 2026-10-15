package org.example;

public class AprovadorSupervisor extends Aprovador {

    public AprovadorSupervisor(Aprovador superior) {
        listaDespesas.add(TipoDespesaViagem.getTipoDespesaViagem());
        setAprovadorSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Supervisor";
    }
}