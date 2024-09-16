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

public class TelaInfos {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInfos window = new TelaInfos();
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
	public TelaInfos() {
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
		
		JButton btnSeta = new JButton("");
		btnSeta.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSeta.setContentAreaFilled(false);
		btnSeta.setBorder(null);
		btnSeta.setBorderPainted(false);
		btnSeta.setBounds(27, 357, 45, 65);
		frame.getContentPane().add(btnSeta);
		
		JButton btnSeta2 = new JButton("");
		btnSeta2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSeta2.setContentAreaFilled(false);
		btnSeta2.setBorderPainted(false);
		btnSeta2.setBorder(null);
		btnSeta2.setBounds(1233, 357, 45, 65);
		frame.getContentPane().add(btnSeta2);
		
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
		btnVoltar.setBounds(63, 49, 39, 22);
		frame.getContentPane().add(btnVoltar);
		
		JButton btnProduto1 = new JButton("");
		btnProduto1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProduto1.setContentAreaFilled(false);
		btnProduto1.setBorderPainted(false);
		btnProduto1.setBorder(null);
		btnProduto1.setBounds(101, 269, 168, 239);
		frame.getContentPane().add(btnProduto1);
		
		JButton btnProduto2 = new JButton("");
		btnProduto2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProduto2.setContentAreaFilled(false);
		btnProduto2.setBorderPainted(false);
		btnProduto2.setBorder(null);
		btnProduto2.setBounds(330, 269, 168, 239);
		frame.getContentPane().add(btnProduto2);
		
		JButton btnProduto3 = new JButton("");
		btnProduto3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProduto3.setContentAreaFilled(false);
		btnProduto3.setBorderPainted(false);
		btnProduto3.setBorder(null);
		btnProduto3.setBounds(550, 269, 168, 239);
		frame.getContentPane().add(btnProduto3);
		
		JButton btnProduto4 = new JButton("");
		btnProduto4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProduto4.setContentAreaFilled(false);
		btnProduto4.setBorderPainted(false);
		btnProduto4.setBorder(null);
		btnProduto4.setBounds(759, 269, 453, 239);
		frame.getContentPane().add(btnProduto4);
		
		JButton btnVer1 = new JButton("");
		btnVer1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVer1.setContentAreaFilled(false);
		btnVer1.setBorderPainted(false);
		btnVer1.setBorder(null);
		btnVer1.setBounds(541, 675, 68, 12);
		frame.getContentPane().add(btnVer1);
		
		JButton btnVer2 = new JButton("");
		btnVer2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVer2.setContentAreaFilled(false);
		btnVer2.setBorderPainted(false);
		btnVer2.setBorder(null);
		btnVer2.setBounds(980, 675, 68, 17);
		frame.getContentPane().add(btnVer2);
		
		JButton btnSaiba = new JButton("");
		btnSaiba.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSaiba.setContentAreaFilled(false);
		btnSaiba.setBorderPainted(false);
		btnSaiba.setBorder(null);
		btnSaiba.setBounds(1158, 117, 68, 12);
		frame.getContentPane().add(btnSaiba);
		
		ActionListener actionListener = new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        frame.dispose();
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        TelaLojaNat.main(null);
		    }
		};

		btnProduto1.addActionListener(actionListener);
		btnProduto2.addActionListener(actionListener);
		btnProduto3.addActionListener(actionListener);
		btnProduto4.addActionListener(actionListener);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(TelaInfos.class.getResource("/imagens/bgInfos.png")));
		bg.setBounds(0, 0, 1288, 751);
		frame.getContentPane().add(bg);
	}

}
