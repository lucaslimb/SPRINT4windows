package telas;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import java.awt.Font;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Cursor;

public class TelaRelatorio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelatorio window = new TelaRelatorio();
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
	public TelaRelatorio() {
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
		
		JSpinner spinnerDataIni = new JSpinner();
		spinnerDataIni.setToolTipText("Data de Inicio");
		spinnerDataIni.setName("");
		spinnerDataIni.setForeground(new Color(255, 255, 255));
		spinnerDataIni.setBackground(new Color(255, 255, 255));
		spinnerDataIni.setModel(new SpinnerDateModel(new Date(1704078000000L), null, null, Calendar.DAY_OF_YEAR));
		spinnerDataIni.setOpaque(false);
		spinnerDataIni.setBorder(null);
		spinnerDataIni.setFont(new Font("Leelawadee UI", Font.PLAIN, 17));
		spinnerDataIni.setBounds(130, 361, 210, 42);
		frame.getContentPane().add(spinnerDataIni);
		
		JSpinner spinnerDataFim = new JSpinner();
		spinnerDataFim.setToolTipText("Data de Termino");
		spinnerDataFim.setModel(new SpinnerDateModel(new Date(1725850800000L), null, null, Calendar.DAY_OF_YEAR));
		spinnerDataFim.setOpaque(false);
		spinnerDataFim.setForeground(Color.WHITE);
		spinnerDataFim.setFont(new Font("Leelawadee UI", Font.PLAIN, 17));
		spinnerDataFim.setBorder(null);
		spinnerDataFim.setBackground(Color.WHITE);
		spinnerDataFim.setBounds(130, 443, 210, 42);
		frame.getContentPane().add(spinnerDataFim);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Vendas", "Estoque", "Lucro", "Clientes", "Produtos", "Outros"}));
		comboBox.setOpaque(false);
		comboBox.setLightWeightPopupEnabled(false);
		comboBox.setBorder(null);
		comboBox.setFont(new Font("Leelawadee UI", Font.PLAIN, 17));
		comboBox.setBounds(130, 532, 210, 42);
		frame.getContentPane().add(comboBox);
		
		JButton btnFiltrar = new JButton("");
		btnFiltrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFiltrar.setContentAreaFilled(false);
		btnFiltrar.setBorderPainted(false);
		btnFiltrar.setBorder(null);
		btnFiltrar.setBounds(119, 625, 232, 48);
		frame.getContentPane().add(btnFiltrar);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.setBorder(null);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setBounds(41, 33, 44, 23);
		frame.getContentPane().add(btnVoltar);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(TelaRelatorio.class.getResource("/imagens/bgRelatorios (2).png")));
		bg.setBounds(0, 0, 1288, 751);
		frame.getContentPane().add(bg);
	}
}
