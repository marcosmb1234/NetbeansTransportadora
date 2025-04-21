/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro_transportadora.model;

/**
 *
 * @author marco
 */
public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private String familia;
    private String tipo;
    private String lote;
    private double altura;
    private double largura;
    private double comprimento;
    private double peso;
    private String grauFragilidade;
    private String observacoes;

    public Produto() {
    }

    public Produto(int id, String nome, String descricao, String familia, String tipo, String lote, double altura, double largura, double comprimento, double peso, String grauFragilidade, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.familia = familia;
        this.tipo = tipo;
        this.lote = lote;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.peso = peso;
        this.grauFragilidade = grauFragilidade;
        this.observacoes = observacoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGrauFragilidade() {
        return grauFragilidade;
    }

    public void setGrauFragilidade(String grauFragilidade) {
        this.grauFragilidade = grauFragilidade;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    
}

