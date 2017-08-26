package empresax;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataSourceImp implements DataSource {

	private Connection conn;
	
	public Connection conectar() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root", "root");
		} catch (SQLException ex) {
			throw new RuntimeException("Erro, ao realizar a conexão com MySql", ex);
		}
		return conn;
	}

	public void desconectar() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao fechar a conexão!!!");
		}

	}

}
