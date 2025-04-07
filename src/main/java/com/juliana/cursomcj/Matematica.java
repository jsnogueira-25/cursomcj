package com.juliana.cursomcj;

public class Matematica {
public static int somar(int numeroA, int numeroB) {
	return numeroA + numeroB;
	
}
public static double calcularAreaQuadrada (double lado) {
	return lado * lado;
}

public static double calcularAreaCirculo (double raio) {
	//PI * raio * raio
	//PI = 3.14
	double area = 3.14* raio* raio;
	return area;
}
}
