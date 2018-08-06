package com.paulo.java.basico.aula46;

public class Triangulo extends Figura2D {
	private Double base;
	private Double altura;
	
	public Triangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Double getBase() {
		return base;
	}

	public void setBase(Double base) {
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (base * altura) / 2;
	}
	
	
}
