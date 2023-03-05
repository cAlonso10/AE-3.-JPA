package main;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


import modelo.entidad.Autor;
import modelo.entidad.Direccion;
import modelo.entidad.Editorial;
import modelo.entidad.Libreria;
import modelo.entidad.Libro;


public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
		EntityManager em = emf.createEntityManager();
		
		JAXBContext jc;
		try {
			jc = JAXBContext.newInstance(Libro.class);
		} catch (JAXBException e) {
			System.out.println("Error creando el contexto");
			e.printStackTrace();			
			return;
		}
		
		
		/*//Autores
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
		List<Libreria> libreriaPegaso = new ArrayList<>();
		List<Libreria> libreriaAtenas = new ArrayList<>();
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
		libreriaPegaso.add(li1);
		libreriaAtenas.add(li2);
		//Libros

				List<Libro> libros = new ArrayList<>();
				Libro l1 = new Libro(null, "Cien años de soledad", 10, e1, a1);
				Libro l2 = new Libro(null, "Orgullo y prejuicio", 12, e2, a2);
				Libro l3 = new Libro(null, "It", 9, e1, a3);
				Libro l4 = new Libro(null, "El amor en los tiempos de colera", 5, e1, a1);
				Libro l5 = new Libro(null, "El resplandor", 23, e1, a3);
				Libro l6 = new Libro(null, "Crónica de una muerte anunciada", 18, e1, a1);
				Libro l7 = new Libro(null, "Emma", 14, e2, a2);
				Libro l8 = new Libro(null, "La torre oscura", 8, e1, a3);
				
				l1.setLibrerias(libreriaPegaso);
				l2.setLibrerias(libreriaPegaso);
				l3.setLibrerias(libreriaPegaso);
				l4.setLibrerias(libreriaPegaso);
				l5.setLibrerias(libreriaAtenas);
				l6.setLibrerias(libreriaAtenas);
				l7.setLibrerias(libreriaAtenas);
				l8.setLibrerias(libreriaAtenas);
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
				System.out.println("Objetos dados de alta");	*/
		
				Marshaller m;
				try {
					m = jc.createMarshaller();
					m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

					/*Libro libros = new Libro();
					libros.setTitulo("Pruebas");
					Autor autor = new Autor();
					autor.setApellidos("Prueba2");
					libros.setAutor(autor);

					Direccion direccion = new Direccion();
					direccion.setCiudad("Madrid");
					

					Editorial editorial = new Editorial();
					editorial.setNombre("Cfk");
					libros.setEditorial(editorial);
					editorial.setDireccion(direccion);
					
					Libreria libreria = new Libreria();
					libreria.setNombre("Kfg");*/
					
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
					List<Libreria> libreriaPegaso = new ArrayList<>();
					List<Libreria> libreriaAtenas = new ArrayList<>();
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
					libreriaPegaso.add(li1);
					libreriaAtenas.add(li2);

					List<Libro> libros = new ArrayList<>();
					Libro l1 = new Libro(null, "Cien años de soledad", 10, e1, a1);
					Libro l2 = new Libro(null, "Orgullo y prejuicio", 12, e2, a2);
					Libro l3 = new Libro(null, "It", 9, e1, a3);
					Libro l4 = new Libro(null, "El amor en los tiempos de colera", 5, e1, a1);
					Libro l5 = new Libro(null, "El resplandor", 23, e1, a3);
					Libro l6 = new Libro(null, "Crónica de una muerte anunciada", 18, e1, a1);
					Libro l7 = new Libro(null, "Emma", 14, e2, a2);
					Libro l8 = new Libro(null, "La torre oscura", 8, e1, a3);
					
					l1.setLibrerias(libreriaPegaso);
					l2.setLibrerias(libreriaPegaso);
					l3.setLibrerias(libreriaPegaso);
					l4.setLibrerias(libreriaPegaso);
					l5.setLibrerias(libreriaAtenas);
					l6.setLibrerias(libreriaAtenas);
					l7.setLibrerias(libreriaAtenas);
					l8.setLibrerias(libreriaAtenas);
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

					
					

					m.marshal(x, new File("libro.xml"));
					System.out.println("El archivo Simpson.xml ha sido creado con exito,"
							+ " refresque su eclipse :)");
				} catch (JAXBException e) {
					System.out.println("Error convertiendo el objeto a formato XML");
					e.printStackTrace();
				}
				
				
				/*
				 * Mostrar todos los libros dados de alta, con su editorial y su autor
Mostrar todos los autores dados de alta, con sus libros asociados
Mostrar todas las librerías, con solamente sus libros asociados
Mostrar todos los libros dados de alta, y en la librería en la que están.
				 */

				//Mostrar todos los libros dados de alta, con su editorial y su autor
			/*	List<Libro> listaLibros = em.createQuery("from Libro l").getResultList();
				for(Libro l : listaLibros) {
					System.out.println("###Libro###");
					System.out.println("Libro [id=" + l.getId() + ", titulo=" + l.getTitulo() + ", precio=" + l.getPrecio() +"\n"+ l.getEditorial() + "\n"
							+ l.getAutor());

				}
				System.out.println("-------------------------");
				System.out.println("-------------------------");
				System.out.println("-------------------------");
				
				//Mostrar todos los autores dados de alta, con sus libros asociados
				List<Autor> listaAutores = em.createQuery("SELECT a FROM Autor a").getResultList();
				for(Autor a : listaAutores) {
				    System.out.println("####Autor####");
				    System.out.println("Autor [id=" + a.getId() + ", nombre=" + a.getNombre() + ", apellidos=" + a.getApellidos() + "]");

				    List<Libro> librosAutor = em.createQuery("SELECT l FROM Libro l WHERE l.autor.id = :idAutor")
				            .setParameter("idAutor", a.getId())
				            .getResultList();

				    for(Libro l : librosAutor) {
				        System.out.println("Libro [id=" + l.getId() + ", titulo=" + l.getTitulo() + "]");
				    }
				}
				System.out.println("-------------------------");
				System.out.println("-------------------------");
				System.out.println("-------------------------");
				
				//Mostrar todas las librerías, con solamente sus libros asociados
				/*List<Libreria> listaLibrerias = em.createQuery("SELECT li FROM Libreria li").getResultList();
				for(Libreria li : listaLibrerias) {
				    System.out.println("####Libreria####");
				    System.out.println("Libreria [id=" + li.getId() + ", ciudad=" + li.getDireccion() + ", apellidos=" + li.getDueño() + ", apellidos=" + li.getNombre() +"]");

				       List<Libro> librosLibreria = em.createQuery("SELECT l FROM Libro l WHERE l.libreria.id = :idLibreria")
				            .setParameter("idLibreria", li.getId())
				            .getResultList();

				    for(Libro l : librosLibreria) {
				        System.out.println("Libro [id=" + l.getId() + ", titulo=" + l.getTitulo() + "]");
				    }
				}*/
				System.out.println("-------------------------");
				System.out.println("-------------------------");
				System.out.println("-------------------------");
				
				//Mostrar todos los libros dados de alta, y en la librería en la que están.
				/*List<Libro> listaLibros2 = em.createQuery("SELECT lib FROM Libro lib").getResultList();
				for(Libro lib : listaLibros2) {
				    System.out.println("####Libro####");
				    System.out.println("Libro [id=" + lib.getId() + ", titulo=" + lib.getTitulo() + ", precio=" + lib.getPrecio() +"\n"+ lib.getLibrerias());

				}*/
				
				em.close();
				emf.close();
				
				
				
	}

}
