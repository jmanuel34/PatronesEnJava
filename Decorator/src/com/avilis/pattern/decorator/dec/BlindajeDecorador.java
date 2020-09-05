package com.avilis.pattern.decorator.dec;

import com.avilis.pattern.decorator.Cuenta;
import com.avilis.pattern.decorator.inter.ICuentaBancaria;

public class BlindajeDecorador extends CuentaDecorador {

	public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
		super(cuentaDecorada);
	}
	
	public void abrirCuenta(Cuenta c) {
		cuentaDecorada.abrirCuenta(c);
		agregarBlindaje(c);
		
	}

	private void agregarBlindaje(Cuenta c) {
		System.out.println ("Se agregó blindaje a la cuenta de: "+c.getCliente());
	}
	

}
