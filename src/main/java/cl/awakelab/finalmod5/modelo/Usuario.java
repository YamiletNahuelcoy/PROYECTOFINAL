package cl.awakelab.finalmod5.modelo;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	@Id
	private int idUsuario;
	private String Userrun;
	private String Usernombre;
	private String Userapellidos;
	private Date UserFechaNacimiento;
	private String UserTipo;
	private String Login;
	private String Clave;
	
	
	public Usuario() {
		super();
	}


	public Usuario(int idUsuario, String userrun, String usernombre, String userapellidos, Date userFechaNacimiento,
			String userTipo, String login, String clave) {
		super();
		this.idUsuario = idUsuario;
		Userrun = userrun;
		Usernombre = usernombre;
		Userapellidos = userapellidos;
		UserFechaNacimiento = userFechaNacimiento;
		UserTipo = userTipo;
		Login = login;
		Clave = clave;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}


	public String getUserrun() {
		return Userrun;
	}


	public void setUserrun(String userrun) {
		Userrun = userrun;
	}


	public String getUsernombre() {
		return Usernombre;
	}


	public void setUsernombre(String usernombre) {
		Usernombre = usernombre;
	}


	public String getUserapellidos() {
		return Userapellidos;
	}


	public void setUserapellidos(String userapellidos) {
		Userapellidos = userapellidos;
	}


	public Date getUserFechaNacimiento() {
		return UserFechaNacimiento;
	}


	public void setUserFechaNacimiento(Date userFechaNacimiento) {
		UserFechaNacimiento = userFechaNacimiento;
	}


	public String getUserTipo() {
		return UserTipo;
	}


	public void setUserTipo(String userTipo) {
		UserTipo = userTipo;
	}


	public String getLogin() {
		return Login;
	}


	public void setLogin(String login) {
		Login = login;
	}


	public String getClave() {
		return Clave;
	}


	public void setClave(String clave) {
		Clave = clave;
	}


	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", Userrun=" + Userrun + ", Usernombre=" + Usernombre
				+ ", Userapellidos=" + Userapellidos + ", UserFechaNacimiento=" + UserFechaNacimiento + ", UserTipo="
				+ UserTipo + ", Login=" + Login + ", Clave=" + Clave + "]";
	}


	
}
