package model;

import java.util.Locale;

public class Punto implements Comparable<Punto> {
	private double x;
	private double y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

//	public double calcularDistancia(Punto p) {
//		return Math.sqrt (Math.pow((p.getX()-this.x),2) + Math.pow((p.getY()-this.y),2));
//	}

	@Override
	public String toString() {
		return (String.format(Locale.US, "(%.1f,%.1f)", x, y));
		//return (String.format(Locale.US, "(%.1f)", x));
	}

	@Override
	public int compareTo(Punto o) {
		return Double.compare(this.x, o.getX());
	}

}
