package cajero;

public class Tarjeta {

	private String numeroDeTarjeta;
	private String fechaDeVencimiento;
	private Integer codigoDeSeguridad;
	private String estadoTarjeta;
	private Cliente titular;
	private Cuenta cuenta;

	public Tarjeta(String numeroDeTarjeta, String fechaDeVencimiento, Integer codigoDeSeguridad, Cliente titular,
			Cuenta cuenta) {
		super();
		this.numeroDeTarjeta = numeroDeTarjeta;
		this.fechaDeVencimiento = fechaDeVencimiento;
		this.codigoDeSeguridad = codigoDeSeguridad;
		this.titular = titular;
		this.cuenta = cuenta;
	}

	public String getNumeroDeTarjeta() {
		return numeroDeTarjeta;
	}

	public void setNumeroDeTarjeta(String numeroDeTarjeta) {
		this.numeroDeTarjeta = numeroDeTarjeta;
	}

	public String getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public void setFechaDeVencimiento(String fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	public Integer getCodigoDeSeguridad() {
		return codigoDeSeguridad;
	}

	public void setCodigoDeSeguridad(Integer codigoDeSeguridad) {
		this.codigoDeSeguridad = codigoDeSeguridad;
	}

	public String getEstadoTarjeta() {
		return estadoTarjeta;
	}

	public void setEstadoTarjeta(String estadoTarjeta) {
		this.estadoTarjeta = estadoTarjeta;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "Tarjeta [numeroDeTarjeta=" + numeroDeTarjeta + ", fechaDeVencimiento=" + fechaDeVencimiento
				+ ", codigoDeSeguridad=" + codigoDeSeguridad + ", estadoTarjeta=" + estadoTarjeta + ", titular="
				+ titular + ", cuenta=" + cuenta + "]";
	}

	
}
