package com.avilis.pattern.decorator.impl;

import com.avilis.pattern.decorator.Cuenta;
import com.avilis.pattern.decorator.inter.ICuentaBancaria;

public class CuentaAhorro implements ICuentaBancaria {

	@Override
	public void abrirCuenta(Cuenta c) {
		System.out.println("-------------------------");
		System.out.println("Se abrio una cuenta de Ahorros");
		System.out.println("Cliente: " + c.getCliente());		
	}	
}
