package com.distribuida.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.distribuida.entities.Categoria;

@Repository
public interface CategoriaDAO {
	
	public List<Categoria>findAll();
	
	
	public Categoria findOne(int id);
	public void add(Categoria categoria);
	public void up (Categoria categoria);
	public void del(int id);

	

}
