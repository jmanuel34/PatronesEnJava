package AbstractFactory;

import inter.IRestConnection;

public class RestConnectionCompras implements IRestConnection{

	@Override
	public void leerUrl(String url) {
		// TODO Auto-generated method stub
		System.out.println ("Conectadose a: "+url);
	}

}
