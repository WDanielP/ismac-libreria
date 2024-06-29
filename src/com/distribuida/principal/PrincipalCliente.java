package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Patron de Ioc o Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");//esete es el contenedor
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl",ClienteDAO.class);
		//CRUD CREEATE READ UPDATE Y DELETE
		//add
		Cliente cliente = new Cliente (0,"1708658909","juan","taipe","0983155184","yaruqui","taipe@correo.com");
		//clienteDAO.add(cliente);
		
		//UPDATE
		
		Cliente cliente2 = new Cliente (40,"1724185408","juan2","taipe2","0987312980","yaruqui2","taip2e@correo.com");
		//clienteDAO.up(cliente2);
		
		
		//del
		clienteDAO.del(40);
		//findOne
		
		
		System.out.println("************DEL*******"+clienteDAO.findOne(40));
		//findAll
		//List<Cliente> clientes= clienteDAO.findAll();	
		clienteDAO.findAll().forEach(item -> {System.out.println(item.toString());});
				
		context.close();
	}
	

}
                           