package fact;

import inter.IDbConnection;
import inter.IRestConnection;

public interface AbstractFactory {
	IDbConnection getDB (String motor);
	IRestConnection getRest(String area);
}
