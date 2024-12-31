package br.edu.roni.financas.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.roni.financas.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, UUID> {
    
}
