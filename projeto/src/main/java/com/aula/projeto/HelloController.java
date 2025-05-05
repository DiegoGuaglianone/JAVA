package com.aula.projeto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/p1")
    public String pagina1(){
        return "p1";
    }

    @GetMapping("/p2")
    public String pagina2(){
        return "p2";
    }
}
