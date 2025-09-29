package com.mycompany.livraria.model;

public class Livro {
    private int liv_codigo;    // PK
    private int edi_codigo;    // FK
    private String liv_assunto;
    private String liv_ISBN;
    private int liv_estoque;

    // Construtor
    public Livro(int liv_codigo, int edi_codigo, String liv_assunto, String liv_ISBN, int liv_estoque) {
        this.liv_codigo = liv_codigo;
        this.edi_codigo = edi_codigo;
        this.liv_assunto = liv_assunto;
        this.liv_ISBN = liv_ISBN;
        this.liv_estoque = liv_estoque;
    }

    // Getters e Setters
    public int getLiv_codigo() {
        return liv_codigo;
    }

    public void setLiv_codigo(int liv_codigo) {
        this.liv_codigo = liv_codigo;
    }

    public int getEdi_codigo() {
        return edi_codigo;
    }

    public void setEdi_codigo(int edi_codigo) {
        this.edi_codigo = edi_codigo;
    }

    public String getLiv_assunto() {
        return liv_assunto;
    }

    public void setLiv_assunto(String liv_assunto) {
        this.liv_assunto = liv_assunto;
    }

    public String getLiv_ISBN() {
        return liv_ISBN;
    }

    public void setLiv_ISBN(String liv_ISBN) {
        this.liv_ISBN = liv_ISBN;
    }

    public int getLiv_estoque() {
        return liv_estoque;
    }

    public void setLiv_estoque(int liv_estoque) {
        this.liv_estoque = liv_estoque;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "liv_codigo=" + liv_codigo +
                ", edi_codigo=" + edi_codigo +
                ", liv_assunto='" + liv_assunto + '\'' +
                ", liv_ISBN='" + liv_ISBN + '\'' +
                ", liv_estoque=" + liv_estoque +
                '}';
    }
}
