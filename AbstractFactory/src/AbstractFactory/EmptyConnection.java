package AbstractFactory;

import inter.IDbConnection;

public class EmptyConnection implements IDbConnection{

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println (" Proveedor no especificado");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println (" Proveedor no especificado");
	}

}
