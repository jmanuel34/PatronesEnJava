package com.avilis.model;

public class app {
	public static void main (String[] args) {
		CuentaAhorroImplementacion cuenta = new CuentaAhorroImplementacion();
		cuenta.setMonto(2000);
		
		CuentaAhorroImplementacion cuentaClonada = (CuentaAhorroImplementacion)cuenta.clonar();
		
		if (cuentaClonada != null) {
			System.out.println ("Cuenta clonada: "+cuentaClonada);
		}
		System.out.println ("Cuenta        : "+cuenta);
		System.out.println ("Cuenta Clonada: "+ cuentaClonada);

		System.out.println ("Cuenta clonada es lo mismo que Cuenta Ahorro: " + (cuenta==cuentaClonada));
	}

}
