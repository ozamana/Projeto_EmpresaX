package empresax;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {

	Connection conn = null;

	public Connection conectar() {
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro", "root", "root");
			System.out.println("***************************************************************\n");
			System.out.println("Conexão efetuada com sucesso!\n");
			System.out.println("***************************************************************\n");
		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		return conn;
	}

	public void desconectar() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
