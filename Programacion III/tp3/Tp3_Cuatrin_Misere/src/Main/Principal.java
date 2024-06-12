package Main;

import model.ListaPuntos;
import model.Punto;
import java.util.*;
import java.util.stream.Collectors;
import math.Fx;

public class Principal {

	public static void main(String[] args) {
		List<Punto> listaPunto = ListaPuntos.getListaPuntos();
		Punto centroide = CalcularCentroide(listaPunto);
		System.out.println(centroide.toString());
		System.out.println("Lista ORIGINAL");
		System.out.println(graficarLista(listaPunto));
		System.out.println("--- < -------------- > ---");
		
		solucionarPuntoA(listaPunto);
		solucionarPuntoB(listaPunto);
		solucionarPuntoC(listaPunto);
		solucionarPuntoF(listaPunto);
		solucionarPuntoG(listaPunto);
	}

	private static String graficarLista(List<Punto> listaPuntos) {
		String listaGraficable = "{"
				+ listaPuntos.stream().map(punto -> punto.toString()).collect(Collectors.joining(",")) + "}";
		return listaGraficable;
	}

	/**
	 * RESOLUCIÓN DE PUNTOS
	 */

	private static void solucionarPuntoA(List<Punto> listaPunto) {
		System.out.println("--- Lista ejercicio A ---\n");

		List<Punto> listaA = listaPunto.stream().filter(punto -> (punto.getY() < 15) && (punto.getY() > -15)).sorted()
				.collect(Collectors.toList());
		System.out.println(graficarLista(listaA));
		System.out.println("--- < -------------- > ---\n");
	}

	private static void solucionarPuntoB(List<Punto> listaPunto) {
		System.out.println("--- Lista ejercicio B ---\n");

		List<Punto> listaB = listaPunto.stream().map(punto -> new Punto(punto.getX(), Fx.fx(punto.getX())))
				.collect(Collectors.toList());
		System.out.println(graficarLista(listaB));
		System.out.println("--- < -------------- > ---\n");
	}

	private static void solucionarPuntoC(List<Punto> listaPunto) {
		System.out.println("--- Lista ejercicio C ---\n");
		List<Punto> listaC = listaPunto.stream().filter(p -> (Fx.fx(p.getX()) - p.getY()) > 0)
				.filter(p -> (Fx.fx(p.getX()) - p.getY()) < 10).collect(Collectors.toList());
		System.out.println(graficarLista(listaC));
		System.out.println("--- < -------------- > ---\n");
	}

	private static void solucionarPuntoF(List<Punto> listaPunto) {
		System.out.println("--- Lista ejercicio E ---\n");
		List<Punto> listaC = listaPunto.stream().filter(p -> (Fx.fx(p.getX()) - p.getY()) > 0)
				.filter(p -> (Fx.fx(p.getX()) - p.getY()) < 10).collect(Collectors.toList());
		Punto centroide = CalcularCentroide(listaPunto);
		List<Punto> listaD = listaC.stream()
				.filter(p -> (Math.sqrt(
						Math.pow(centroide.getX() - p.getX(), 2) + Math.pow(centroide.getY() - p.getY(), 2)) <= 5))
				.collect(Collectors.toList());
		System.out.println(graficarLista(listaD));
		System.out.println(centroide.toString());
		System.out.println("--- < -------------- > ---\n");
	}

	private static void solucionarPuntoG(List<Punto> listaPunto) {
		System.out.println("--- Lista ejercicio G ---\n");
		Punto centroide = CalcularCentroide(listaPunto);
		List<Punto> listaG = listaPunto.stream().filter(p -> (centroide.getY() - Fx.fx(p.getX())) >= 0)
				.filter(p -> (centroide.getY() - Fx.fx(p.getX())) < 3).collect(Collectors.toList());
		System.out.println(graficarLista(listaG));
		System.out.println(centroide.toString());
		System.out.println("--- < -------------- > ---\n");
	}

	private static Punto CalcularCentroide(List<Punto> listaPunto)
	{
		double avgX = listaPunto.stream().mapToDouble(Punto::getX).average().orElse(0);
		double avgY = listaPunto.stream().mapToDouble(Punto::getY).average().orElse(0);
		Punto centroide = new Punto(avgX, avgY);
		return centroide;
	}
}