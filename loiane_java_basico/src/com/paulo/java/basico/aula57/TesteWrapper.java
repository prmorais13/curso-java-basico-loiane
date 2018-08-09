package com.paulo.java.basico.aula57;

public class TesteWrapper {

	public static void main(String[] args) {
		
		//Tipos primitivos no java
		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 1000;
		float num5 = 3.5f;
		double num6 = 3.5555;
		boolean flag = true;
		char a = 'a';
		
		//classes wrapper
		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte) 10);
		Integer num9 = new Integer(100);
		Long num10 = new Long(10000);
		Float num11 = new Float(3.5);
		Double num12 = new Double(3.55555);
		Boolean flag2 = new Boolean(true);
		Character b = new Character('a');
		
		Integer num13 = new Integer("100");
		Double num14 = new Double("3.5555");
		
		System.out.println(num13.intValue());
		System.out.println(num13.longValue());
		
		Long num15 = num13.longValue();
		
		int num16 = Integer.parseInt("10000");
		
		Integer num17 = Integer.valueOf(1313);
		System.out.println(num17);
		
		System.out.println(num9.equals(num13));
		
	}

}
