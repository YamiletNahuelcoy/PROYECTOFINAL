package cl.awakelab.finalmod5.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Profesional  {

	/** Atributos de la clase encapsulados */
	@Id
	private int usuario_idusuario;
	private int idProfesional;
	private String ProfRun;
	private String ProfNombres;
	private String ProfApellidos;
	private String ProfTelefono;
	private String ProfTitulo;
	private String ProfProyecto;
	
	
	public Profesional() {
		super();
	}

	public Profesional(int usuario_idusuario, int idProfesional, String profRun, String profNombres,
			String profApellidos, String profTelefono, String profTitulo, String profProyecto) {
		super();
		this.usuario_idusuario = usuario_idusuario;
		this.idProfesional = idProfesional;
		ProfRun = profRun;
		ProfNombres = profNombres;
		ProfApellidos = profApellidos;
		ProfTelefono = profTelefono;
		ProfTitulo = profTitulo;
		ProfProyecto = profProyecto;
	}

	public int getUsuario_idusuario() {
		return usuario_idusuario;
	}

	public void setUsuario_idusuario(int usuario_idusuario) {
		this.usuario_idusuario = usuario_idusuario;
	}

	public int getIdProfesional() {
		return idProfesional;
	}

	public void setIdProfesional(int idProfesional) {
		this.idProfesional = idProfesional;
	}

	public String getProfRun() {
		return ProfRun;
	}

	public void setProfRun(String profRun) {
		ProfRun = profRun;
	}

	public String getProfNombres() {
		return ProfNombres;
	}

	public void setProfNombres(String profNombres) {
		ProfNombres = profNombres;
	}

	public String getProfApellidos() {
		return ProfApellidos;
	}

	public void setProfApellidos(String profApellidos) {
		ProfApellidos = profApellidos;
	}

	public String getProfTelefono() {
		return ProfTelefono;
	}

	public void setProfTelefono(String profTelefono) {
		ProfTelefono = profTelefono;
	}

	public String getProfTitulo() {
		return ProfTitulo;
	}

	public void setProfTitulo(String profTitulo) {
		ProfTitulo = profTitulo;
	}

	public String getProfProyecto() {
		return ProfProyecto;
	}

	public void setProfProyecto(String profProyecto) {
		ProfProyecto = profProyecto;
	}

	@Override
	public String toString() {
		return "Profesional [usuario_idusuario=" + usuario_idusuario + ", idProfesional=" + idProfesional + ", ProfRun="
				+ ProfRun + ", ProfNombres=" + ProfNombres + ", ProfApellidos=" + ProfApellidos + ", ProfTelefono="
				+ ProfTelefono + ", ProfTitulo=" + ProfTitulo + ", ProfProyecto=" + ProfProyecto + "]";
	}

	
}