package com.letscode.santander.ecommercemandioca.repository;

import com.letscode.santander.ecommercemandioca.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
