package br.com.rafaelelias.todolist.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api")
public class Controller1 {

    /**
     * GET - Buscar informação
     * Post - Adicionar informação
     * Put - Atualizar informação
     * Delete - Deletar informação  
     * Patch - Atualizar informação específica
     * 
     */
    @GetMapping("")
    public String primeiraMensagem() {
          
         return "Hello World!";

    }

}
