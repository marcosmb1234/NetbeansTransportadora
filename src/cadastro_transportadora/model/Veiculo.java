/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastro_transportadora.model;

/**
 *
 * @author marco
 */
public class Veiculo {
    private int id;
    private String nome;
    private String placa;
    private String modelo;
    private String tipo;
    private double alturaInterna;
    private double larguraInterna;
    private double comprimentoInterno;
    private double capacidadePeso;
    private String observacoes;
public Veiculo() {
    }
    public Veiculo(int id, String nome, String placa, String modelo, String tipo, double alturaInterna, double larguraInterna, double comprimentoInterno, double capacidadePeso, String observacoes) {
        this.id = id;
        this.nome = nome;
        this.placa = placa;
        this.modelo = modelo;
        this.tipo = tipo;
        this.alturaInterna = alturaInterna;
        this.larguraInterna = larguraInterna;
        this.comprimentoInterno = comprimentoInterno;
        this.capacidadePeso = capacidadePeso;
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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    public double getAlturaInterna() {
        return alturaInterna;
    }

    public void setAlturaInterna(double alturaInterna) {
        this.alturaInterna = alturaInterna;
    }

    public double getLarguraInterna() {
        return larguraInterna;
    }

    public void setLarguraInterna(double larguraInterna) {
        this.larguraInterna = larguraInterna;
    }

    public double getComprimentoInterno() {
        return comprimentoInterno;
    }

    public void setComprimentoInterno(double comprimentoInterno) {
        this.comprimentoInterno = comprimentoInterno;
    }

    public double getCapacidadePeso() {
        return capacidadePeso;
    }

    public void setCapacidadePeso(double capacidadePeso) {
        this.capacidadePeso = capacidadePeso;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
}
