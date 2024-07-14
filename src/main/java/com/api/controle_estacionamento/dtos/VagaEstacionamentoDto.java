package com.api.controle_estacionamento.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class VagaEstacionamentoDto {

    @NotBlank
    private String numeroDaVaga;

    @NotBlank
    @Size(max = 7)
    private String placaVeiculo;

    @NotBlank
    private String marcaDoVeiculo;

    @NotBlank
    private String modeloDoVeiculo;

    @NotBlank
    private String corDoVeiculo;

    @NotBlank
    private String nomeDoResponsavel;

    @NotBlank
    private String numeroDoApartamento;

    @NotBlank
    private String blocoDoMorador;

    public @NotBlank String getNumeroDaVaga() {
        return numeroDaVaga;
    }

    public void setNumeroDaVaga(@NotBlank String numeroDaVaga) {
        this.numeroDaVaga = numeroDaVaga;
    }

    public @NotBlank @Size(max = 7) String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(@NotBlank @Size(max = 7) String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public @NotBlank String getMarcaDoVeiculo() {
        return marcaDoVeiculo;
    }

    public void setMarcaDoVeiculo(@NotBlank String marcaDoVeiculo) {
        this.marcaDoVeiculo = marcaDoVeiculo;
    }

    public @NotBlank String getModeloDoVeiculo() {
        return modeloDoVeiculo;
    }

    public void setModeloDoVeiculo(@NotBlank String modeloDoVeiculo) {
        this.modeloDoVeiculo = modeloDoVeiculo;
    }

    public @NotBlank String getCorDoVeiculo() {
        return corDoVeiculo;
    }

    public void setCorDoVeiculo(@NotBlank String corDoVeiculo) {
        this.corDoVeiculo = corDoVeiculo;
    }

    public @NotBlank String getNomeDoResponsavel() {
        return nomeDoResponsavel;
    }

    public void setNomeDoResponsavel(@NotBlank String nomeDoResponsavel) {
        this.nomeDoResponsavel = nomeDoResponsavel;
    }

    public @NotBlank String getNumeroDoApartamento() {
        return numeroDoApartamento;
    }

    public void setNumeroDoApartamento(@NotBlank String numeroDoApartamento) {
        this.numeroDoApartamento = numeroDoApartamento;
    }

    public @NotBlank String getBlocoDoMorador() {
        return blocoDoMorador;
    }

    public void setBlocoDoMorador(@NotBlank String blocoDoMorador) {
        this.blocoDoMorador = blocoDoMorador;
    }
}
