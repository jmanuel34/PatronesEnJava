package fact;

import AbstractFactory.RestConnectionCompras;
import AbstractFactory.RestConnectionNoArea;
import AbstractFactory.RestConnectionVentas;
import inter.IDbConnection;
import inter.IRestConnection;

public class FactoryConnRest implements AbstractFactory{

	@Override
	public IDbConnection getDB(String motor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IRestConnection getRest(String area) {
		// TODO Auto-generated method stub
		if (area ==null) {
			return new RestConnectionNoArea();
		}
		else if (area.equalsIgnoreCase("Compras")) {
				return new RestConnectionCompras();
		}
		else if (area.equalsIgnoreCase("Ventas")) {
			return new RestConnectionVentas();
		}
		else {
			return null;
		}
			
	}





}
