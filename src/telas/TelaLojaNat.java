package telas;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Cursor;

public class TelaLojaNat {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLojaNat window = new TelaLojaNat();
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
	public TelaLojaNat() {
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
		
		JButton btnProduto1 = new JButton("");
		btnProduto1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProduto1.setContentAreaFilled(false);
		btnProduto1.setBorder(null);
		btnProduto1.setBounds(81, 213, 178, 237);
		frame.getContentPane().add(btnProduto1);
		
		JButton btnProduto2 = new JButton("");
		btnProduto2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProduto2.setContentAreaFilled(false);
		btnProduto2.setBorder(null);
		btnProduto2.setBounds(286, 425, 178, 25);
		frame.getContentPane().add(btnProduto2);
		
		JButton btnProduto3 = new JButton("");
		btnProduto3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProduto3.setContentAreaFilled(false);
		btnProduto3.setBorder(null);
		btnProduto3.setBounds(495, 425, 178, 25);
		frame.getContentPane().add(btnProduto3);
		
		JButton btnProduto4 = new JButton("");
		btnProduto4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProduto4.setContentAreaFilled(false);
		btnProduto4.setBorder(null);
		btnProduto4.setBounds(894, 363, 93, 41);
		frame.getContentPane().add(btnProduto4);
		
		JButton btnProduto5 = new JButton("");
		btnProduto5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProduto5.setContentAreaFilled(false);
		btnProduto5.setBorder(null);
		btnProduto5.setBounds(1040, 425, 178, 25);
		frame.getContentPane().add(btnProduto5);
		
		JButton btnProduto6 = new JButton("");
		btnProduto6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProduto6.setContentAreaFilled(false);
		btnProduto6.setBorder(null);
		btnProduto6.setBounds(81, 694, 178, 15);
		frame.getContentPane().add(btnProduto6);
		
		JButton btnProduto7 = new JButton("");
		btnProduto7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProduto7.setContentAreaFilled(false);
		btnProduto7.setBorder(null);
		btnProduto7.setBounds(286, 694, 178, 15);
		frame.getContentPane().add(btnProduto7);
		
		JButton btnProduto8 = new JButton("");
		btnProduto8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProduto8.setContentAreaFilled(false);
		btnProduto8.setBorder(null);
		btnProduto8.setBounds(495, 694, 178, 15);
		frame.getContentPane().add(btnProduto8);
		
		JButton btnProduto9 = new JButton("");
		btnProduto9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProduto9.setContentAreaFilled(false);
		btnProduto9.setBorder(null);
		btnProduto9.setBounds(1020, 655, 171, 25);
		frame.getContentPane().add(btnProduto9);
		
		JButton btnEnviar = new JButton("");
		btnEnviar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEnviar.setContentAreaFilled(false);
		btnEnviar.setBorder(null);
		btnEnviar.setBounds(998, 140, 220, 50);
		frame.getContentPane().add(btnEnviar);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorder(null);
		btnVoltar.setBounds(43, 41, 40, 25);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnScroll = new JButton("");
		btnScroll.setCursor(Cursor.getPredefinedCursor(Cursor.S_RESIZE_CURSOR));
		btnScroll.setContentAreaFilled(false);
		btnScroll.setBorder(null);
		btnScroll.setBounds(1248, 213, 18, 303);
		frame.getContentPane().add(btnScroll);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(TelaLojaNat.class.getResource("/imagens/bgLoja.png")));
		bg.setBounds(0, 0, 1288, 751);
		frame.getContentPane().add(bg);
	}

}
