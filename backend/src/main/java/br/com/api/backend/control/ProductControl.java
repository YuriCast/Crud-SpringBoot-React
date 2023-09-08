package br.com.api.backend.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.backend.model.ProductModel;
import br.com.api.backend.model.ResponseModel;
import br.com.api.backend.service.ProductService;

@RestController
@CrossOrigin(origins = "*")
public class ProductControl {

    @Autowired
    private ProductService ps;

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ResponseModel> delete(@PathVariable long id){
        return ps.delete(id);
    }

    @PutMapping("/change")
    public ResponseEntity<?> change(@RequestBody ProductModel pm){
        return ps.registerChange(pm, "change");
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody ProductModel pm){
        return ps.registerChange(pm, "register");
    }

    @GetMapping("/list")
    public Iterable<ProductModel> list(){
        return ps.list();
    }

    @GetMapping("/")
    public String route(){
        return "API de produtos funcionando";
    }

}
