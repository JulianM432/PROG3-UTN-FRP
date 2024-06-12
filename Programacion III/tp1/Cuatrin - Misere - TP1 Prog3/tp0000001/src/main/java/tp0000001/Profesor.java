package tp0000001;

public class Profesor extends Persona implements Comparable<Profesor> {
	private int legajo;
	private String titulo;

	Profesor(int id, int edad, int dni, String nombre, String apellido, int legajo, String titulo) {
		super(id, edad, dni, nombre, apellido);
		this.legajo = legajo;
		this.titulo = titulo;
	}

	public String toString() {
		return String.format("%-5d %-20s %-20s %-10d %-3d %-5d %-15s", id, nombre, apellido, dni, edad, legajo, titulo);
	}

	public int compareTo(Profesor otroProfesor) {
		return legajo - otroProfesor.legajo;
	}

	public int getLegajo() {
		return legajo;
	}

	public String getTitulo() {
		return titulo;
	}
}
