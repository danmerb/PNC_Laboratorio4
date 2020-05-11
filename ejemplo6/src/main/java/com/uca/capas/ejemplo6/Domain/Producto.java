package com.uca.capas.ejemplo6.Domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	
	@Size(message="El nombre no debe tener mas de 15 caracteres", max=15)
	@NotEmpty(message="El nombre no debe estar vacio")
	private String nombre;
	@Size(message="La descripcion no debe tener mas de 30 caracteres", max=30)
	@NotEmpty(message="La descripcion no debe estar vacio")
	private String descripcion;
	@NotNull(message="El campo no puede estar vacio")
	@Min(value=0, message="El precio no debe ser negativo")
	private Double precio;
	@Pattern(regexp = "^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$", message="El formato de la fecha debe ser dd/mm/yyyy")
	@NotEmpty(message="La fecha no puede estar vacio")
	private String vencimiento;
	
	public Producto(String nombre,String descripcion, Double precio, String vencimiento){
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.vencimiento = vencimiento;
	}
	
	
	public Producto() {
		
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getVencimiento() {
		return vencimiento;
	}
	public void setVencimiento(String vencimiento) {
		this.vencimiento = vencimiento;
	}

}