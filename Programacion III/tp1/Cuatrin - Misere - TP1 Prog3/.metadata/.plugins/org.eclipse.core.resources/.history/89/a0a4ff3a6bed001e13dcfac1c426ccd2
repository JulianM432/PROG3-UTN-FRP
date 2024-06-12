package tp0000001;

public class Alumno extends Persona implements Comparable<Alumno> {
	private int nroLE;
	private int materiasAprobadas;
	private float promedio;

	Alumno(int id, int edad, int dni, String nombre, String apellido, int nroLE, int materiasAprobadas,
			float promedio) {
		super(id, edad, dni, nombre, apellido);
		this.nroLE = nroLE;
		this.materiasAprobadas = materiasAprobadas;
		this.promedio = promedio;
	}

	public String toString() {
		return String.format("%-5s %-20s %-20s %-10s %-3s %-5s %-3s %-5s", id, nombre, apellido, dni, edad, nroLE,
				materiasAprobadas, promedio);
	}

	public int compareTo(Alumno otroAlumno) {
		int result;
		if (apellido.compareTo(otroAlumno.apellido) < 0) {
			result = -1;
		} else if (apellido.compareTo(otroAlumno.apellido) > 0) {
			result = 1;
		} else {
			if (nombre.compareTo(otroAlumno.nombre) < 0) {
				result = -1;
			} else if (nombre.compareTo(otroAlumno.nombre) > 0) {
				result = 1;
			} else {
				result = 0;
			}
		}
		return result;
	}

	public int getNroLegajo() {
		return nroLE;
	}

	public int getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public float getPromedio() {
		return promedio;
	}
}
