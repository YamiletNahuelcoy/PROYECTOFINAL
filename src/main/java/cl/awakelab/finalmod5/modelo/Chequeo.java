package cl.awakelab.finalmod5.modelo;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Chequeo {
	
	@Id
	private int idchequeo;
	private String cheqnombre;
	
	public Chequeo() {
		super();
	}

		
	public Chequeo(int idchequeo, String cheqnombre) {
		super();
		this.idchequeo = idchequeo;
		this.cheqnombre = cheqnombre;
	}


	public int getIdchequeo() {
		return idchequeo;
	}


	public void setIdchequeo(int idchequeo) {
		this.idchequeo = idchequeo;
	}


	public String getCheqnombre() {
		return cheqnombre;
	}


	public void setCheqnombre(String cheqnombre) {
		this.cheqnombre = cheqnombre;
	}


	@Override
	public String toString() {
		return "Chequeo [idchequeo=" + idchequeo + ", cheqnombre=" + cheqnombre + ", getIdchequeo()=" + getIdchequeo()
				+ ", getCheqnombre()=" + getCheqnombre() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	
}
