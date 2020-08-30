
public class app {

	public static void main(String[] args) {
		Conexion c = Conexion.getInstance();
		c.connet();
		c.disconnect();
		
		boolean res = c instanceof Conexion;
		System.out.println (res);
	}

}
