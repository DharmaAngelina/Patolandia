package com.ifsc.tds;

public class TestePato {

	public static void main(String[] args) {
		MallardDuck patitoFeo = new MallardDuck();
		RedHeadDuck patoDonald = new RedHeadDuck();
		PatoBorracha gansito = new PatoBorracha();
		PatoMadeira psyduck = new PatoMadeira();
		
		patitoFeo.display();
		patitoFeo.displayMallard();
		patitoFeo.nadar();
		patitoFeo.quack();
		patitoFeo.voar();
		
		System.out.println("-------------------------------");
		
		patoDonald.display();
		patoDonald.displayRed();
		patoDonald.nadar();
		patoDonald.quack();
		patoDonald.voar();
		
		System.out.println("-------------------------------");

		gansito.display();
		gansito.nadar();
		gansito.squeack();
		gansito.voar();
		
		System.out.println("---------------------,----------");
		
		psyduck.display();
		psyduck.nadar();
		psyduck.noSom();
		psyduck.voar();
	}

}
