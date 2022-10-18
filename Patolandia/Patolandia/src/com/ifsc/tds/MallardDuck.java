package com.ifsc.tds;

public class MallardDuck extends Duck implements Voador, Grasnador{
	
	public void displayMallard() {
		System.out.println("Sou um pato vermelho!");
	}
		
		@Override
		public void voar() {
			System.out.println("Estou voando");
	}

		@Override
		public void quack() {
			System.out.println("Quack! Quack! Quack!");			
		}
}
