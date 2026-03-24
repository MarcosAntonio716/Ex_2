package com.example.Base.service;

import com.example.Base.entity.Produto;
import com.example.Base.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    // Criar produto
    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    // Listar todos
    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    // Buscar por ID
    public Optional<Produto> buscarPorId(Long id) {
        return repository.findById(id);
    }

    // Deletar por ID
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}