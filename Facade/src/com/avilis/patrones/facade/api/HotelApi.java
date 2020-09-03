package com.avilis.patrones.facade.api;

public class HotelApi {
	public void buscarHoteles(String fechaEntrada, String fechaSalida, String localidad) {
		System.out.println("====================");
		
		System.out.println ("Fecha Entrada: "+ fechaEntrada+" fechaSalida "+fechaSalida);
		System.out.println("Vuelos encontrados para "+ localidad);
		System.out.println ("Hotel A");
		System.out.println ("Hotel B");
		System.out.println ("Hotel C");
		System.out.println("====================");
	}
}
