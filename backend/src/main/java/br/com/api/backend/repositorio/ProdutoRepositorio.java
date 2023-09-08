package br.com.api.backend.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.api.backend.modelo.ProdutoModelo;

@Repository
public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Long>{
    
}