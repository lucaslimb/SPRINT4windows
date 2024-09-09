package telas;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Cursor;

public class TelaEstoque {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEstoque window = new TelaEstoque();
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
	public TelaEstoque() {
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
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBorder(null);
		btnVoltar.setBounds(62, 46, 44, 23);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnCarrinho1 = new JButton("");
		btnCarrinho1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCarrinho1.setContentAreaFilled(false);
		btnCarrinho1.setBorderPainted(false);
		btnCarrinho1.setBorder(null);
		btnCarrinho1.setBounds(96, 373, 159, 23);
		frame.getContentPane().add(btnCarrinho1);
		
		JButton btnCarrinho2 = new JButton("");
		btnCarrinho2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCarrinho2.setContentAreaFilled(false);
		btnCarrinho2.setBorderPainted(false);
		btnCarrinho2.setBorder(null);
		btnCarrinho2.setBounds(96, 640, 159, 23);
		frame.getContentPane().add(btnCarrinho2);
		
		JButton btnCarrinho3 = new JButton("");
		btnCarrinho3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCarrinho3.setContentAreaFilled(false);
		btnCarrinho3.setBorderPainted(false);
		btnCarrinho3.setBorder(null);
		btnCarrinho3.setBounds(1005, 229, 159, 23);
		frame.getContentPane().add(btnCarrinho3);
		
		JButton btnCarrinho4 = new JButton("");
		btnCarrinho4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCarrinho4.setContentAreaFilled(false);
		btnCarrinho4.setBorderPainted(false);
		btnCarrinho4.setBorder(null);
		btnCarrinho4.setBounds(1005, 295, 159, 23);
		frame.getContentPane().add(btnCarrinho4);
		
		JButton btnCarrinho5 = new JButton("");
		btnCarrinho5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCarrinho5.setContentAreaFilled(false);
		btnCarrinho5.setBorderPainted(false);
		btnCarrinho5.setBorder(null);
		btnCarrinho5.setBounds(1005, 362, 159, 23);
		frame.getContentPane().add(btnCarrinho5);
		
		JButton btnCarrinho6 = new JButton("");
		btnCarrinho6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCarrinho6.setContentAreaFilled(false);
		btnCarrinho6.setBorderPainted(false);
		btnCarrinho6.setBorder(null);
		btnCarrinho6.setBounds(1005, 428, 159, 23);
		frame.getContentPane().add(btnCarrinho6);
		
		JButton btnCarrinho7 = new JButton("");
		btnCarrinho7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCarrinho7.setContentAreaFilled(false);
		btnCarrinho7.setBorderPainted(false);
		btnCarrinho7.setBorder(null);
		btnCarrinho7.setBounds(1005, 498, 159, 23);
		frame.getContentPane().add(btnCarrinho7);
		
		JButton btnCarrinho8 = new JButton("");
		btnCarrinho8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCarrinho8.setContentAreaFilled(false);
		btnCarrinho8.setBorderPainted(false);
		btnCarrinho8.setBorder(null);
		btnCarrinho8.setBounds(1005, 563, 159, 23);
		frame.getContentPane().add(btnCarrinho8);
		
		JButton btnLoja = new JButton("");
		btnLoja.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLoja.setContentAreaFilled(false);
		btnLoja.setBorderPainted(false);
		btnLoja.setBorder(null);
		btnLoja.setBounds(973, 632, 222, 48);
		frame.getContentPane().add(btnLoja);
		
		JButton btnScroll = new JButton("");
		btnScroll.setCursor(Cursor.getPredefinedCursor(Cursor.S_RESIZE_CURSOR));
		btnScroll.setContentAreaFilled(false);
		btnScroll.setBorderPainted(false);
		btnScroll.setBorder(null);
		btnScroll.setBounds(1240, 211, 18, 270);
		frame.getContentPane().add(btnScroll);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(TelaEstoque.class.getResource("/imagens/bgEstoque.png")));
		bg.setBounds(0, 0, 1288, 751);
		frame.getContentPane().add(bg);
	}

}
