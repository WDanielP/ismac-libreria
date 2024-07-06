package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.ClienteDAO;
import com.distribuida.dao.FacturaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Libro;
import com.distribuida.entities.Facturadetalle;

public class PrincipalFacturadetalle {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Patron de Ioc o Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");//esete es el contenedor
		Facturadetalle FacturadetalleDAO = context.getBean("facturadetalleDAOImpl",Facturadetalle.class);
		FacturaDAO facturaDAO=context.getBean("facturaDAOImpl",FacturaDAO.class);
		LibroDAO libroDAO=context.getBean("libroDAOImpl",LibroDAO.class);
		//CRUD CREEATE READ UPDATE Y DELETE
		//add
		Facturadetalle facturadetalle = new Facturadetalle ();
		Facturadetalle.setFactura(facturaDAO.findOne(2));
		FacturadetalleDAO.add(facturadetalle);
		
		//UPDATE ACTUALIZADO
		
		//Factura factura2 = new Factura (86,"FAC-0091",new Date(),23.32,5.32,30.62);
		//factura2.setCliente(clienteDAO.findOne(3));
		//facturaDAO.up(factura2);
		
		//del BORRADO
		facturaDAO.del(86);
		//findOne
		
		
		System.out.println("************DEL*******"+facturaDAO.findOne(86));
		//findAll
		//List<Factura> Facturas= FacturaDAO.findAll();	
		facturaDAO.findAll().forEach(item -> {System.out.println(item.toString());});
				
		context.close();
	}
	

}
                           