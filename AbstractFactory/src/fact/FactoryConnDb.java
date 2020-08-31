package fact;

import AbstractFactory.EmptyConnection;
import AbstractFactory.MySqlConnection;
import AbstractFactory.OracleConnection;
import AbstractFactory.PostgreSqlConnection;
import inter.IDbConnection;
import inter.IRestConnection;

public class FactoryConnDb implements AbstractFactory{
	
	@Override
	public IDbConnection getDB(String motor) {
		// TODO Auto-generated method stub
		if (motor == null) {
			return new EmptyConnection();
		}
		else if (motor.equalsIgnoreCase("ORACLE")) {
			return new OracleConnection();
		}
		else if (motor.equalsIgnoreCase("MYSQL")) {
			return new MySqlConnection();
		}
		else if (motor.equalsIgnoreCase("POSTGRESQL")) {
			return new PostgreSqlConnection();
		}
		return new EmptyConnection();
	}

	@Override
	public IRestConnection getRest(String url) {
		// TODO Auto-generated method stub
		return null;
	}
}