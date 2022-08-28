package cajero;

public class Cuenta {

	private String numeroDeCuenta;
	private Boolean estadoDeCuenta;
	private Double saldo;
	private Integer clave;
	private String banco;
	private Tarjeta tarjeta;

	
	public Cuenta(String numeroDeCuenta, Integer clave, String banco) {
		super();
		this.numeroDeCuenta = numeroDeCuenta;
		this.clave = clave;
		this.banco = banco;
	}

	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(String numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public Boolean getEstadoDeCuenta() {
		return estadoDeCuenta;
	}

	public void setEstadoDeCuenta(Boolean estadoDeCuenta) {
		this.estadoDeCuenta = estadoDeCuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getClave() {
		return clave;
	}

	public void setClave(Integer clave) {
		this.clave = clave;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	

	
	
	
	
}
