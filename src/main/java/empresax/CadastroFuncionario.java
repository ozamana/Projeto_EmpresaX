package empresax;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class CadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField txtnome;
	public Funcionario funcionario = new Funcionario();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionario frame = new CadastroFuncionario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		txtnome = new JTextField();
		contentPane.add(txtnome, BorderLayout.NORTH);
		txtnome.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cadastro();
			}
		});
		contentPane.add(btnNewButton, BorderLayout.CENTER);
	}
	
	
	
	public void cadastro(){
		funcionario.setNome(txtnome.getText());
		DaoCadastroFuncionario dao = new DaoCadastroFuncionario();
	dao.insert();
	}

}
