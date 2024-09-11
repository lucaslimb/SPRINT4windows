package telas;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial window = new TelaInicial();
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
	public TelaInicial() {
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
		
		JButton btnNovaVenda = new JButton("");
		btnNovaVenda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				TelaNovaVenda.main(null);
			}
		});
		btnNovaVenda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNovaVenda.setContentAreaFilled(false);
		btnNovaVenda.setBorderPainted(false);
		btnNovaVenda.setBorder(null);
		btnNovaVenda.setBounds(57, 161, 347, 56);
		frame.getContentPane().add(btnNovaVenda);
				
				JButton btnRelatorios = new JButton("");
				btnRelatorios.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.dispose();
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						TelaRelatorio.main(null);
					}
				});
				btnRelatorios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnRelatorios.setContentAreaFilled(false);
				btnRelatorios.setBorderPainted(false);
				btnRelatorios.setBorder(null);
				btnRelatorios.setBounds(57, 252, 347, 56);
				frame.getContentPane().add(btnRelatorios);
				
				JButton btnInfos = new JButton("");
				btnInfos.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						frame.dispose();
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						TelaInfos.main(null);
					}
				});
				btnInfos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnInfos.setContentAreaFilled(false);
				btnInfos.setBorderPainted(false);
				btnInfos.setBorder(null);
				btnInfos.setBounds(57, 349, 347, 56);
				frame.getContentPane().add(btnInfos);
				
				JButton btnMinhasVendas = new JButton("");
				btnMinhasVendas.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.dispose();
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						TelaVendas.main(null);
					}
				});
				btnMinhasVendas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnMinhasVendas.setContentAreaFilled(false);
				btnMinhasVendas.setBorderPainted(false);
				btnMinhasVendas.setBorder(null);
				btnMinhasVendas.setBounds(57, 446, 347, 56);
				frame.getContentPane().add(btnMinhasVendas);
				
				JButton btnEstoque = new JButton("");
				btnEstoque.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.dispose();
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						TelaEstoque.main(null);
					}
				});
				btnEstoque.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnEstoque.setContentAreaFilled(false);
				btnEstoque.setBorderPainted(false);
				btnEstoque.setBorder(null);
				btnEstoque.setBounds(57, 542, 347, 56);
				frame.getContentPane().add(btnEstoque);
				
				JButton btnClientes = new JButton("");
				btnClientes.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						frame.dispose();
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						TelaClientes.main(null);
					}
				});
				btnClientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				btnClientes.setContentAreaFilled(false);
				btnClientes.setBorderPainted(false);
				btnClientes.setBorder(null);
				btnClientes.setBounds(57, 631, 347, 56);
				frame.getContentPane().add(btnClientes);
						
						JButton btnVoltar = new JButton("");
						btnVoltar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								frame.dispose();
								frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								TelaLogin.main(null);
							}
						});
						btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnVoltar.setContentAreaFilled(false);
						btnVoltar.setBorderPainted(false);
						btnVoltar.setBorder(null);
						btnVoltar.setBounds(51, 708, 42, 32);
						frame.getContentPane().add(btnVoltar);
						
						JButton btnVerMais = new JButton("");
						btnVerMais.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								frame.dispose();
								frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								TelaVendas.main(null);
							}
						});
						btnVerMais.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnVerMais.setContentAreaFilled(false);
						btnVerMais.setBorderPainted(false);
						btnVerMais.setBorder(null);
						btnVerMais.setBounds(1137, 141, 97, 26);
						frame.getContentPane().add(btnVerMais);
						
						JButton btnEntenda = new JButton("");
						btnEntenda.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								frame.dispose();
								frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								TelaInfos.main(null);
							}
						});
						btnEntenda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnEntenda.setContentAreaFilled(false);
						btnEntenda.setBorderPainted(false);
						btnEntenda.setBorder(null);
						btnEntenda.setBounds(1142, 300, 84, 26);
						frame.getContentPane().add(btnEntenda);
						
						JButton btnLojaNat = new JButton("");
						btnLojaNat.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								frame.dispose();
								frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								TelaLojaNat.main(null);
							}
						});
						btnLojaNat.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
						btnLojaNat.setContentAreaFilled(false);
						btnLojaNat.setBorderPainted(false);
						btnLojaNat.setBorder(null);
						btnLojaNat.setBounds(779, 509, 455, 216);
						frame.getContentPane().add(btnLojaNat);
								
								JButton btnConfigs = new JButton("");
								btnConfigs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
								btnConfigs.setContentAreaFilled(false);
								btnConfigs.setBorderPainted(false);
								btnConfigs.setBorder(null);
								btnConfigs.setBounds(437, 22, 42, 37);
								frame.getContentPane().add(btnConfigs);
								
										JLabel bg = new JLabel("");
										bg.setIcon(new ImageIcon(TelaInicial.class.getResource("/imagens/bgInicio.png")));
										bg.setBounds(0, 0, 1288, 751);
										frame.getContentPane().add(bg);
	}

}
