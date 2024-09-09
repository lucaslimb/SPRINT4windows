package telas;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Cursor;

public class TelaVendas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVendas window = new TelaVendas();
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
	public TelaVendas() {
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
		
		JButton btnScroll = new JButton("");
		btnScroll.setCursor(Cursor.getPredefinedCursor(Cursor.S_RESIZE_CURSOR));
		btnScroll.setContentAreaFilled(false);
		btnScroll.setBorder(null);
		btnScroll.setBounds(1266, 248, 22, 273);
		frame.getContentPane().add(btnScroll);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorder(null);
		btnVoltar.setBounds(62, 50, 41, 17);
		frame.getContentPane().add(btnVoltar);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(TelaVendas.class.getResource("/imagens/bgVendas.png")));
		bg.setBounds(0, 0, 1288, 751);
		frame.getContentPane().add(bg);
	}

}
