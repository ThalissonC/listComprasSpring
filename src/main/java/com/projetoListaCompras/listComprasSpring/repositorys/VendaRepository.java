package com.projetoListaCompras.listComprasSpring.repositorys;

import com.projetoListaCompras.listComprasSpring.models.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {

}
