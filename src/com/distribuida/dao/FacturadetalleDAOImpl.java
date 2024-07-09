package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.distribuida.entities.Facturadetalle;
@Repository
public class FacturadetalleDAOImpl implements FacturadetalleDAO {
	
	
	
	//SELECT *FROM Facturadetalle --->>SQL
	//from Facturadetalle  --->>HQL
	//SELECT cl.* FROM Facturadetalle AS cl --->>> SQL
	//SELECT CL FROM Facturadetalle cl  ----HQL
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	@Transactional
	////ACTUALIZACION
	public List<Facturadetalle> findAll(){
		//
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Facturadetalle",Facturadetalle.class).getResultList();
		
	}
	
	

	@Override
	@Transactional
	public Facturadetalle findOne(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.getCurrentSession();
		return session.get(Facturadetalle.class,id);
	}

	@Override
	@Transactional
	public void add(Facturadetalle Facturadetalle) {
	Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
	session.saveOrUpdate(Facturadetalle);
	
	}

	@Override
	@Transactional
	public void up(Facturadetalle Facturadetalle) {
		Session session=sessionFactory.getCurrentSession();	// TODO Auto-generated method stub
		session.saveOrUpdate(Facturadetalle);
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
