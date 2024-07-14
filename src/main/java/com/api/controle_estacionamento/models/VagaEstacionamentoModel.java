package com.api.controle_estacionamento.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_VAGA_ESTACIONAMENTO")
public class VagaEstacionamentoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 10)
    private String numeroDaVaga;

    @Column(nullable = false, unique = true, length = 10)
    private String placaVeiculo;

    @Column(nullable = false, length = 50)
    private String marcaDoVeiculo;

    @Column(nullable = false, length = 50)
    private String modeloDoVeiculo;

    @Column(nullable = false, length = 20)
    private String corDoVeiculo;

    @Column(nullable = false)
    private LocalDateTime dataDoRegistro;

    @Column(nullable = false, length = 150)
    private String nomeDoResponsavel;

    @Column(nullable = false, length = 30)
    private String numeroDoApartamento;

    @Column(nullable = false, length = 30)
    private String blocoDoMorador;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNumeroDaVaga() {
        return numeroDaVaga;
    }

    public void setNumeroDaVaga(String numeroDaVaga) {
        this.numeroDaVaga = numeroDaVaga;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getMarcaDoVeiculo() {
        return marcaDoVeiculo;
    }

    public void setMarcaDoVeiculo(String marcaDoVeiculo) {
        this.marcaDoVeiculo = marcaDoVeiculo;
    }

    public String getModeloDoVeiculo() {
        return modeloDoVeiculo;
    }

    public void setModeloDoVeiculo(String modeloDoVeiculo) {
        this.modeloDoVeiculo = modeloDoVeiculo;
    }

    public String getCorDoVeiculo() {
        return corDoVeiculo;
    }

    public void setCorDoVeiculo(String corDoVeiculo) {
        this.corDoVeiculo = corDoVeiculo;
    }

    public LocalDateTime getDataDoRegistro() {
        return dataDoRegistro;
    }

    public void setDataDoRegistro(LocalDateTime dataDoRegistro) {
        this.dataDoRegistro = dataDoRegistro;
    }

    public String getNomeDoResponsavel() {
        return nomeDoResponsavel;
    }

    public void setNomeDoResponsavel(String nomeDoResponsavel) {
        this.nomeDoResponsavel = nomeDoResponsavel;
    }

    public String getNumeroDoApartamento() {
        return numeroDoApartamento;
    }

    public void setNumeroDoApartamento(String numeroDoApartamento) {
        this.numeroDoApartamento = numeroDoApartamento;
    }

    public String getBlocoDoMorador() {
        return blocoDoMorador;
    }

    public void setBlocoDoMorador(String blocoDoMorador) {
        this.blocoDoMorador = blocoDoMorador;
    }
}
