package tp0000001;

public class Persona {
	protected int id;
	protected int edad;
	protected int dni;
	protected String nombre;
	protected String apellido;

	Persona(int id, int edad, int dni, String nombre, String apellido) {
		this.id = id;
		this.edad = edad;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public int getEdad() {
		return edad;
	}

	public long getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

}
