package com.avilis.model;
import com.avilis.inter.*;

public class CuentaAhorroImplementacion implements ICuenta  {
	private String tipo;
	private double cantidad;
	
	public CuentaAhorroImplementacion() {
		tipo = "AHORRO";
	}
	
	public ICuenta clone() {
		CuentaAhorroImplementacion cuenta = null;
		try {
			cuenta = (CuentaAhorroImplementacion) clone();
			
		} catch (CloneNotSupportedException e){
			e.printStackTrace();			
		}
		return cuenta;
	}
}
