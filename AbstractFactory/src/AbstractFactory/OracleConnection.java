package AbstractFactory;

import inter.IDbConnection;

public class OracleConnection implements IDbConnection {
	private String host;
	private String port;
	private String user;
	private String password;
	
	public void PostgreSqlConnection() {
		this.host = "localhost";
		this.port = "1521";
		this.user = "admin";
		this.password = "123";		
	}
	
	public void connect() {
		System.out.println ("Conectado a Oracle");
	}
	
	public void disconnect() {
		System.out.println ("Desconectado de Oracle");
	}

}
