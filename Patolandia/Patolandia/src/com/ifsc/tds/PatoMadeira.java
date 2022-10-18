package com.ifsc.tds;

public class PatoMadeira implements Voador, Grasnador{

	@Override
	public void quack() {
		
	}
	
		public void nadar() {
			System.out.println("Estou me afunfando");
		}
		
		public void noSom() {
			System.out.println("N�o fa�o som");
		}
		
		@Override
		public void voar() {
			System.out.println("N�o posso voar :(");
		}
		
		public void display() {
			System.out.println("Oi, eu sou um pato de madeira!");
		}

	}
