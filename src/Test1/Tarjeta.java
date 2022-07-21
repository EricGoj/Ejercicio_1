package Test1;

import java.time.Instant;
import java.util.Date;

public class Tarjeta {

	private Marca marca;

	private Integer numTarjeta;

	private String titular;

	private Date fechaVencimiento;

	public Tarjeta(Marca marca, Integer numTarjeta, String titular, Date fechaVencimiento) {
		super();

		this.marca = marca;
		this.numTarjeta = numTarjeta;
		this.titular = titular;
		this.fechaVencimiento = fechaVencimiento;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Integer getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(Integer numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public boolean Valida() {
		return fechaVencimiento.after(Date.from(Instant.now()));
	}
	
	public String marcaString(Marca marca) {
		String marcaNombre="";
		if (marca instanceof VISA) {
			 marcaNombre="Visa";
		}
		if (marca instanceof AMEX) {
			 marcaNombre="Amex";
		}
		if (marca instanceof NARA) {
			marcaNombre="Nara";
		}
		return marcaNombre;
	}

	@Override
	public String toString() {
		
		return "Tarjeta [marca=" + marcaString(marca)+ ", numTarjeta=" + numTarjeta + ", titular=" + titular + ", fechaVencimiento="
				+ fechaVencimiento + "]";
	}
	
}
