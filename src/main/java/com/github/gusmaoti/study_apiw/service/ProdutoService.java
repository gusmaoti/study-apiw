package com.github.gusmaoti.study_apiw.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.gusmaoti.study_apiw.model.Produto;
import com.github.gusmaoti.study_apiw.repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> findAll(){
        return produtoRepository.findAll();
    }

    public Produto findById(Long id){
        Optional<Produto> opt = produtoRepository.findById(id);
        if (opt.isPresent()) {
            return opt.get();
        }
        return null;
    }
}
