package com.paulo.java.basico.aula46;

public class Piramide extends Figura3D {
	private Double altura;
	private Double arestaBase;
	private Double apotema;
	private Integer numPoliBase;
	private Figura2D base;

	public Piramide(Double altura, Double arestaBase, Double apotema, Integer numPoliBase, Figura2D base) {
		this.altura = altura;
		this.arestaBase = arestaBase;
		this.apotema = apotema;
		this.numPoliBase = numPoliBase;
		this.base = base;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getArestaBase() {
		return arestaBase;
	}

	public void setArestaBase(Double arestaBase) {
		this.arestaBase = arestaBase;
	}

	public Double getApotema() {
		return apotema;
	}

	public void setApotema(Double apotema) {
		this.apotema = apotema;
	}

	public Integer getNumPoliBase() {
		return numPoliBase;
	}

	public void setNumPoliBase(Integer numPoliBase) {
		this.numPoliBase = numPoliBase;
	}

	public Figura2D getBase() {
		return base;
	}

	public void setBase(Figura2D base) {
		this.base = base;
	}

	@Override
	public double calcularArea() {
		if (base != null) {
			return (numPoliBase * ((arestaBase * apotema) / 2)) + base.calcularArea();
		}
		return 0;
	}

	@Override
	public double calcularVolume() {
		if (base != null) {
			return (base.calcularArea() * altura) / 3;
		}
		return 0;
	}
	
}
