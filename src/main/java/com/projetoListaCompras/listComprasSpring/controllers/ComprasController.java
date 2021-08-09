package com.projetoListaCompras.listComprasSpring.controllers;

import com.projetoListaCompras.listComprasSpring.models.Alimento;
import com.projetoListaCompras.listComprasSpring.repositorys.AlimentoRepository;
import com.projetoListaCompras.listComprasSpring.services.AlimentoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller




public class ComprasController {

//    @RequestMapping("/")
//    public ModelAndView index(){
//        return new ModelAndView("index");
//    }

    @Autowired
    AlimentoRepository alimentoRepository;
    AlimentoService alimentoService;



    @RequestMapping("/")
        public ModelAndView listaAlimentos() {
            ModelAndView mv = new ModelAndView("index");

            ArrayList<Alimento> index = new ArrayList<>();

        index = (ArrayList<Alimento>) alimentoRepository.findAll();

            mv.addObject("index", index);

            return mv;
        }

  // @GetMapping("/add")
    //    public String addAlimentoPage(Alimento alimento) {
    //   return "alimentos";
   // }

    @PostMapping("/")
        public String addAlimento (@Validated Alimento alimento){
        alimentoRepository.save(alimento);

        return "redirect:/index/";
    }

    @RequestMapping("/addNew")
    public String addNew(Alimento alimento){
        alimentoRepository.save(alimento);
        return "redirect:/";

    }

    /*
    @GetMapping("/{id}")
    public String editarAlimentoModel(@PathVariable(value = "id") Long id){

        Alimento alimento = alimentoRepository.findAlimentoById(id);

        return "alimentos";
    }
    */

/*
    @PostMapping("/{id}")
    public String editarAlimento(@PathVariable(value = "id") Long id, Alimento alimento){

        alimento.setId(id);

        alimentoRepository.save(alimento);
        return "redirect:/alimentos/";
    }
*/
    @GetMapping("/getOne")
    @ResponseBody
    public String getOne(Long id){
        return alimentoService.getOne(id).getNome();

    }

    @RequestMapping("/update")
    public String update(Alimento alimento){
        alimentoService.update(alimento);
        return "redirect:/index/";
    }
}

