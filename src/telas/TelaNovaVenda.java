package telas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SwingConstants;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class TelaNovaVenda {

	private JFrame frame;
	private JTextField txtNomeCliente;
	private JLabel lblCPF;
	private JLabel lblCEP;
	private JLabel lblBairro;
	private JLabel lblNumero;
	private JLabel lblEndereco;
	private JLabel lblResumo;
	private JLabel lblTotal;
	private JLabel lblNomeFicha;
	private JLabel lblTotalCompras;
	private JLabel lblCategoria;
	private JLabel lblClienteDesde;
	private JSpinner spinnerData;
	private JButton btnVoltar;
	private JButton btnRegistrar;
	private JButton btnAdicionarProduto;
	private JComboBox comboBoxProdutos;
	private JLabel lblProdutoImg;
	private JLabel lblValorProd;
	private JLabel lblQntdProd;
	private JLabel lblCategoriaNome;
	private JTextField txtCpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaNovaVenda window = new TelaNovaVenda();
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
	public TelaNovaVenda() {
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

		txtNomeCliente = new JTextField();
		String placeholder = "Fulano de Tal";
		txtNomeCliente.setText(placeholder);
		txtNomeCliente.setForeground(Color.GRAY);
		txtNomeCliente.setFont(txtNomeCliente.getFont().deriveFont(Font.ITALIC));

		txtNomeCliente.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (txtNomeCliente.getText().equals(placeholder)) {
					txtNomeCliente.setText("");
					txtNomeCliente.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (txtNomeCliente.getText().isEmpty()) {
					txtNomeCliente.setText(placeholder);
					txtNomeCliente.setForeground(Color.GRAY);
				}
			}
		});
		txtNomeCliente.setOpaque(false);
		txtNomeCliente.setBorder(null);
		txtNomeCliente.setFont(new Font("Leelawadee UI", Font.PLAIN, 13));
		txtNomeCliente.setBounds(317, 213, 276, 20);
		frame.getContentPane().add(txtNomeCliente);
		txtNomeCliente.setColumns(10);

		lblCEP = new JLabel("");
		lblCEP.setFont(new Font("Leelawadee UI", Font.PLAIN, 13));
		lblCEP.setBounds(320, 277, 150, 20);
		frame.getContentPane().add(lblCEP);

		lblBairro = new JLabel("");
		lblBairro.setFont(new Font("Leelawadee UI", Font.PLAIN, 13));
		lblBairro.setBounds(505, 277, 256, 20);
		frame.getContentPane().add(lblBairro);

		lblNumero = new JLabel("");
		lblNumero.setFont(new Font("Leelawadee UI", Font.PLAIN, 13));
		lblNumero.setBounds(795, 277, 150, 20);
		frame.getContentPane().add(lblNumero);

		lblEndereco = new JLabel("");
		lblEndereco.setFont(new Font("Leelawadee UI", Font.PLAIN, 13));
		lblEndereco.setBounds(317, 350, 628, 20);
		frame.getContentPane().add(lblEndereco);

		lblResumo = new JLabel("");
		lblResumo.setFont(new Font("Leelawadee UI", Font.PLAIN, 13));
		lblResumo.setBounds(309, 546, 940, 52);
		frame.getContentPane().add(lblResumo);

		lblTotal = new JLabel("");
		lblTotal.setFont(new Font("Leelawadee UI", Font.PLAIN, 13));
		lblTotal.setBounds(395, 606, 85, 20);
		frame.getContentPane().add(lblTotal);

		lblNomeFicha = new JLabel("Fulano de Tal");
		lblNomeFicha.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeFicha.setFont(new Font("Leelawadee UI", Font.BOLD, 23));
		lblNomeFicha.setBounds(24, 403, 256, 30);
		frame.getContentPane().add(lblNomeFicha);

		lblTotalCompras = new JLabel("Total de compras:");
		lblTotalCompras.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalCompras.setFont(new Font("Leelawadee UI", Font.PLAIN, 22));
		lblTotalCompras.setBounds(24, 470, 256, 30);
		frame.getContentPane().add(lblTotalCompras);

		lblCategoria = new JLabel("Categoria favorita");
		lblCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategoria.setFont(new Font("Leelawadee UI", Font.PLAIN, 22));
		lblCategoria.setBounds(24, 620, 256, 30);
		frame.getContentPane().add(lblCategoria);

		lblClienteDesde = new JLabel("Cliente desde:");
		lblClienteDesde.setHorizontalAlignment(SwingConstants.CENTER);
		lblClienteDesde.setFont(new Font("Leelawadee UI", Font.PLAIN, 22));
		lblClienteDesde.setBounds(24, 511, 256, 30);
		frame.getContentPane().add(lblClienteDesde);

		spinnerData = new JSpinner();
		spinnerData.setOpaque(false);
		spinnerData.setBorder(null);
		spinnerData.setModel(new SpinnerDateModel(new Date(1725850800000L), null, null, Calendar.DAY_OF_YEAR));
		spinnerData.setFont(new Font("Leelawadee UI", Font.PLAIN, 13));
		spinnerData.setBounds(795, 214, 156, 20);
		frame.getContentPane().add(spinnerData);

		btnVoltar = new JButton("");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				TelaInicial.main(null);
			}
		});
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setOpaque(false);
		btnVoltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBorder(null);
		btnVoltar.setBounds(64, 48, 41, 23);
		frame.getContentPane().add(btnVoltar);

		btnRegistrar = new JButton("");
		btnRegistrar.setContentAreaFilled(false);
		btnRegistrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnRegistrar.setBorderPainted(false);
		btnRegistrar.setBorder(null);
		btnRegistrar.setOpaque(false);
		btnRegistrar.setBounds(309, 666, 264, 29);
		frame.getContentPane().add(btnRegistrar);

		btnAdicionarProduto = new JButton("");
		btnAdicionarProduto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionarProduto.setContentAreaFilled(false);
		btnAdicionarProduto.setBorderPainted(false);
		btnAdicionarProduto.setBorder(null);
		btnAdicionarProduto.setBounds(998, 496, 264, 29);
		frame.getContentPane().add(btnAdicionarProduto);

		comboBoxProdutos = new JComboBox();
		comboBoxProdutos.setModel(new DefaultComboBoxModel(
				new String[] { "Paleta de Sombras", "Creme EKOS", "Sabonete Tododia", "Hidratane Tododia" }));
		comboBoxProdutos.setFont(new Font("Leelawadee UI", Font.PLAIN, 14));
		comboBoxProdutos.setOpaque(false);
		comboBoxProdutos.setBounds(1007, 189, 248, 22);
		frame.getContentPane().add(comboBoxProdutos);

		lblProdutoImg = new JLabel("");
		lblProdutoImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblProdutoImg.setIcon(new ImageIcon(TelaNovaVenda.class.getResource("/imagens/paleta.png")));
		lblProdutoImg.setBounds(1017, 231, 224, 192);
		frame.getContentPane().add(lblProdutoImg);

		lblValorProd = new JLabel("");
		lblValorProd.setFont(new Font("Leelawadee UI", Font.PLAIN, 13));
		lblValorProd.setBounds(1074, 434, 68, 20);
		frame.getContentPane().add(lblValorProd);

		lblQntdProd = new JLabel("");
		lblQntdProd.setFont(new Font("Leelawadee UI", Font.PLAIN, 13));
		lblQntdProd.setBounds(1074, 470, 68, 20);
		frame.getContentPane().add(lblQntdProd);

		lblCategoriaNome = new JLabel("");
		lblCategoriaNome.setForeground(new Color(0, 128, 64));
		lblCategoriaNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategoriaNome.setFont(new Font("Leelawadee UI", Font.PLAIN, 22));
		lblCategoriaNome.setBounds(24, 650, 256, 30);
		frame.getContentPane().add(lblCategoriaNome);

		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(TelaNovaVenda.class.getResource("/imagens/bgRegistrarVenda.png")));
		bg.setBounds(0, 0, 1288, 751);
		frame.getContentPane().add(bg);

		// Create the txtCpf JTextField
        JTextField txtCpf = new JTextField();
        txtCpf.setBounds(623, 214, 138, 20);
        txtCpf.setColumns(10);

        // Set initial placeholder for txtCpf
        String placeholderCpf = "12345678900";
        txtCpf.setText("12345678900");
        txtCpf.setForeground(Color.GRAY);
        txtCpf.setFont(txtCpf.getFont().deriveFont(Font.ITALIC));
        
        // Add FocusListener for txtCpf
        txtCpf.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                // Clear placeholder text on focus gained
                if (txtCpf.getText().equals(placeholderCpf)) {
                    txtCpf.setText("");
                    txtCpf.setForeground(Color.BLACK);
                    txtCpf.setFont(txtCpf.getFont().deriveFont(Font.PLAIN));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Reset placeholder text on focus lost if the field is empty
                if (txtCpf.getText().isEmpty()) {
                    txtCpf.setText(placeholderCpf);
                    txtCpf.setForeground(Color.GRAY);
                    txtCpf.setFont(txtCpf.getFont().deriveFont(Font.ITALIC));
                }
            }
        });
        
        txtCpf.setBorder(null);


        // Add txtCpf to the frame
        frame.getContentPane().add(txtCpf);

		frame.getContentPane().add(txtCpf);
	}
}
