package com.avilis.model;
import com.avilis.inter.*;

public class CuentaAhorroImplementacion implements ICuenta  {
	private String tipo;
	private double cantidad;
	
	public CuentaAhorroImplementacion() {
		tipo = "AHORRO";
	}
	
	@Override
	public ICuenta clonar() {
		CuentaAhorroImplementacion cuenta = null;
		try {
			cuenta = (CuentaAhorroImplementacion) clone();
		} catch (CloneNotSupportedException e) {
			System.out.println ("Fallo en el clonado");
			e.printStackTrace();
		}
		return cuenta;
	}
	
	@Override
	public String toString() {
		return "CuentaAHImpl [tipo=" + tipo + ", cantidad=" + cantidad + "]";
	}

	public void setMonto(double monto) {
		this.cantidad = monto;
	}

	public double getMonto() {
		return cantidad;
	}
}
