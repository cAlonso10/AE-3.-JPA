package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.entidad.Autor;
import modelo.entidad.Direccion;
import modelo.entidad.Editorial;
import modelo.entidad.Libreria;
import modelo.entidad.Libro;


public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
		EntityManager em = emf.createEntityManager();
		
		
		//Autores
		Autor a1 = new Autor(null, "Gabriel", "García Márquez", null, null);
		a1.setFecha(new Date(27,2,6));
		Autor a2 = new Autor(null, "Jane", "Austen", null, null);
		a2.setFecha(new Date(75,12,16));
		Autor a3 = new Autor(null, "Stephen", "King", null, null);
		a3.setFecha(new Date(47,9,21));
		
		//Editoriales
		Editorial e1 = new Editorial(null, "Penguin Random House", null, null);
		Direccion d1 = new Direccion();
		d1.setTipoVia("Calle");
		d1.setNombreVia("Luchana");
		d1.setCiudad("Madrid");
		e1.setDireccion(d1);
		Editorial e2 = new Editorial(null, "Harper Collins", null, null);
		Direccion d2 = new Direccion();
		d2.setTipoVia("Calle");
		d2.setNombreVia("Núñez de Balboa");
		d2.setCiudad("Madrid");
		e2.setDireccion(d2);
		
		//Librerias
		Libreria li1 = new Libreria(null, "Pegaso", "Alejandro", null, null);
		Direccion d3 = new Direccion();
		d3.setTipoVia("Calle");
		d3.setNombreVia("Once");
		d3.setCiudad("Madrid");
		li1.setDireccion(d3);
		Libreria li2 = new Libreria(null, "Atenas", "Guillermo", null, null);
		Direccion d4 = new Direccion();
		d4.setTipoVia("Calle");
		d4.setNombreVia("Humilladero");
		d4.setCiudad("Madrid");
		li2.setDireccion(d4);
		
		//Libros
				List<Libro> libros = new ArrayList<>();
				Libro l1 = new Libro(null, "Cien años de soledad", 10, e1, a1, li1);
				Libro l2 = new Libro(null, "Orgullo y prejuicio", 12, e2, a2, li1);
				Libro l3 = new Libro(null, "It", 9, e1, a3, li1);
				Libro l4 = new Libro(null, "El amor en los tiempos de colera", 5, e1, a1, li1);
				Libro l5 = new Libro(null, "El resplandor", 23, e1, a3, li2);
				Libro l6 = new Libro(null, "Crónica de una muerte anunciada", 18, e1, a1, li2);
				Libro l7 = new Libro(null, "Emma", 14, e2, a2, li2);
				Libro l8 = new Libro(null, "La torre oscura", 8, e1, a3, li2);
				libros.add(l1);
				libros.add(l2);
				libros.add(l3);
				libros.add(l4);
				libros.add(l5);
				libros.add(l6);
				libros.add(l7);
				libros.add(l8);
				
				a1.setLibros(libros);
				a2.setLibros(libros);
				a3.setLibros(libros);
				e1.setLibros(libros);
				e2.setLibros(libros);
				li1.setLibros(libros);
				li2.setLibros(libros);
		
				System.out.println("==============================================");
				em.getTransaction().begin();
				em.persist(a1);
				em.persist(a2);
				em.persist(a3);
				em.persist(e1);
				em.persist(e2);
				em.persist(li1);
				em.persist(li2);
				System.out.println("Dando de alta todos los objetos en la base de datos...");
				em.getTransaction().commit(); 
				System.out.println("Objetos dados de alta");	
				
				
				
				/*
				 * Mostrar todos los libros dados de alta, con su editorial y su autor
Mostrar todos los autores dados de alta, con sus libros asociados
Mostrar todas las librerías, con solamente sus libros asociados
Mostrar todos los libros dados de alta, y en la librería en la que están.
				 */

				List<Libro> listaLibros = em.createQuery("from Libro l").getResultList();//select * from personas
				for(Libro l : listaLibros) {
					System.out.println(l.getTitulo());
					System.out.println(l.getPrecio());
					System.out.println(l.getId());
					System.out.println(l.getAutor());
					
				}
				
				em.close();
				emf.close();
				
	}

}
