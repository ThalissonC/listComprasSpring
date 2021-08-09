package com.projetoListaCompras.listComprasSpring.repositorys;

import com.projetoListaCompras.listComprasSpring.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
