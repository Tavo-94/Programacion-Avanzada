package cajero;

public class Ticket {

	Cajero cajero;
	Tarjeta tarjeta;
	public Ticket(Cajero cajero, Tarjeta tarjeta) {
		super();
		this.cajero = cajero;
		this.tarjeta = tarjeta;
	}
	@Override
	public String toString() {
		return "Ticket [cajero=" + cajero + ", tarjeta=" + tarjeta + "]";
	}
	
	
}
