package com.distribuida.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.distribuida.entities.Cliente;


@Repository
public interface ClienteDAO {
	
	public List<Cliente>findAll();
	
	
	public Cliente findOne(int id);
	public void add(Cliente cliente);
	public void up (Cliente cliente);
	public void del(int id);
}
