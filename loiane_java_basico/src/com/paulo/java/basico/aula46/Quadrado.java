package com.paulo.java.basico.aula46;

public class Quadrado extends Figura2D {

	private Double lado;
	
	public Quadrado(Double lado) {
		this.lado = lado;
	}

	public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {	
		return Math.pow(lado, 2);
	}

}
