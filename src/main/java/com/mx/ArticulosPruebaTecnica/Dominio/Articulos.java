package com.mx.ArticulosPruebaTecnica.Dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**/
@Entity
@Data
@Table(name="Articulos")
@NoArgsConstructor
@AllArgsConstructor

public class Articulos {
	
	@Id
	int id;
	
	@Column(name="NOMBRE_PRODUCTO")
	String nombre;
	
	@Column(name="UNIDAD")
	String unidad;
	@Column(name="CLAVE")

	String clave;
	//
	@Column(name="PRECIO")
	Float precio;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	


	

}
