package com.maisprati;

public class Pessoa {
    private String nome;
    private String CPF;

    public Pessoa(String nome){
        this.nome=nome;
    }

    public Pessoa(String nome, String CPF){
        this.nome=nome;
        this.CPF=CPF;
    }
}
