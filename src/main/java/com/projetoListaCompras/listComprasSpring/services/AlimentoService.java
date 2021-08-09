package com.projetoListaCompras.listComprasSpring.services;

import com.projetoListaCompras.listComprasSpring.models.Alimento;
import com.projetoListaCompras.listComprasSpring.repositorys.AlimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlimentoService {

    @Autowired
    private AlimentoRepository alimentoRepository;

    public Alimento getOne(Long id) {
        return alimentoRepository.findAlimentoById(id);
    }

    public void update(Alimento alimento) {

        alimentoRepository.save(alimento);
    }


}