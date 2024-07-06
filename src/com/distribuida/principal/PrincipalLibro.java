package com.distribuida.principal;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;

import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Libro;
public class PrincipalLibro {	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		//Patron de Ioc o Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");//esete es el contenedor
		LibroDAO LibroDAO = context.getBean("libroDAOImpl",LibroDAO.class);
		CategoriaDAO categoriaDAO=context.getBean("categoriaDAOImpl",CategoriaDAO.class);
		AutorDAO autorDAO=context.getBean("autorDAOImpl",AutorDAO.class);
		//CRUD CREEATE READ UPDATE Y DELETE
		//add
		Libro libro = new Libro (0,"asdaf" ,"dd", 20, "afafa", "asdafg",new Date(), "afggr", "afagr", "afgwer", 20, "afwe", "affgwe",20.5,"fafas");
		libro.setCategoria(categoriaDAO.findOne(2));
		libro.setAutor(autorDAO.findOne(2));
		LibroDAO.add(libro);
		
		//UPDATE
		//Libro Libro2 = new Libro (55,"Carlos","Carrasco","Ecuador","calle24111","0987312980","taipe@correo.com");
		//LibroDAO.up(Libro2);
		
		//del
		//LibroDAO.del(79);
		//findOne
		System.out.println("************DEL*******"+LibroDAO.findOne(79));
		//findAll
		//List<Libro> Libros= LibroDAO.findAll();	
		LibroDAO.findAll().forEach(item -> {System.out.println(item.toString());});
				
		context.close();
	}
	

}
                           