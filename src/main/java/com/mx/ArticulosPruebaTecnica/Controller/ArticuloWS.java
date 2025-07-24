package com.mx.ArticulosPruebaTecnica.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ArticulosPruebaTecnica.Dominio.Articulos;
import com.mx.ArticulosPruebaTecnica.Services.ImpArticulos;

@RestController
@RequestMapping("api/articulos")
@CrossOrigin
public class ArticuloWS {
	
	@Autowired
	ImpArticulos imp;
	
	@GetMapping("listar")
	public ResponseEntity<?> listar(){
		return ResponseEntity.ok(imp.listar());
	}
	
	@PostMapping("guardar")
	public ResponseEntity<?> guardar(@RequestBody Articulos articulo){
		imp.guardar(articulo);
		
		return new ResponseEntity<String>("Articuo guadado",HttpStatus.OK);
	}
	
	@DeleteMapping("eliminar")
	public ResponseEntity<?> eliminar(@RequestBody Articulos articulo){
		imp.eliminar(articulo);
		
		return new ResponseEntity<String>("Articulo eliminado",HttpStatus.OK);
	}

	@PutMapping("editar")
	public ResponseEntity<?> editar(@RequestBody Articulos articulo){
		imp.editar(articulo);
		
		return new ResponseEntity<String>("Articulo editado",HttpStatus.OK);
	}
	
	@GetMapping("buscar")
	public ResponseEntity<?> buscarId(@RequestBody Articulos articulo){
			return ResponseEntity.ok(imp.buscar(articulo));
		}
		


}
