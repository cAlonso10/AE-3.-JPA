package requerimiento2;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    private int creditos;
    @ManyToOne
    @JoinColumn(name = "fk_id_profesor")
    private Profesor profesor;
    @ManyToOne
    @JoinColumn(name = "fk_id_departamento")
    private Departamento departamento;
    @ManyToMany(mappedBy = "cursos", cascade = CascadeType.PERSIST)
    private List<Estudiante> estudiantes;


}
