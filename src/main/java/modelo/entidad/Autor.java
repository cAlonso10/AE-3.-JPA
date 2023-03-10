package modelo.entidad;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "autores")
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String apellidos;
	@Temporal(TemporalType.DATE)
	private Date fecha;
	@OneToMany(mappedBy="autor", cascade=CascadeType.PERSIST) 
	private List<Libro> libros;
	
	public Autor(Integer id, String nombre, String apellidos, Date fecha, List<Libro> libros) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha = fecha;
		this.libros = libros;
	}

	public Autor() {
		super();
	}
	@XmlAttribute(name = "id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@XmlElement
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@XmlElement
	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	@XmlElement
	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	@XmlElement(name = "libros")
	@XmlElementWrapper(name = "libros")
	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos +"]";
	}

	
	
	
	
}
