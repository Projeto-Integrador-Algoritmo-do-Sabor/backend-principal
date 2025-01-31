package com.projetoIntegrador.delivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.projetoIntegrador.delivery.model.Tipo;

public interface TipoRepository extends JpaRepository<Tipo, Long>{
	
	public List<Tipo> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);

}
