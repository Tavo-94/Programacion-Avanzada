package cajero;

import javax.swing.JOptionPane;

public class Cliente extends Persona {

	private Integer numeroCliente;
	private String tipoCliente;
	private Cuenta cuenta;
	private Tarjeta tarjeta;
	private Cajero cajero;

	
	public Cliente(String nombre, String apellido, String dni, Integer numeroCliente, String tipoCliente) {
		super(nombre, apellido, dni);
		this.numeroCliente = numeroCliente;
		this.tipoCliente = tipoCliente;
	}
	
	
	public void tramitarCuenta(String numeroDeCuenta, int clave, String banco) {
		this.cuenta = new Cuenta(numeroDeCuenta, clave, banco);
		cuenta.setSaldo(0d);
		cuenta.setEstadoDeCuenta(true); //true = cuenta activa
		System.out.println(this.cuenta.toString());
	}
	
	public void habilitarTarjeta(String numeroDeTarjeta, String fechaDeVencimiento, Integer codigoDeSeguridad) {
		this.tarjeta = new Tarjeta(numeroDeTarjeta, fechaDeVencimiento, codigoDeSeguridad, this, this.cuenta);
		tarjeta.setEstadoTarjeta("Habilitada");
		System.out.println("Ser habilito tu tarjeta!!!!");
		System.out.println(this.tarjeta.toString());
	}

	public Boolean accederALaCuenta() {
		int inputDelCliente = Integer.parseInt(JOptionPane.showInputDialog("ingreasr clave"));
		System.out.println(inputDelCliente);
		if (inputDelCliente == this.cuenta.getClave()) {
			System.out.println("Ingreso Exitoso!!!");
			this.cajero = new Cajero(999999d, 999999, "HSBC", "STFE", "habilitado");
			return true;
		} else {
			System.out.println("clave erronea");
			return false;

		}	
	}
	public void seleccionarOperacion() {
		cajero.setCliente(this);
		cajero.setCuenta(cuenta);

		Integer continuar;
		do {
			continuar = null;
			Integer inputUsuario;
			inputUsuario = Integer.parseInt(JOptionPane.showInputDialog("ingresa una opccion"));
			switch (inputUsuario) {
			case 1:
				cajero.consultarSaldo();
				break;
			case 2:
				Double montoARetirar = Double.parseDouble(JOptionPane.showInputDialog("ingresar monto a retirar"));
				cajero.retirarSaldo(montoARetirar);
				break;
			default:
				break;
			}
			continuar = JOptionPane.showOptionDialog(null, "Desea continuar operando?", "Alerta", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE, null, null, null);
		} while (continuar == 0);
	}	
	
	

	
	
}
