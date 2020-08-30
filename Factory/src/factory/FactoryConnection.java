package factory;

public class FactoryConnection {
	
	public IConnection getConnection(String motor) {
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
}