package com.paulo.java.basico.aula46;

public class Cilindro extends Figura3D {
	private Double altura;
	private Double raio;
	
	public Cilindro(Double altura, Double raio) {
		this.altura = altura;
		this.raio = raio;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		double areaBase = Math.PI * (raio * raio);
		double areaLateral = 2 * Math.PI * raio * altura;
		double areaTotal = (2 * areaBase) + areaLateral;
		return areaTotal;
	}

	@Override
	public double calcularVolume() {
		return Math.PI * (raio * raio) * altura;
	}
	
}
