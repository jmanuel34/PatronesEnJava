package factory;

public class EmptyConnection implements IConnection{

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
