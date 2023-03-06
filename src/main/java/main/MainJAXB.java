package main;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import modelo.entidad.Autor;
import modelo.entidad.Direccion;
import modelo.entidad.Editorial;
import modelo.entidad.Libreria;
import modelo.entidad.Libro;



public class MainJAXB {

	public static void main(String[] args) {
		
		JAXBContext contexto;
		try {
			contexto = JAXBContext.newInstance(Libro.class);
		} catch (JAXBException e) {
			System.out.println("Error creando el contexto");
			e.printStackTrace();			
			return;//Dejamos de ejecutar el metodo main
		}

		Marshaller m;
		try {
			m = contexto.createMarshaller();
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
			Autor a1 = new Autor(1, "Gabriel", "García Márquez", null, null);
			a1.setFecha(new Date(27,2,6));
			
			Editorial e1 = new Editorial(1, "Penguin Random House", null, null);
			Direccion d1 = new Direccion();
			d1.setTipoVia("Calle");
			d1.setNombreVia("Luchana");
			d1.setCiudad("Madrid");
			e1.setDireccion(d1);
			
			List<Libreria> libreriaPegaso = new ArrayList<>();
			Libreria li1 = new Libreria(1, "Pegaso", "Alejandro", null, null);
			Direccion d2 = new Direccion();
			d2.setTipoVia("Calle");
			d2.setNombreVia("Once");
			d2.setCiudad("Madrid");
			li1.setDireccion(d2);
			libreriaPegaso.add(li1);
			
			Libro libros = new Libro(1, "Cien años de soledad", 10, e1, a1);
			libros.setLibrerias(libreriaPegaso);
			
			
			
		m.marshal(libros, new File("libros.xml"));
		System.out.println("El archivo libros.xml ha sido creado con exito,"
				+ " refresque su eclipse :)");
		
		}catch (JAXBException e) {
			System.out.println("Error convertiendo el objeto a formato XML");
			e.printStackTrace();
		}

}
}
