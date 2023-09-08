package br.com.api.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.backend.model.ProductModel;
import br.com.api.backend.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository pr;

    // Method to validate all products
    public Iterable<ProductModel> list(){
        return pr.findAll();
    }

}
