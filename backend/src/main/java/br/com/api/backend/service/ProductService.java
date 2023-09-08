package br.com.api.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.api.backend.model.ResponseModel;
import br.com.api.backend.model.ProductModel;
import br.com.api.backend.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository pr;

    @Autowired
    private ResponseModel rm;

    // Method to validate all products
    public Iterable<ProductModel> list() {
        return pr.findAll();
    }

    // Method to register or change products
    public ResponseEntity<?> registerChange(ProductModel pm, String act){

        if(pm.getName().equals("")){
            rm.setMessage("O nome do produto é obrigatório");
            return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
        }else if(pm.getBrand().equals("")){
            rm.setMessage("O nome da marca é obrigatório");
            return new ResponseEntity<ResponseModel>(rm, HttpStatus.BAD_REQUEST);
        }else{
            if(act.equals("register")){
                return new ResponseEntity<ProductModel>(pr.save(pm), HttpStatus.CREATED);
            }else{
                return new ResponseEntity<ProductModel>(pr.save(pm), HttpStatus.OK);
            }
        }

    }

    //Method to delete products
    public ResponseEntity<ResponseModel> delete(long id){

        pr.deleteById(id);

        rm.setMessage("O produto foi removido com sucesso!");
        return new ResponseEntity<ResponseModel>(rm, HttpStatus.OK);

    }

}
