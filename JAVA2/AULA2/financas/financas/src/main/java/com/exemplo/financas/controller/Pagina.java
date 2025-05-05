package com.exemplo.financas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pagina {
    
    @GetMapping("\teste")
    public String teste(){
        return "Teste de rota";
    }
}
