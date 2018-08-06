package com.paulo.java.basico.aula46;

public class Teste {

	public static void main(String[] args) {
		
		Quadrado f1 = new Quadrado(2.0);
		f1.setNome("Quadrado");
		
		Circulo f2 = new Circulo(2.0);
		f2.setNome("Circulo");
		
		Triangulo f3 = new Triangulo(2.0, 3.0);
		f3.setNome("Triangulo");
		
		Cubo f4 = new Cubo(3.0);
		f4.setNome("Cubo");
		
		Cilindro f5 = new Cilindro(3.0, 2.0);
		f5.setNome("Cilindro");
		
		Piramide f6 = new Piramide(3.0, 2.0, 4.0, 4, f1);
		f6.setNome("Piramide");
		
		FiguraGeometrica[] figuras = new FiguraGeometrica[6];
		
		figuras[0] = f1;
		figuras[1] = f2;
		figuras[2] = f3;
		figuras[3] = f4;
		figuras[4] = f5;
		figuras[5] = f6;
		
		for (FiguraGeometrica figura : figuras) {
			System.out.println("--------------------------------");
			System.out.println("Nome: " + figura.getNome());
			
			if (figura instanceof Figura2D) {
				Figura2D f2D = (Figura2D) figura;
				System.out.println("Area: " + f2D.calcularArea());
			}
			
			if (figura instanceof Figura3D) {
				Figura3D f3D = (Figura3D) figura;
				System.out.println("Area: " + f3D.calcularArea());
				System.out.println("Volume: " + f3D.calcularVolume());
			}
		}

	}

}
