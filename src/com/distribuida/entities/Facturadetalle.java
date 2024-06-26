package com.distribuida.entities;

import org.springframework.stereotype.Component;

@Component
public class Facturadetalle {
	
	private int idfacturadetalle;
	private int cantidad;
	private Double subtotal;
	private Factura factura;
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
