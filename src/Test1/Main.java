package Test1;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;


public class Main {

	
	public static void ejercicio5(ArrayList<String> a) {
		if(a.size()>10) {
			throw new RuntimeException("La longitud de la matriz no puede superar los 10");
		}
		String resultado="";
		for (String i: a) {
			resultado=resultado +" "+ i.toLowerCase();
		}
		System.out.println(resultado);
	}

	public static void main(String[] args) {
		
	
		ArrayList<String> my_array = new ArrayList<String>();
		
		my_array.add("FirstWord");
		my_array.add("SecondWord");
		my_array.add("THIRDWORD");
		
		ejercicio5(my_array);
		
// --------------------------------------------------------------
		TarjetaServicio s=new TarjetaServicio();
		
		Tarjeta visa=new Tarjeta(VISA.getInstance(),382190,"Eric Quvedo",Date.valueOf(LocalDate.now().plusYears(5)));
		Tarjeta amex=new Tarjeta(NARA.getInstance(),5534534,"Hernan Lucero",Date.valueOf(LocalDate.now().plusYears(2)));
		Tarjeta nara=new Tarjeta(AMEX.getInstance(),5476876,"Micaela Luna",Date.valueOf(LocalDate.now().minusWeeks(2)));
        
		//Informacion sobre la tarjeta
		System.out.println('\n');
		System.out.println("Informacion sobre la tarjeta:");
		System.out.println(s.getTarjetaInformacion(visa));
		System.out.println(s.getTarjetaInformacion(nara));
		System.out.println(s.getTarjetaInformacion(amex));
		
		//Informar si una operacion es valida
		
		
		Operacion op=new Operacion(200,visa);
		Operacion op2=new Operacion(1200,nara);
		Operacion op3=new Operacion(1000,amex);
		System.out.println('\n');
		System.out.println("Informar si una operacion es valida");
		System.out.println(s.isOperacionValid(op));
		System.out.println(s.isOperacionValid(op2));
		System.out.println(s.isOperacionValid(op3));
		
		//Informar si una tarjeta es valida para operar.
		System.out.println('\n');
		System.out.println("Informar si una tarjeta es valida para operar.");
		System.out.println(s.isTarjetaValid(visa));
		System.out.println(s.isTarjetaValid(nara));
		System.out.println(s.isTarjetaValid(amex));
		
		//Informar si una tarjeta es disntinta a otra.
		System.out.println('\n');
		System.out.println("Informar si una tarjeta es disntinta a otra.");
		System.out.println(s.isMismaTarjeta(amex, nara));
		
		//Obtiene por medio de un meteodo la tasa de una operacion informando marca e importe.
		System.out.println('\n');
		System.out.println("Obtiene por medio de un meteodo la tasa de una operacion informando marca e importe.\r\n");
		System.out.println(s.getOperacionTasa(op));
		System.out.println(s.getOperacionTasa(op2));
		System.out.println(s.getOperacionTasa(op3));		
		
		
	

	}

}
