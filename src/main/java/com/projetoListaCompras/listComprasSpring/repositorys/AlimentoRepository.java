package com.projetoListaCompras.listComprasSpring.repositorys;


import com.projetoListaCompras.listComprasSpring.models.Alimento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlimentoRepository extends CrudRepository<Alimento, Long> {

    Alimento findAlimentoById(Long id);
    List<Alimento> findAlimentoByNome(String nome);



}
