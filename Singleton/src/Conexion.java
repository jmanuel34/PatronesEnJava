
public class Conexion {
	// La palabra reservada static hace posible la llamada mediante la sintaxis Clase.metodo
	private static Conexion instancia;

	private Conexion() {

	}

	public static Conexion getInstance() {
		// TODO Auto-generated method stub
		if (instancia == null) {
			instancia = new Conexion();
		}
		return instancia;
	}

	public void connet() {
		System.out.println("Conectado a la BD");
	}

	public void disconnect() {
		System.out.println("Desconectado de la BD");
	}
}