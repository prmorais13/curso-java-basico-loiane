package com.paulo.java.basico.aula46;

public class Circulo extends Figura2D {
	private Double raio;

	public Circulo(Double raio) {
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * (raio * raio);
	}
	
}
