package com.distribuida.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name= "facturadetalle")
public class Facturadetalle {
	//@OneToOne
	//@ManyToOne
	//@OneToMany
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int idfacturadetalle;
	private int cantidad;
	private Double subtotal;

	@JoinColumn(name ="id_factura")
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})//persisten y detach viene asocado con una insercion de dats
	private Factura factura;																			//refressh marge 
	@JoinColumn(name ="id_libro")
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})//persisten y detach viene asocado con una insercion de dats
	private Libro libro;	
	
	public Facturadetalle() {
		
	}

	public Facturadetalle(int idfacturadetalle, int cantidad, Double subtotal, int idfactura, int libro) {
	
		this.idfacturadetalle = idfacturadetalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		
	}

	public int getIdfacturadetalle() {
		return idfacturadetalle;
	}

	public void setIdfacturadetalle(int idfacturadetalle) {
		this.idfacturadetalle = idfacturadetalle;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}





	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	@Override
	public String toString() {
		return "Facturadetalle [idfacturadetalle=" + idfacturadetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", factura=" + factura + ", libro=" + libro + "]";
	}
	

}
