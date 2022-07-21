package Test1;

public class TarjetaServicio {
	

	public String getTarjetaInformacion(Tarjeta tarjeta) {
           return tarjeta.toString();
	}
	
	 public boolean isTarjetaValid(Tarjeta tarjeta){
	        return tarjeta.Valida();
	    }
	 
	 public boolean isOperacionValid(Operacion operacion) {
		 return operacion.Valida();
	 }
	 
      public String getOperacionTasa(Operacion operacion) {
		 final Marca marca= operacion.getTarjeta().getMarca();
		 double tasa= marca.Tasa();
		 double calculo=operacion.getMonto()*tasa/100;
		 double precioFinal=operacion.getMonto()+calculo;
		 return "[ Tasa= %" + Math.round(tasa) + " Marca=" +operacion.tarjeta.marcaString(marca)+" Importe Total= "+precioFinal + " ]";
		 
	 }
      
      public boolean isMismaTarjeta(Tarjeta tar1,Tarjeta tar2) {
    	  return tar1.equals(tar2);
      }

}
