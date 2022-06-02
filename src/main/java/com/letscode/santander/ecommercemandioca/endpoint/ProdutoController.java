package com.letscode.santander.ecommercemandioca.endpoint;

import com.letscode.santander.ecommercemandioca.dto.PrecoDto;
import com.letscode.santander.ecommercemandioca.model.Produto;
import com.letscode.santander.ecommercemandioca.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    ProdutoService service;

    @GetMapping
    public List<Produto> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Produto procurar(
            @PathVariable Integer id
    ) {
        return service.procurar(id);
    }

    @PostMapping
    public Produto adicionar(
            @RequestBody Produto novo
    ) {
        return service.adicionar(novo);
    }

    @PutMapping("/{id}")
    public Produto atualizar(
            @PathVariable Integer id,
            @RequestBody Produto atualizado
    ) {
        return service.atualizar(id, atualizado);
    }

    @PatchMapping("/{id}/{quantidade}")
    public Produto atualizarQuantidade(
            @PathVariable Integer id,
            @PathVariable Integer quantidade
    ) {
        return service.atualizarQuantidade(id, quantidade);
    }

    @PatchMapping("/{id}")
    public Produto atualizarPreco(
            @PathVariable Integer id,
            @RequestBody PrecoDto novoPreco
    ) {
        return service.atualizarPreco(id, novoPreco);
    }

    @DeleteMapping("/{id}")
    public Produto apagar(
            @PathVariable Integer id
    ) {
        return service.apagar(id);
    }

}
