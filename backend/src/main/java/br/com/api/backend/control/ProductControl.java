package br.com.api.backend.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.backend.model.ProductModel;
import br.com.api.backend.service.ProductService;

@RestController
public class ProductControl {

    @Autowired
    private ProductService ps;

    @GetMapping("/list")
    public Iterable<ProductModel> list(){
        return ps.list();
    }

    @GetMapping("/")
    public String route(){
        return "API de produtos funcionando";
    }

}
