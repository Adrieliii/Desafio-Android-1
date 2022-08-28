package com.example.recyclerview.model;

import java.io.Serializable;

public class Pais implements Serializable {

    private final String nome;
    private final String imagem;



    public Pais(String nome, String descricao, String imagem) {

        this.nome = nome;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public String getImagem(){
        return imagem;
    }


}
