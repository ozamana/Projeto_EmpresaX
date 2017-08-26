package empresax;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class FuncionarioDao {

	private DataSource dataSource = null;
	private Connection conectar;

	public FuncionarioDao() {
		dataSource = new DataSourceImp();
		conectar = dataSource.conectar();
	}

	public void inclui(Funcionario funcionario) {

		final String query = "insert into funcionario (nome, cpf, rg, dataNascimento, "
				+ "endereco, bairro, cidade, estado, cep, "
				+ "telefone, email, dataAdmissao, cargo, salario, comentario) "
				+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		try {
			PreparedStatement inclusao = conectar.prepareStatement(query);
			inclusao.setString(1, funcionario.getNome());
			inclusao.setString(2, funcionario.getCpf());
			inclusao.setString(3, funcionario.getRg());
			inclusao.setString(4, funcionario.getDataNascimento());
			inclusao.setString(5, funcionario.getEndereco());
			inclusao.setString(6, funcionario.getBairro());
			inclusao.setString(7, funcionario.getCidade());
			inclusao.setString(8, funcionario.getEstado());
			inclusao.setString(9, funcionario.getCep());
			inclusao.setString(10, funcionario.getTelefone());
			inclusao.setString(11, funcionario.getEmail());
			inclusao.setString(12, funcionario.getDataAdmissao());
			inclusao.setString(13, funcionario.getCargo());
			inclusao.setString(14, funcionario.getSalario());
			inclusao.setString(15, funcionario.getComentario());
			inclusao.executeQuery();
		} catch (SQLException e) {
			throw new RuntimeException("Falha na inclusão");
		}
		dataSource.desconectar();
	}

	public List<Funcionario> buscarTodos() {

		try {
			PreparedStatement comando = conectar.prepareStatement("select * from funcionario");
			ResultSet resultado = comando.executeQuery();
			while (resultado.next()) {
				int id = resultado.getInt(1);
				String nome = resultado.getString("nome");
				String cpf = resultado.getString("cpf");
				String rg = resultado.getString("rg");
				String dataNascimento = resultado.getString("dataNascimento");
				String endereco = resultado.getString("endereco");
				String bairro = resultado.getString("bairro");
				String cidade = resultado.getString("cidade");
				String estado = resultado.getString("estado");
				String cep = resultado.getString("cep");
				String telefone = resultado.getString("telefone");
				String email = resultado.getString("email");
				String dataAdmissao = resultado.getString("dataAdmissao");
				String cargo = resultado.getString("cargo");
				String salario = resultado.getString("salario");
				String comentario = resultado.getString("comentario");

				System.out.println("*********************Dados do Funcionário**********************");
				System.out.println("Nº ID: " + id);
				System.out.println("Nome: " + nome);
				System.out.println("CPF: " + cpf);
				System.out.println("RG: " + rg);
				System.out.println("Data de nascimento: " + dataNascimento);
				System.out.println("Endereço: " + endereco);
				System.out.println("Bairro: " + bairro);
				System.out.println("Cidade: " + cidade);
				System.out.println("Estado: " + estado);
				System.out.println("CEP: " + cep);
				System.out.println("Telefone: " + telefone);
				System.out.println("Email: " + email);
				System.out.println("Data de admissão: " + dataAdmissao);
				System.out.println("Cargo: " + cargo);
				System.out.println("Salário: R$ " + salario);
				System.out.println("Comentário: " + comentario);
				System.out.println("***************************************************************\n");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
