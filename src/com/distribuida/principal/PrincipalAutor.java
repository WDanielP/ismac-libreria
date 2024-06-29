package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class PrincipalAutor {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//Patron de Ioc o Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");//esete es el contenedor
		AutorDAO autorDAO = context.getBean("autorDAOImpl2",AutorDAO.class);
		//CRUD CREEATE READ UPDATE Y DELETE
		//add
		Autor autor = new Autor (0,"Juan","Taipe","Argentina","calle1","0983155184","taipe@correo.com");
		//autorDAO.add(autor);
		
		//UPDATE
		Autor autor2 = new Autor (55,"Carlos","Carrasco","Ecuador","calle24111","0987312980","taipe@correo.com");
		autorDAO.up(autor2);
		
		//del
		//autorDAO.del(40);
		//findOne
		System.out.println("************DEL*******"+autorDAO.findOne(40));
		//findAll
		//List<Autor> Autors= AutorDAO.findAll();	
		autorDAO.findAll().forEach(item -> {System.out.println(item.toString());});
				
		context.close();
	}
	

}
                           