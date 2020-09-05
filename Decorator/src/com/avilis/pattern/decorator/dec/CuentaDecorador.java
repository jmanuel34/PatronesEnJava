package com.avilis.pattern.decorator.dec;
import com.avilis.pattern.decorator.Cuenta;
import com.avilis.pattern.decorator.inter.*;

public abstract class CuentaDecorador implements ICuentaBancaria {
	
	protected ICuentaBancaria cuentaDecorada;
	
	public CuentaDecorador (ICuentaBancaria cuentaDecorada) {
		this.cuentaDecorada = cuentaDecorada;
	}
	
	public void abrirCuenta(Cuenta c) {
		this.cuentaDecorada.abrirCuenta(c);
	}
	
}