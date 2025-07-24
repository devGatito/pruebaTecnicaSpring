package com.mx.ArticulosPruebaTecnica.Services;

import java.util.List;

import com.mx.ArticulosPruebaTecnica.Dominio.Articulos;

public interface MetodosArticulos {
	void guardar(Articulos articulo);
	void editar(Articulos articulo);
	void eliminar(Articulos articulo);
	Articulos buscar(Articulos articulo);
	List<Articulos> listar();

}
