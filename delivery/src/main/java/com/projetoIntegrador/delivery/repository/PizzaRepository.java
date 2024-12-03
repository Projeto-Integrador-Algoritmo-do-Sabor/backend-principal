package com.projetoIntegrador.delivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.projetoIntegrador.delivery.model.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza,Long>{

public List<Pizza> findAllBySaborContainingIgnoreCase(@Param("sabor") String sabor);

}
