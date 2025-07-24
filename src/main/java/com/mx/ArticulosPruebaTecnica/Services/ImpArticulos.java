package com.mx.ArticulosPruebaTecnica.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.ArticulosPruebaTecnica.Dao.ArticuloDao;
import com.mx.ArticulosPruebaTecnica.Dominio.Articulos;

@Service
public class ImpArticulos  implements MetodosArticulos{
	
	@Autowired
	ArticuloDao dao;

	@Override
	public void guardar(Articulos articulo) {
		dao.save(articulo);
		System.out.println("Articulo guardado");
		
		
	}

	@Override
	public void editar(Articulos articulo) {
		dao.save(articulo);
		System.out.println("Articulo editado");		
	}

	@Override
	public void eliminar(Articulos articulo) {
		dao.delete(articulo);
		System.out.println("Articulo eliminado");		
	}

	@Override
	public Articulos buscar(Articulos articulo) {
		return dao.findById(articulo.getId()).orElse(null);
	}

	@Override
	public List<Articulos> listar() {
		return (List<Articulos>) dao.findAll();
	}
	
	

}
