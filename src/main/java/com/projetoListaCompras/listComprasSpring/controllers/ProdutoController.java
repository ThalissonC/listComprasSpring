package com.projetoListaCompras.listComprasSpring.controllers;

import com.projetoListaCompras.listComprasSpring.models.Produto;
import com.projetoListaCompras.listComprasSpring.repositorys.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

//@Controller mostra para o Spring que esta classe é um controlador
//e que ele também é uma página

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping("/")
    public ModelAndView listaProdutos() {
        ModelAndView mv = new ModelAndView("produtos");

        ArrayList<Produto> produtos = new ArrayList<Produto>();

        produtos = (ArrayList<Produto>) produtoRepository.findAll();

        mv.addObject("produtos", produtos);

        return mv;
    }

    @GetMapping("/add")
    public String addProdutoPage(Produto produto){

        return "produtos_add";
    }

    @PostMapping("/add")
    public String addProduto(@Validated Produto produto){
        produtoRepository.save(produto);

        return "redirect:/produtos/";
    }

}
