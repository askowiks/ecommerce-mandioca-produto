package com.letscode.santander.ecommercemandioca.service;

import com.letscode.santander.ecommercemandioca.dto.PrecoDto;
import com.letscode.santander.ecommercemandioca.model.Produto;
import com.letscode.santander.ecommercemandioca.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository repository;

    public List<Produto> listar() {
        return repository.findAll();
    }

    public Produto procurar(Integer id) {
        return repository.findById(id).get();
    }

    private Produto salvar(Integer id, Produto paraSalvar) {
        if (id != null && procurar(id) != null) {
            paraSalvar.setId(id);
        }

        return repository.save(paraSalvar);
    }

    public Produto adicionar(Produto novo) {
        return salvar(null, novo);
    }

    public Produto atualizar(Integer id, Produto atualizado) {
        return salvar(id, atualizado);
    }

    public Produto atualizarQuantidade(Integer id, Integer quantidade) {
        Produto procurado = procurar(id);
        procurado.setQuantidade(quantidade);
        return salvar(id, procurado);
    }

    public Produto atualizarPreco(Integer id, PrecoDto novoPreco) {
        Produto procurado = procurar(id);
        procurado.setPreco(novoPreco.getValor());
        return salvar(id, procurado);
    }

    public Produto apagar(Integer id) {
        Produto paraExcluir = procurar(id);
        repository.delete(paraExcluir);
        return paraExcluir;
    }

}
