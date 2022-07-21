package Test1;

public class Operacion {
	
	Double monto;
	Tarjeta tarjeta;
	
	
	public Operacion(double monto, Tarjeta tarjeta) {
		super();
		this.monto = monto;
		this.tarjeta = tarjeta;
	}


	public double getMonto() {
		return monto;
	}


	public void setMonto(double monto) {
		this.monto = monto;
	}


	public Tarjeta getTarjeta() {
		return tarjeta;
	}


	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	
	  public boolean Valida(){
	        int i = monto.compareTo((double) 1000);
	        return i < 0;
	    }

}
