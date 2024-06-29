package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.query.Query;
import com.distribuida.entities.Cliente;
@Repository
public class ClienteDAOImpl implements ClienteDAO {
	
	
	
	//SELECT *FROM Cliente --->>SQL
	//from Cliente  --->>HQL
	//SELECT cl.* FROM CLIENTE AS cl --->>> SQL
	//SELECT CL FROM Cliente cl  ----HQL
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	////ACTUALIZACION
	public List<Cliente> findAll(){
		//
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Cliente",Cliente.class).getResultList();
		
	}
	

	@Override
	@Transactional
	public Cliente findOne(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		return session.get(Cliente.class,id);
	}

	@Override
	@Transactional
	public void add(Cliente cliente) {
	Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
	session.saveOrUpdate(cliente);
	
	}

	@Override
	@Transactional
	public void up(Cliente cliente) {
		Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
		session.saveOrUpdate(cliente);
		// TODO Auto-generated method stub

	}

	@Override
	@Transactional
	public void del(int id) {
		Session session=sessionFactory.getCurrentSession();
		session.delete(findOne(id));
		// TODO Auto-generated method stub

	}

}
