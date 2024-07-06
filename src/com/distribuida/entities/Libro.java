package com.distribuida.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name= "libro")
public class Libro { //siempre la primera en mayuscula
	//@OneToOne
	//@ManyToOne
	//@OneToMany
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name="id_libro")
	private int idLibro;
	@Column(name="titulo")
	private String titulo;
	@Column(name="editorial")
	private String editorial;
	@Column(name="num_paginas")
	private int numpaginas;
	@Column(name="edicion")
	private String edicion;
	@Column(name="idioma")
	private String idioma;
	@Column(name="fecha_publicacion")
	private Date fechapublicacion;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="tipo_pasta")
	private String tipoPasta;
	@Column(name="ISBN")
	private String ISBN;
	@Column(name="num_ejemplares")
	private int numejemplares;
	@Column(name="portada")
	private String portada;
	@Column(name="presentacion")
	private String presentacion;
	@Column(name="precio")
	private Double precio;

	
	//private int idCliente;
	//inyeccion de dependencia de cliente a factura
	
	@JoinColumn(name ="id_categoria")
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})//persisten y detach viene asocado con una insercion de dats
	private Categoria categoria;																			//refressh marge 
	@JoinColumn(name ="id_autor")
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})//persisten y detach viene asocado con una insercion de dats
	private Autor autor;	
	public Libro() {}



	public Libro(int idLibro, String titulo, String editorial, int numpaginas, String edicion, String idioma,
			Date fechapublicacion, String descripcion, String tipoPasta, String iSBN, int numejemplares, String portada,
			String presentacion, Double precio, String string) {

		this.idLibro = idLibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.numpaginas = numpaginas;
		this.edicion = edicion;
		this.idioma = idioma;
		this.fechapublicacion = fechapublicacion;
		this.descripcion = descripcion;
		this.tipoPasta = tipoPasta;
		this.ISBN = iSBN;
		this.numejemplares = numejemplares;
		this.portada = portada;
		this.presentacion = presentacion;
		this.precio = precio;
	
	}



	public int getIdLibro() {
		return idLibro;
	}



	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getEditorial() {
		return editorial;
	}



	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}



	public int getNumpaginas() {
		return numpaginas;
	}



	public void setNumpaginas(int numpaginas) {
		this.numpaginas = numpaginas;
	}



	public String getEdicion() {
		return edicion;
	}



	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}



	public String getIdioma() {
		return idioma;
	}



	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}



	public Date getFechapublicacion() {
		return fechapublicacion;
	}



	public void setFechapublicacion(Date fechapublicacion) {
		this.fechapublicacion = fechapublicacion;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getTipoPasta() {
		return tipoPasta;
	}



	public void setTipoPasta(String tipoPasta) {
		this.tipoPasta = tipoPasta;
	}



	public String getISBN() {
		return ISBN;
	}



	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}



	public int getNumEjemplares() {
		return numejemplares;
	}



	public void setNumEjemplares(int numEjemplares) {
		this.numejemplares = numEjemplares;
	}



	public String getPortada() {
		return portada;
	}



	public void setPortada(String portada) {
		this.portada = portada;
	}



	public String getPresentacion() {
		return presentacion;
	}



	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}



	public Double getPrecio() {
		return precio;
	}



	public void setPrecio(Double precio) {
		this.precio = precio;
	}






	public Categoria getCategoria() {
		return categoria;
	}



	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
		
	}
	



	public int getNumejemplares() {
		return numejemplares;
	}



	public void setNumejemplares(int numejemplares) {
		this.numejemplares = numejemplares;
	}



	public Autor getAutor() {
		return autor;
	}



	public void setAutor(Autor autor) {
		this.autor = autor;
	}



	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", editorial=" + editorial + ", numpaginas="
				+ numpaginas + ", edicion=" + edicion + ", idioma=" + idioma + ", fechapublicacion=" + fechapublicacion
				+ ", descripcion=" + descripcion + ", tipoPasta=" + tipoPasta + ", ISBN=" + ISBN + ", numejemplares="
				+ numejemplares + ", portada=" + portada + ", presentacion=" + presentacion + ", precio=" + precio
				+ ", categoria=" + categoria + ", autor=" + autor + "]";
	}


	
}
