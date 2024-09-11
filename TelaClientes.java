package telas;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaClientes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaClientes window = new TelaClientes();
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
	public TelaClientes() {
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
		
		JButton btnVoltar = new JButton("");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				TelaInicial.main(null);
			}
		});
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBorder(null);
		btnVoltar.setBounds(63, 47, 38, 23);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnCadastrar = new JButton("");
		btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCadastrar.setContentAreaFilled(false);
		btnCadastrar.setBorderPainted(false);
		btnCadastrar.setBorder(null);
		btnCadastrar.setBounds(1016, 371, 227, 48);
		frame.getContentPane().add(btnCadastrar);
		
		JButton btnTodos = new JButton("");
		btnTodos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnTodos.setContentAreaFilled(false);
		btnTodos.setBorderPainted(false);
		btnTodos.setBorder(null);
		btnTodos.setBounds(1016, 443, 227, 48);
		frame.getContentPane().add(btnTodos);
		
		JButton btnClientesFID = new JButton("");
		btnClientesFID.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnClientesFID.setContentAreaFilled(false);
		btnClientesFID.setBorderPainted(false);
		btnClientesFID.setBorder(null);
		btnClientesFID.setBounds(1016, 523, 227, 48);
		frame.getContentPane().add(btnClientesFID);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(TelaClientes.class.getResource("/imagens/bgClientes.png")));
		bg.setBounds(0, 0, 1288, 751);
		frame.getContentPane().add(bg);
	}

}
