package modelo.entidad;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "librerias")
public class Libreria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String dueño;
	@Embedded
	private Direccion direccion;
	@OneToMany(mappedBy="libreria", cascade=CascadeType.PERSIST)
	private List<Libro> libros;
	
	public Libreria(Integer id, String nombre, String dueño, Direccion direccion, List<Libro> libros) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.dueño = dueño;
		this.direccion = direccion;
		this.libros = libros;
	}

	public Libreria() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDueño() {
		return dueño;
	}

	public void setDueño(String dueño) {
		this.dueño = dueño;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Libreria [id=" + id + ", nombre=" + nombre + ", dueño=" + dueño + ", direccion=" + direccion
				+ ", libros=" + libros + "]";
	}
	
	
	
}