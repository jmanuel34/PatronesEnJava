package factory;

public class App {

	public static void main(String[] args) {
		FactoryConnection factory = new FactoryConnection();
		
		IConnection cx1 = factory.getConnection("ORACLe");
		cx1.connect();
		cx1.disconnect();
		
		IConnection cx2 =factory.getConnection("MYSQl");
		cx2.connect();
		cx2.disconnect();
		
		IConnection cx3 = factory.getConnection("H2");
		cx3.connect();
		cx3.disconnect();
		

	}

}
