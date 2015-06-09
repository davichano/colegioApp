package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the nota database table.
 * 
 */
@Entity
@NamedQuery(name="Nota.findAll", query="SELECT n FROM Nota n")
public class Nota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idnota;

	private String adicional;

	private String detalle;

	private String estado;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	private String nota;

	//bi-directional many-to-one association to Alumno
	@ManyToOne
	private Alumno alumno;

	//bi-directional many-to-one association to Curso
	@ManyToOne
	private Curso curso;

	public Nota() {
	}

	public int getIdnota() {
		return this.idnota;
	}

	public void setIdnota(int idnota) {
		this.idnota = idnota;
	}

	public String getAdicional() {
		return this.adicional;
	}

	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}

	public String getDetalle() {
		return this.detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNota() {
		return this.nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	public Alumno getAlumno() {
		return this.alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}