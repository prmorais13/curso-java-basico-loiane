package com.paulo.java.basico.aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {

		// Autoboxing
		Short num7 = 1; //new Short((short) 1);
		Byte num8 = 10; //new Byte((byte) 10);
		Integer num9 = 100; //new Integer(100);
		Long num10 = 10000L; //new Long(10000L);
		Float num11 = 3.5f; //new Float(3.5F);
		Double num12 = 3.5555; //new Double(3.55555);
		Boolean flag2 = true; //new Boolean(true);
		Character b = 'b'; //new Character('a');
		
		//auto un-boxing
		int num13 = num9; //num9.intValue();

	}

}
