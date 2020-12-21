package com.projeto.gestaoestoque.model.enums;

public enum TipoMovimentacao {
	ENTRADA("entrada"),
    SAIDA("saida"),
    ACERTO("acertoEstoque");

    private String descricao;

    private TipoMovimentacao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
