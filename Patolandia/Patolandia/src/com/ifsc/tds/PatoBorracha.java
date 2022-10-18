package com.ifsc.tds;

public class PatoBorracha implements Voador, Grasnador{
	
	@Override
	public void quack() {
		
	}
	
	public void nadar() {
		System.out.println("Estou boiando...");
	}
	
	public void squeack() {
		System.out.println("Squeack! Squeack! Squeack!");
	}
	
	public void voar() {
		System.out.println("Nâo posso voar :(");
	}
	
	public void display() {
		System.out.println("Oi, eu sou um pato de borracha!");
	}

}
