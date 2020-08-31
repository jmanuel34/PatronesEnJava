package AbstractFactory;

import inter.IDbConnection;

public class MySqlConnection implements IDbConnection{
	
	private String host;
	private String port;
	private String user;
	private String password;
	
	public void PostgreSqlConnection() {
		this.host = "localhost";
		this.port = "3306";
		this.user = "root";
		this.password = "root";		
	}
	
	public void connect() {
		System.out.println ("Conectado a Mysql");
	}
	
	public void disconnect() {
		System.out.println ("Desconectado de MySql");
	}

}