package cl.awakelab.finalmod5.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

/* *
 * @ Clase Cliente
 * @ autores 
 * @ versión 
 * 
 */


@Entity
public class Cliente  {

	/** Atributos de la clase encapsulados */

	@Id
	private String RutCliente;
	private String clienombres;
	private String cliapellidos;
	private String clitelefono;
	private String cliafp;
	private int clisistemasalud;
	private String clidireccion;
	private String clicomuna;
	private int CliEdad;
	private int usuario_idusuario;
	
	
	
	public Cliente() {
		super();
	}



	public Cliente(String rutCliente, String clienombres, String cliapellidos, String clitelefono, String cliafp,
			int clisistemasalud, String clidireccion, String clicomuna, int cliEdad, int usuario_idusuario) {
		super();
		RutCliente = rutCliente;
		this.clienombres = clienombres;
		this.cliapellidos = cliapellidos;
		this.clitelefono = clitelefono;
		this.cliafp = cliafp;
		this.clisistemasalud = clisistemasalud;
		this.clidireccion = clidireccion;
		this.clicomuna = clicomuna;
		CliEdad = cliEdad;
		this.usuario_idusuario = usuario_idusuario;
	}



	public String getRutCliente() {
		return RutCliente;
	}



	public void setRutCliente(String rutCliente) {
		RutCliente = rutCliente;
	}



	public String getClienombres() {
		return clienombres;
	}



	public void setClienombres(String clienombres) {
		this.clienombres = clienombres;
	}



	public String getCliapellidos() {
		return cliapellidos;
	}



	public void setCliapellidos(String cliapellidos) {
		this.cliapellidos = cliapellidos;
	}



	public String getClitelefono() {
		return clitelefono;
	}



	public void setClitelefono(String clitelefono) {
		this.clitelefono = clitelefono;
	}



	public String getCliafp() {
		return cliafp;
	}



	public void setCliafp(String cliafp) {
		this.cliafp = cliafp;
	}



	public int getClisistemasalud() {
		return clisistemasalud;
	}



	public void setClisistemasalud(int clisistemasalud) {
		this.clisistemasalud = clisistemasalud;
	}



	public String getClidireccion() {
		return clidireccion;
	}



	public void setClidireccion(String clidireccion) {
		this.clidireccion = clidireccion;
	}



	public String getClicomuna() {
		return clicomuna;
	}



	public void setClicomuna(String clicomuna) {
		this.clicomuna = clicomuna;
	}



	public int getCliEdad() {
		return CliEdad;
	}



	public void setCliEdad(int cliEdad) {
		CliEdad = cliEdad;
	}



	public int getUsuario_idusuario() {
		return usuario_idusuario;
	}



	public void setUsuario_idusuario(int usuario_idusuario) {
		this.usuario_idusuario = usuario_idusuario;
	}



	@Override
	public String toString() {
		return "Cliente [RutCliente=" + RutCliente + ", clienombres=" + clienombres + ", cliapellidos=" + cliapellidos
				+ ", clitelefono=" + clitelefono + ", cliafp=" + cliafp + ", clisistemasalud=" + clisistemasalud
				+ ", clidireccion=" + clidireccion + ", clicomuna=" + clicomuna + ", CliEdad=" + CliEdad
				+ ", usuario_idusuario=" + usuario_idusuario + "]";
	}



	
}
