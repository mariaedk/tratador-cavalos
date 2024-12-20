package com.tratador.cavalo.domain.model;

public enum TipoAlimentacao {

    RACAO(DomainConfig.getProperty("tipo.alimentacao.racao")),
    SAL(DomainConfig.getProperty("tipo.alimentacao.sal")),
    LEGUMES(DomainConfig.getProperty("tipo.alimentacao.legumes"));

    private String denominacao;

    TipoAlimentacao(String denominacao) {
        this.denominacao = denominacao;
    }

    public String getDenominacao() {
        return denominacao;
    }

    public void setDenominacao(String denominacao) {
        this.denominacao = denominacao;
    }
}
