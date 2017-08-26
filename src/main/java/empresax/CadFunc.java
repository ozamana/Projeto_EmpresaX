package empresax;

import java.awt.EventQueue;
import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CadFunc extends JFrame {
	private JTextField textField;
	private JTextField inputNome;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadFunc frame = new CadFunc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public CadFunc() throws Exception {
		setResizable(true);
		setTitle("Cadastro de Funcion\u00E1rio");
		setBounds(200, 200, 1022, 500);
		
		JPanel painelRegistro = new JPanel();
		
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel painelBotoes = new JPanel();
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(painelBotoes, GroupLayout.PREFERRED_SIZE, 734, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addComponent(painelRegistro, GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(painelRegistro, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(painelBotoes, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Nome", "RG", "CPF", "Dt Nascimento", "Endere\u00E7o", "Bairro", "Cidade", "Estado", "CEP", "Telefone", "E-mail", "Dt Admiss\u00E3o", "Cargo", "Sal\u00E1rio"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(34);
		table.getColumnModel().getColumn(1).setPreferredWidth(279);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setPreferredWidth(82);
		table.getColumnModel().getColumn(4).setPreferredWidth(83);
		table.getColumnModel().getColumn(5).setPreferredWidth(328);
		table.getColumnModel().getColumn(6).setPreferredWidth(187);
		table.getColumnModel().getColumn(7).setPreferredWidth(175);
		table.getColumnModel().getColumn(8).setPreferredWidth(44);
		table.getColumnModel().getColumn(11).setPreferredWidth(193);
		table.getColumnModel().getColumn(13).setPreferredWidth(154);
		table.getColumnModel().getColumn(14).setPreferredWidth(128);
		scrollPane.setViewportView(table);
		
		JLabel lblId = new JLabel("ID");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		
		inputNome = new JTextField();
		inputNome.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblRg = new JLabel("RG");
		
		JLabel lblCpf = new JLabel("CPF");
		
		JLabel lblDtNascimento = new JLabel("Dt Nascimento");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado");
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		
		JLabel lblTelefone = new JLabel("Telefone");
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail");
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		
		JLabel lblDtAdmisso = new JLabel("Dt Admiss\u00E3o");
		
		JLabel lblCargo = new JLabel("Cargo");
		
		JLabel lblSalrio = new JLabel("Sal\u00E1rio");
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		
		JLabel lblComentrios = new JLabel("Obs:");
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		GroupLayout gl_painelRegistro = new GroupLayout(painelRegistro);
		gl_painelRegistro.setHorizontalGroup(
			gl_painelRegistro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelRegistro.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_painelRegistro.createParallelGroup(Alignment.LEADING)
						.addComponent(lblId)
						.addComponent(lblNome)
						.addComponent(lblEndereo)
						.addComponent(lblBairro))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_painelRegistro.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_painelRegistro.createSequentialGroup()
							.addComponent(textField_6)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblCidade)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_painelRegistro.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(gl_painelRegistro.createSequentialGroup()
							.addComponent(lblDtNascimento)
							.addGap(138))
						.addGroup(gl_painelRegistro.createSequentialGroup()
							.addComponent(lblEstado)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_8, 0, 0, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblCep)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField_9, 97, 97, 97)
							.addGap(12))))
				.addGroup(gl_painelRegistro.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTelefone)
					.addGap(7)
					.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblEmail)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDtAdmisso)
					.addGap(2)
					.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblCargo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_13, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
					.addGap(12))
				.addGroup(gl_painelRegistro.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_painelRegistro.createParallelGroup(Alignment.LEADING)
						.addComponent(lblSalrio)
						.addComponent(lblComentrios))
					.addGap(18)
					.addGroup(gl_painelRegistro.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_painelRegistro.createSequentialGroup()
							.addComponent(textField_14, GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
							.addGap(559))
						.addComponent(textField_15, GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
					.addContainerGap(12, Short.MAX_VALUE))
				.addGroup(gl_painelRegistro.createSequentialGroup()
					.addGap(601)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
					.addGap(12))
				.addGroup(gl_painelRegistro.createSequentialGroup()
					.addGap(59)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(578, Short.MAX_VALUE))
				.addGroup(gl_painelRegistro.createSequentialGroup()
					.addGap(59)
					.addComponent(inputNome, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblRg, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblCpf, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_3, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
					.addGap(12))
		);
		gl_painelRegistro.setVerticalGroup(
			gl_painelRegistro.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelRegistro.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_painelRegistro.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblId)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_painelRegistro.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(inputNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRg)
						.addComponent(lblCpf)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_painelRegistro.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDtNascimento)
						.addComponent(lblEndereo)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_painelRegistro.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBairro)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCep)
						.addComponent(textField_8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEstado)
						.addComponent(lblCidade))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_painelRegistro.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEmail)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDtAdmisso)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCargo)
						.addComponent(lblTelefone))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_painelRegistro.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSalrio))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_painelRegistro.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblComentrios)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
					.addGap(14))
		);
		painelRegistro.setLayout(gl_painelRegistro);
		
		JButton salvar = new JButton("Salvar");
		salvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				FuncionarioDao funcionarioDao = new FuncionarioDao();
				Funcionario funcionario = new Funcionario();
				
				boolean possoIncluir = true;
				
				if (!inputNome.getText().isEmpty()) {
					funcionario.setNome(inputNome.getText());
				} else {
					possoIncluir = false;
				}
				
				if (possoIncluir) {
					funcionarioDao.inclui(funcionario);
				} else {
					JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos.");
				}
			}
		});
		
		JButton alterar = new JButton("Alterar");
		
		JButton excluir = new JButton("Excluir");
		
		JButton novo = new JButton("Novo");
		novo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton CarregaTabela = new JButton("Carregar Tabela");
		GroupLayout gl_painelBotoes = new GroupLayout(painelBotoes);
		gl_painelBotoes.setHorizontalGroup(
			gl_painelBotoes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelBotoes.createSequentialGroup()
					.addGap(78)
					.addComponent(novo)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(salvar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(alterar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(excluir)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(CarregaTabela)
					.addContainerGap(77, Short.MAX_VALUE))
		);
		gl_painelBotoes.setVerticalGroup(
			gl_painelBotoes.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_painelBotoes.createSequentialGroup()
					.addGap(8)
					.addGroup(gl_painelBotoes.createParallelGroup(Alignment.BASELINE)
						.addComponent(salvar)
						.addComponent(alterar)
						.addComponent(excluir)
						.addComponent(novo)
						.addComponent(CarregaTabela))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_painelBotoes.linkSize(SwingConstants.HORIZONTAL, new Component[] {salvar, alterar, excluir, novo, CarregaTabela});
		painelBotoes.setLayout(gl_painelBotoes);
		getContentPane().setLayout(groupLayout);
	}
}
