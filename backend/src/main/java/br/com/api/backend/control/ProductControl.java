package br.com.api.backend.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductControl {

    @GetMapping("/")
    public String rota(){
        return "API de produtos funcionando";
    }

}
