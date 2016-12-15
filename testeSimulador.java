package testes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculo.Simulador;

public class testeSimulador {
	
	private Simulador simulador;
	
	@Before
	public void setUp() {
		this.simulador = new Simulador(); 
			
	}
	
	@Test
	public void test0(){
		double result = this.simulador.calcularIPTU("1", 180000,0);
		double valorEsperador = 1164.55;
		assertEquals(valorEsperador, result, 0.1);
	}
	
	@Test
	public void test1(){
		double result = this.simulador.calcularIPTU("1", 1000000,0);
		double valorEsperador = 5440.68;
		assertEquals(valorEsperador, result, 5440.68);
	}
	
	@Test
	public void test2(){
		double result = this.simulador.calcularIPTU("1", 10000, 100);
		double valorEsperador = 100;
		assertEquals(valorEsperador, result, 100);
	}
	
	@Test
	public void test3(){
		double result = this.simulador.calcularIPTU("2", 200000,0);
		double valorEsperador = 2564.26;
		assertEquals(valorEsperador, result, 2564.26);
	}
	
	@Test
	public void test4(){
		double result = this.simulador.calcularIPTU("", 430000,0);
		double valorEsperador = 6881.90;
		assertEquals(valorEsperador, result, 0.1);
	}
	
}
