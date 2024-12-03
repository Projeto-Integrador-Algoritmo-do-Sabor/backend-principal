package com.projetoIntegrador.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.projetoIntegrador.delivery.model.Pizza;
import com.projetoIntegrador.delivery.repository.PizzaRepository;

import java.util.List;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {

    @Autowired
    private PizzaRepository repository;

    
    @GetMapping
    public List<Pizza> listar() {
        return repository.findAll();
    }

    
    @GetMapping("/{id}")
    public ResponseEntity<Pizza> buscarPorId(@PathVariable Long id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

  
    @PostMapping
    public ResponseEntity<Pizza> criar(@RequestBody Pizza pizza) {
        if (pizza == null) {
            return ResponseEntity.badRequest().build();
        }
        Pizza novaPizza = repository.save(pizza);
        return ResponseEntity.status(201).body(novaPizza);  // Retorna com status 201 Created
    }

    
    @PutMapping("/{id}")
    public ResponseEntity<Pizza> atualizar(@PathVariable Long id, @RequestBody Pizza pizza) {
        return repository.findById(id).map(existingPizza -> {
            existingPizza.setSabor(pizza.getSabor());
            existingPizza.setValor(pizza.getValor());
            existingPizza.setDescricao(pizza.getDescricao());
            existingPizza.setTamanho(pizza.getTamanho());
            Pizza pizzaAtualizada = repository.save(existingPizza);
            return ResponseEntity.ok(pizzaAtualizada);
        }).orElse(ResponseEntity.notFound().build());
    }

    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return ResponseEntity.noContent().build();  // Retorna com status 204 No Content
        }
        return ResponseEntity.notFound().build();
    }

   
    @GetMapping("/sabor/{sabor}")
    public List<Pizza> buscarPorSabor(@PathVariable String sabor) {
        return repository.findAllBySaborContainingIgnoreCase(sabor);
    }
}
