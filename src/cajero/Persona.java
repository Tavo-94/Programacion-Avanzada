package cajero;

public abstract class Persona {

	private String nombre;
	private String apellido;
	private String dni;
	
	public Persona(String nombre, String apellido, String dni) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
}
