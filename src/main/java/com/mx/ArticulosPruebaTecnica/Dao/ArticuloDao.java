package com.mx.ArticulosPruebaTecnica.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mx.ArticulosPruebaTecnica.Dominio.Articulos;

@Repository
public interface ArticuloDao  extends CrudRepository<Articulos, Integer>{

}
