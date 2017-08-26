package empresax;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoCadastroFuncionario {

	Funcionario funcionario = new Funcionario();
	
	public void insert(){
		
		String insert = "insert into funcionario values ('"+funcionario.getNome()+"')";
		System.out.println(insert);
		
	}
	
	
	
	public void getCadstro() {

		Dao dao = new Dao();
		Connection conectar = dao.conectar();

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
	}

}
