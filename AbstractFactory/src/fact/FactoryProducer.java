package fact;

public class FactoryProducer {
		
		public static AbstractFactory getFactory(String factoryType) {
			
			if (factoryType.equalsIgnoreCase("DB")) {
				return new FactoryConnDb();
			}
			else if (factoryType.equalsIgnoreCase("Rest")) {
				return new FactoryConnRest();
			}
			else return null;
		}
	}
