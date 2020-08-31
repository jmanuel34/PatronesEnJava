package AbstractFactory;

import fact.*;
import inter.*;

public class Appp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory factoryDb =  FactoryProducer.getFactory("DB");
		IDbConnection cxDb1 = factoryDb.getDB("ORACLE");
		cxDb1.connect();
		
		AbstractFactory factoryRest = FactoryProducer.getFactory("REST");
		IRestConnection cxRe1 = factoryRest.getRest("COMPRAS");
		cxRe1.leerUrl("http://www.avilis.net");
	}

}
