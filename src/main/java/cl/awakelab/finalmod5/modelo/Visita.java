package cl.awakelab.finalmod5.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Visita {
	
	@Id
	private int idVisita;
	private String Visfecha;
	private String Vishora;
	private String Vislugar;
	private String Viscomentarios;
	private String Cliente_rutcliente;
		
	public Visita() {
		super();
	}

	
	
	public Visita(int idVisita, String visfecha, String vishora, String vislugar, String viscomentarios,
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


	public String getVisfecha() {
		return Visfecha;
	}


	public void setVisfecha(String visfecha) {
		Visfecha = visfecha;
	}


	public String getVishora() {
		return Vishora;
	}

	
	public void setVishora(String vishora) {
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
				+ Vislugar + ", Viscomentarios=" + Viscomentarios + ", Cliente_rutcliente=" + Cliente_rutcliente
				+ ", getIdVisita()=" + getIdVisita() + ", getVisfecha()=" + getVisfecha() + ", getVishora()="
				+ getVishora() + ", getVislugar()=" + getVislugar() + ", getViscomentarios()=" + getViscomentarios()
				+ ", getCliente_rutcliente()=" + getCliente_rutcliente() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


}
