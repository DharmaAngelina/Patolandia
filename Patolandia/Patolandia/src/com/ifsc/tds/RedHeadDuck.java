package com.ifsc.tds;

public class RedHeadDuck extends Duck implements Voador, Grasnador{
	
	    public RedHeadDuck() {}
	
	    public void displayRed() {
		    System.out.println("Sou um pato real!");
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
