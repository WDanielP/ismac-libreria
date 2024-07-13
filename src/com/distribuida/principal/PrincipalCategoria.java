package com.distribuida.principal;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;

public class PrincipalCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Patron de Ioc o Inversion de control
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("ApplicationContext.xml");//esete es el contenedor
		CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl",CategoriaDAO.class);//este en minuscula si no no funciona
		//add
		Categoria categoria = new Categoria(0,"dasASDASDf","daGRGRs");
		categoriaDAO.add(categoria);
		
	//UPDATE ACTUALIZADO
		
		//Categoria categoria2 = new Categoria (0,"prueba","prueba22");
		//categoriaDAO.up(categoriaDAO.findOne(3));
		//facturaDAO.up(factura2);
		//del BORRADO
		categoriaDAO.del(36);
		//findOne
		
		
		System.out.println("************DEL*******"+categoriaDAO.findOne(36));

		categoriaDAO.findAll().forEach(item -> {System.out.println(item.toString());});
		context.close();

	}
	}


