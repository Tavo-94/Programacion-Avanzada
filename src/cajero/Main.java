package cajero;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Hola GitHub!!!");
		
		Cliente gus = new Cliente("gustavo", "Heredia", "38392608", 1234, "Advance");
		
		gus.tramitarCuenta("611608", 3333, "HSBC");
		
		gus.habilitarTarjeta("1234567890", "04-27", 123);
		
		gus.accederALaCuenta();
		gus.seleccionarOperacion();
		
	}
	

}
