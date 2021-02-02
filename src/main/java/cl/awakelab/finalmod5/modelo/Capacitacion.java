package cl.awakelab.finalmod5.modelo;

import java.sql.Date;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Capacitacion {
	
	@Id
	private int iDCapacitacion;	
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date Capfecha;
	@DateTimeFormat(pattern = "hh:mm")
	private Time Caphora;
	private String Caplugar;
	private int Capduracion;
	private String Cliente_RutCliente;
	
	
	public Capacitacion() {
		super();
	}


	public Capacitacion(int iDCapacitacion, Date capfecha, Time caphora, String caplugar, int capduracion,
			String cliente_RutCliente) {
		super();
		this.iDCapacitacion = iDCapacitacion;
		Capfecha = capfecha;
		Caphora = caphora;
		Caplugar = caplugar;
		Capduracion = capduracion;
		Cliente_RutCliente = cliente_RutCliente;
	}


	public int getiDCapacitacion() {
		return iDCapacitacion;
	}


	public void setiDCapacitacion(int iDCapacitacion) {
		this.iDCapacitacion = iDCapacitacion;
	}


	public Date getCapfecha() {
		return Capfecha;
	}


	public void setCapfecha(Date capfecha) {
		Capfecha = capfecha;
	}


	public Time getCaphora() {
		return Caphora;
	}


	public void setCaphora(Time caphora) {
		Caphora = caphora;
	}


	public String getCaplugar() {
		return Caplugar;
	}


	public void setCaplugar(String caplugar) {
		Caplugar = caplugar;
	}


	public int getCapduracion() {
		return Capduracion;
	}


	public void setCapduracion(int capduracion) {
		Capduracion = capduracion;
	}


	public String getCliente_RutCliente() {
		return Cliente_RutCliente;
	}


	public void setCliente_RutCliente(String cliente_RutCliente) {
		Cliente_RutCliente = cliente_RutCliente;
	}


	@Override
	public String toString() {
		return "Capacitacion [iDCapacitacion=" + iDCapacitacion + ", Capfecha=" + Capfecha + ", Caphora=" + Caphora
				+ ", Caplugar=" + Caplugar + ", Capduracion=" + Capduracion + ", Cliente_RutCliente="
				+ Cliente_RutCliente + "]";
	}


	
}