package AbstractFactory;

import inter.IRestConnection;

public class RestConnectionVentas implements IRestConnection {

	@Override
	public void leerUrl(String url) {
		// TODO Auto-generated method stub
		System.out.println ("Conectandose a Compras en: "+url);
		
	}

}
