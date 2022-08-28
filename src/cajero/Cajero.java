package cajero;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cajero {

	private Double dineroDisponible;
	private Integer papalDisponible;
	private String banco;
	private String sucursal;
	private String estadoCajero;
	private String horaOperacion;
	private String nombreOperacion;
	private Cuenta cuenta;
	private LocalDate fecha;
	private LocalTime hora;
	private Tarjeta tarjeta;
	private Cliente cliente;
	
	
	
	public Cajero(Double dineroDisponible, Integer papalDisponible, String banco, String sucursal,
			String estadoCajero) {
		super();
		this.dineroDisponible = dineroDisponible;
		this.papalDisponible = papalDisponible;
		this.banco = banco;
		this.sucursal = sucursal;
		this.estadoCajero = estadoCajero;
	}

	public void consultarSaldo() {
		System.out.println("Su Saldo actual es : " + cuenta.getSaldo());
	}

	public void retirarSaldo(Double monto) {
		if (monto > cuenta.getSaldo()) {
			System.out.println("error, monto invalido");
			return;
		}
		if (monto < 0) {
			System.out.println("error, monto invalido");
			return;
		}
		if (!(monto%100 == 0)) {
			System.out.println("error, ingrese monto multiplo de 100");
			return;
		}
		Double saldoActualizado = cuenta.getSaldo() - monto;
		cuenta.setSaldo(saldoActualizado);
		System.out.println("Su Saldo actual es : " + cuenta.getSaldo());
		emitirTicket();

	}
	
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	private void emitirTicket() {
		fecha = LocalDate.now();
		hora = LocalTime.now();
		
		Ticket ticket = new Ticket(this, tarjeta);
		ticket.toString();
	}
	
	
	
}
