/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro_transportadora.model;

/**
 *Classe para a embalagem, com seus dado
 * @author marco
 */
 
public class Embalagem {
    private Produto produtoAssociado;
    private String tipo;
    private double altura;
    private double largura;
    private double comprimento;
    private double peso;
    private boolean empilhavel;
    private String observacoes;
    
    public Embalagem() {
    }
    public Embalagem(Produto produtoAssociado, String tipo, double altura, double largura, double comprimento, double peso, boolean empilhavel, String observacoes) {
        this.produtoAssociado = produtoAssociado;
        this.tipo = tipo;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
        this.peso = peso;
        this.empilhavel = empilhavel;
        this.observacoes = observacoes;
    }

    public Produto getProdutoAssociado() {
        return produtoAssociado;
    }

    public void setProdutoAssociado(Produto produtoAssociado) {
        this.produtoAssociado = produtoAssociado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public boolean isEmpilhavel() {
        return empilhavel;
    }

    public void setEmpilhavel(boolean empilhavel) {
        this.empilhavel = empilhavel;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
}
