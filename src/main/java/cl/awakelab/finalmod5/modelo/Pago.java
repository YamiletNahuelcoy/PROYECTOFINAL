package cl.awakelab.finalmod5.modelo;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Pago {

	@Id
	private int idpago;
	@DateTimeFormat(pattern = "dd/mm/yyyy")
	private Date pagoFecha;
	private int pagoMonto;
	private String pagoMes;
	private int pagoAño;
	private String Cliente_RutCliente;
	
	
	public Pago() {
		super();
	}


	public Pago(int idpago, Date pagoFecha, int pagoMonto, String pagoMes, int pagoAño, String cliente_RutCliente) {
		super();
		this.idpago = idpago;
		this.pagoFecha = pagoFecha;
		this.pagoMonto = pagoMonto;
		this.pagoMes = pagoMes;
		this.pagoAño = pagoAño;
		Cliente_RutCliente = cliente_RutCliente;
	}


	public int getIdpago() {
		return idpago;
	}


	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}


	public Date getPagoFecha() {
		return pagoFecha;
	}


	public void setPagoFecha(Date pagoFecha) {
		this.pagoFecha = pagoFecha;
	}


	public int getPagoMonto() {
		return pagoMonto;
	}


	public void setPagoMonto(int pagoMonto) {
		this.pagoMonto = pagoMonto;
	}


	public String getPagoMes() {
		return pagoMes;
	}


	public void setPagoMes(String pagoMes) {
		this.pagoMes = pagoMes;
	}


	public int getPagoAño() {
		return pagoAño;
	}


	public void setPagoAño(int pagoAño) {
		this.pagoAño = pagoAño;
	}


	public String getCliente_RutCliente() {
		return Cliente_RutCliente;
	}


	public void setCliente_RutCliente(String cliente_RutCliente) {
		Cliente_RutCliente = cliente_RutCliente;
	}


	@Override
	public String toString() {
		return "Pago [idpago=" + idpago + ", pagoFecha=" + pagoFecha + ", pagoMonto=" + pagoMonto + ", pagoMes="
				+ pagoMes + ", pagoAño=" + pagoAño + ", Cliente_RutCliente=" + Cliente_RutCliente + "]";
	}
	
	
	
	
	
	
	
	
	
}
