package com.avilis.pattern.decorator.impl;
import com.avilis.pattern.decorator.Cuenta;
import com.avilis.pattern.decorator.inter.ICuentaBancaria;

public class CuentaCorriente implements ICuentaBancaria{

	public void abrirCuenta(Cuenta c) {
		System.out.println("-------------------------");
		System.out.println("Se abrio una cuenta Corriente");
		System.out.println("Cliente: " + c.getCliente());		
	}
	
}