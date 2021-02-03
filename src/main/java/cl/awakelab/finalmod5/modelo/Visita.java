package cl.awakelab.finalmod5.modelo;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Visita {
	
	@Id
	private int idVisita;
	private Date Visfecha;
	private Time Vishora;
	private String Vislugar;
	private String Viscomentarios;
	private String Cliente_rutcliente;
		
	public Visita() {
		super();
	}

	public Visita(int idVisita, Date visfecha, Time vishora, String vislugar, String viscomentarios,
			String cliente_rutcliente) {
		super();
		this.idVisita = idVisita;
		Visfecha = visfecha;
		Vishora = vishora;
		Vislugar = vislugar;
		Viscomentarios = viscomentarios;
		Cliente_rutcliente = cliente_rutcliente;
	}

	public int getIdVisita() {
		return idVisita;
	}

	public void setIdVisita(int idVisita) {
		this.idVisita = idVisita;
	}

	public Date getVisfecha() {
		return Visfecha;
	}

	public void setVisfecha(Date visfecha) {
		Visfecha = visfecha;
	}

	public Time getVishora() {
		return Vishora;
	}

	public void setVishora(Time vishora) {
		Vishora = vishora;
	}

	public String getVislugar() {
		return Vislugar;
	}

	public void setVislugar(String vislugar) {
		Vislugar = vislugar;
	}

	public String getViscomentarios() {
		return Viscomentarios;
	}

	public void setViscomentarios(String viscomentarios) {
		Viscomentarios = viscomentarios;
	}

	public String getCliente_rutcliente() {
		return Cliente_rutcliente;
	}

	public void setCliente_rutcliente(String cliente_rutcliente) {
		Cliente_rutcliente = cliente_rutcliente;
	}

	@Override
	public String toString() {
		return "Visita [idVisita=" + idVisita + ", Visfecha=" + Visfecha + ", Vishora=" + Vishora + ", Vislugar="
				+ Vislugar + ", Viscomentarios=" + Viscomentarios + ", Cliente_rutcliente=" + Cliente_rutcliente + "]";
	}

	
	
}
