package com.avilis.pattern.decorator;
import com.avilis.pattern.decorator.dec.BlindajeDecorador;
import com.avilis.pattern.decorator.impl.*;
import com.avilis.pattern.decorator.inter.*;

public class App {

	public static void main(String[] args) {
		Cuenta c = new Cuenta(2005, "Jm");	
		
		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);
		
		//cuenta.abrirCuenta(c);
		cuentaBlindada.abrirCuenta(c);
	}

}
