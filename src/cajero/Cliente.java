package cajero;

import javax.swing.JOptionPane;

public class Cliente extends Persona {

	private Integer numeroCliente;
	private String tipoCliente;
	private Cuenta cuenta;
	private Tarjeta tarjeta;

	
	public Cliente(String nombre, String apellido, String dni, Integer numeroCliente, String tipoCliente) {
		super(nombre, apellido, dni);
		this.numeroCliente = numeroCliente;
		this.tipoCliente = tipoCliente;
	}
	
	
	public void tramitarCuenta(String numeroDeCuenta, Integer clave, String banco) {
		this.cuenta = new Cuenta(numeroDeCuenta, clave, banco);
		cuenta.setSaldo(0d);
		cuenta.setEstadoDeCuenta(true); //true = cuenta activa
	}
	
	public void habilitarTarjeta(String numeroDeTarjeta, String fechaDeVencimiento, Integer codigoDeSeguridad) {
		this.tarjeta = new Tarjeta(numeroDeTarjeta, fechaDeVencimiento, codigoDeSeguridad, this, this.cuenta);
		tarjeta.setEstadoTarjeta("Habilitada");
		System.out.println("Ser habilito tu tarjeta!!!!");
		System.out.println(this.tarjeta.toString());
	}

	public Boolean accederALaCuenta() {
		Integer inputDelCliente = Integer.parseInt(JOptionPane.showInputDialog("ingreasr clave"));
		
		if (inputDelCliente == cuenta.getClave()) {
			System.out.println("Ingreso Exitoso!!!");
			return true;
		} else {
			System.out.println("clave erronea");
			return false;

		}
			
	}

	
	
}
