package telas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;
import javax.swing.border.CompoundBorder;


public class TelaLogin {

	private JFrame frame;
	private JTextField txtEmail;
	private JPasswordField txtSenha;
	private JButton btnEntrar;
	private JButton btnCriarConta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(TelaLogin.class.getResource("/imagens/Empty.png")));
		frame.setResizable(false);
		frame.setBounds(100, 100, 1304, 790);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		txtSenha = new JPasswordField();
		txtSenha.setFont(new Font("Leelawadee UI", Font.PLAIN, 30));
		txtSenha.setOpaque(false);
		txtSenha.setEchoChar('*');
		txtSenha.setBorder(null);
		txtSenha.setBounds(224, 417, 855, 46);
		frame.getContentPane().add(txtSenha);
		
		txtEmail = new JTextField();
		txtEmail.setOpaque(false);
		txtEmail.setBorder(null);
		txtEmail.setFont(new Font("Leelawadee UI", Font.PLAIN, 30));
		txtEmail.setBounds(224, 313, 855, 46);
		frame.getContentPane().add(txtEmail);
		txtEmail.setColumns(10);
		
		btnEntrar = new JButton("");
		btnEntrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEntrar.setContentAreaFilled(false);
		btnEntrar.setBorderPainted(false);
		btnEntrar.setBorder(null);
		btnEntrar.setBounds(448, 517, 407, 55);
		frame.getContentPane().add(btnEntrar);
		
		btnCriarConta = new JButton("");
		btnCriarConta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCriarConta.setContentAreaFilled(false);
		btnCriarConta.setBorderPainted(false);
		btnCriarConta.setBorder(null);
		btnCriarConta.setBounds(531, 669, 241, 46);
		frame.getContentPane().add(btnCriarConta);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(TelaLogin.class.getResource("/imagens/bgLogin.png")));
		bg.setBounds(0, 0, 1288, 751);
		frame.getContentPane().add(bg);
	}
}
