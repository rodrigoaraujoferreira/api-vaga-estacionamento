package com.api.controle_estacionamento.services;

import com.api.controle_estacionamento.models.VagaEstacionamentoModel;
import com.api.controle_estacionamento.repositories.VagaEstacionamentoRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class VagaEstacionamentoService {

    final VagaEstacionamentoRepository vagaEstacionamentoRepository;

    public VagaEstacionamentoService(VagaEstacionamentoRepository vagaEstacionamentoRepository) {
        this.vagaEstacionamentoRepository = vagaEstacionamentoRepository;
    }

    @Transactional
    public VagaEstacionamentoModel salvar(VagaEstacionamentoModel vagaEstacionamentoModel) {
        return vagaEstacionamentoRepository.save(vagaEstacionamentoModel);
    }
}
