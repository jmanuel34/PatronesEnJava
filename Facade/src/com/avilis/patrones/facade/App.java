package com.avilis.patrones.facade;

public class App {

	public static void main(String[] args) {
		CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("20/08/2020", "25/08/2020", "Madrid", "Ciudad de Guatemala");
		CheckFacade cliente2 = new CheckFacade();
		cliente1.buscar("20/08/2020", "05/12/2020", "Madrid", "San Jose");


	}

}
