package empresax;

import java.sql.Connection;

public interface DataSource {

	public Connection conectar();

	public void desconectar();

}
