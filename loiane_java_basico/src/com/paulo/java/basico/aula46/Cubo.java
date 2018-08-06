package com.paulo.java.basico.aula46;

public class Cubo extends Figura3D {
	private Double lado;

	public Cubo(Double lado) {
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
		return 6 * (lado * lado);
	}

	@Override
	public double calcularVolume() {
		return Math.pow(lado, 3);
	}
	
	
}
