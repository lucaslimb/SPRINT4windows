package telas;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.JTextField;
import java.awt.Font;

public class TelaFidelizados {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFidelizados window = new TelaFidelizados();
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
	public TelaFidelizados() {
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
		
		JButton btnSim1 = new JButton("");
		btnSim1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSim1.setContentAreaFilled(false);
		btnSim1.setBorderPainted(false);
		btnSim1.setBorder(null);
		btnSim1.setBounds(532, 309, 32, 34);
		frame.getContentPane().add(btnSim1);
		
		JButton btnSim2 = new JButton("");
		btnSim2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSim2.setContentAreaFilled(false);
		btnSim2.setBorderPainted(false);
		btnSim2.setBorder(null);
		btnSim2.setBounds(532, 385, 32, 34);
		frame.getContentPane().add(btnSim2);
		
		JButton btnSim3 = new JButton("");
		btnSim3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSim3.setContentAreaFilled(false);
		btnSim3.setBorderPainted(false);
		btnSim3.setBorder(null);
		btnSim3.setBounds(532, 456, 32, 34);
		frame.getContentPane().add(btnSim3);
		
		JButton btnSim4 = new JButton("");
		btnSim4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSim4.setContentAreaFilled(false);
		btnSim4.setBorderPainted(false);
		btnSim4.setBorder(null);
		btnSim4.setBounds(532, 530, 32, 34);
		frame.getContentPane().add(btnSim4);
		
		JButton btnSim5 = new JButton("");
		btnSim5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSim5.setContentAreaFilled(false);
		btnSim5.setBorderPainted(false);
		btnSim5.setBorder(null);
		btnSim5.setBounds(532, 605, 32, 34);
		frame.getContentPane().add(btnSim5);
		
		JButton btnNao1 = new JButton("");
		btnNao1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNao1.setContentAreaFilled(false);
		btnNao1.setBorderPainted(false);
		btnNao1.setBorder(null);
		btnNao1.setBounds(592, 309, 32, 34);
		frame.getContentPane().add(btnNao1);
		
		JButton btnNao2 = new JButton("");
		btnNao2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNao2.setContentAreaFilled(false);
		btnNao2.setBorderPainted(false);
		btnNao2.setBorder(null);
		btnNao2.setBounds(592, 385, 32, 34);
		frame.getContentPane().add(btnNao2);
		
		JButton btnNao3 = new JButton("");
		btnNao3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNao3.setContentAreaFilled(false);
		btnNao3.setBorderPainted(false);
		btnNao3.setBorder(null);
		btnNao3.setBounds(592, 456, 32, 34);
		frame.getContentPane().add(btnNao3);
		
		JButton btnNao4 = new JButton("");
		btnNao4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNao4.setContentAreaFilled(false);
		btnNao4.setBorderPainted(false);
		btnNao4.setBorder(null);
		btnNao4.setBounds(592, 530, 32, 34);
		frame.getContentPane().add(btnNao4);
		
		JButton btnNao5 = new JButton("");
		btnNao5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNao5.setContentAreaFilled(false);
		btnNao5.setBorderPainted(false);
		btnNao5.setBorder(null);
		btnNao5.setBounds(592, 605, 32, 34);
		frame.getContentPane().add(btnNao5);
		
		JButton btnCancelar1 = new JButton("");
		btnCancelar1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar1.setContentAreaFilled(false);
		btnCancelar1.setBorderPainted(false);
		btnCancelar1.setBorder(null);
		btnCancelar1.setBounds(1091, 338, 129, 40);
		frame.getContentPane().add(btnCancelar1);
		
		JButton btnCancelar2 = new JButton("");
		btnCancelar2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar2.setContentAreaFilled(false);
		btnCancelar2.setBorderPainted(false);
		btnCancelar2.setBorder(null);
		btnCancelar2.setBounds(1091, 410, 129, 40);
		frame.getContentPane().add(btnCancelar2);
		
		JButton btnCancelar3 = new JButton("");
		btnCancelar3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar3.setContentAreaFilled(false);
		btnCancelar3.setBorderPainted(false);
		btnCancelar3.setBorder(null);
		btnCancelar3.setBounds(1091, 485, 129, 40);
		frame.getContentPane().add(btnCancelar3);
		
		JButton btnCancelar4 = new JButton("");
		btnCancelar4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar4.setContentAreaFilled(false);
		btnCancelar4.setBorderPainted(false);
		btnCancelar4.setBorder(null);
		btnCancelar4.setBounds(1091, 559, 129, 40);
		frame.getContentPane().add(btnCancelar4);
		
		JButton btnCancelar5 = new JButton("");
		btnCancelar5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCancelar5.setContentAreaFilled(false);
		btnCancelar5.setBorderPainted(false);
		btnCancelar5.setBorder(null);
		btnCancelar5.setBounds(1091, 633, 129, 40);
		frame.getContentPane().add(btnCancelar5);
		
		JButton btnPesquisar = new JButton("");
		btnPesquisar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPesquisar.setContentAreaFilled(false);
		btnPesquisar.setBorderPainted(false);
		btnPesquisar.setBorder(null);
		btnPesquisar.setBounds(1191, 238, 37, 40);
		frame.getContentPane().add(btnPesquisar);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBorder(null);
		btnVoltar.setBounds(48, 66, 37, 23);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnScroll = new JButton("");
		btnScroll.setCursor(Cursor.getPredefinedCursor(Cursor.S_RESIZE_CURSOR));
		btnScroll.setContentAreaFilled(false);
		btnScroll.setBorderPainted(false);
		btnScroll.setBorder(null);
		btnScroll.setBounds(1249, 338, 17, 269);
		frame.getContentPane().add(btnScroll);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setOpaque(false);
		textField.setFont(new Font("Leelawadee UI", Font.PLAIN, 13));
		textField.setBounds(869, 248, 312, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel bg = new JLabel("");
		bg.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		bg.setIcon(new ImageIcon(TelaFidelizados.class.getResource("/imagens/bgFID.png")));
		bg.setBounds(-27, -21, 1364, 830);
		frame.getContentPane().add(bg);
	}

}
