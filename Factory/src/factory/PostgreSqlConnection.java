package factory;

public class PostgreSqlConnection implements IConnection {
	
	private String host;
	private String port;
	private String user;
	private String password;
	
	public void PostgreSqlConnection()  {
		this.host = "localhost";
		this.port = "5433";
		this.user = "postgres";
		this.password = "123";		
	}
	
	public void connect() {
		System.out.println ("Conectado a Postgre Sql");
	}
	
	public void disconnect() {
		System.out.println ("Desconectado de Postgre Sql");
	}

}
