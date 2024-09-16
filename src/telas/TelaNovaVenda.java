package telas;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

import model.Cliente;

public class TelaNovaVenda {
	private double total = 0;
	private String aux = " ";
	private static String nomeCliente = "João Pedro", cpf = "12345667890", bairro = "Bela Vista";
	private static String endereco = "Av Paulista", cep = "01313930", numero = "1106";
	private static int numeroCompras = 10;
	private static String catFav = "Perfumes";
	private static Cliente cliente = new Cliente(nomeCliente, cpf, cep, bairro, endereco, numero, numeroCompras, catFav);
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
	private JComboBox comboBoxProdutos, comboBoxPagamento;
	private JLabel lblProdutoImg;
	private JLabel lblValorProd;
	private JLabel lblCategoriaNome;
	private JLabel lbldata;
	private JTextField txtCpf;
	private JButton btnProcCliente;
	private JLabel lblCategoriaR;
	private JSpinner spinnerQtd;
	private String nomes[]= { "Paleta de Sombras", "Creme EKOS", "Sabonete Tododia", "Hidratane Tododia" };
	private double classePreco[] = {80.99, 38.90, 28.90, 48.90};
	private String imgNomes[] = {"/imagens/paleta.png", "/imagens/cremeEKOS.png", "/imagens/saboneteTododia.png", "/imagens/hidratanteTododia.png"};
	private Icon iconesP[] = { new ImageIcon(getClass().getResource(imgNomes[0])),
			new ImageIcon(getClass().getResource(imgNomes[1])), 
			new ImageIcon(getClass().getResource(imgNomes[2])),
			new ImageIcon(getClass().getResource(imgNomes[3]))};
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
		lblTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotal.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
		lblTotal.setBounds(399, 604, 85, 20);
		frame.getContentPane().add(lblTotal);

		lblNomeFicha = new JLabel("Fulano de Tal");
		lblNomeFicha.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomeFicha.setFont(new Font("Leelawadee UI", Font.BOLD, 23));
		lblNomeFicha.setBounds(24, 403, 256, 30);
		frame.getContentPane().add(lblNomeFicha);
		
		lbldata = new JLabel("");
		lbldata.setHorizontalAlignment(SwingConstants.CENTER);
		lbldata.setFont(new Font("Leelawadee UI", Font.PLAIN, 22));
		lbldata.setBounds(24, 548, 256, 30);
		frame.getContentPane().add(lbldata);
		
		lblTotalCompras = new JLabel("Total de compras:");
		lblTotalCompras.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalCompras.setFont(new Font("Leelawadee UI", Font.PLAIN, 22));
		lblTotalCompras.setBounds(24, 470, 256, 30);
		frame.getContentPane().add(lblTotalCompras);

		lblCategoria = new JLabel("Categoria favorita");
		lblCategoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategoria.setFont(new Font("Leelawadee UI", Font.PLAIN, 22));
		lblCategoria.setBounds(24, 589, 256, 30);
		frame.getContentPane().add(lblCategoria);
		
		lblCategoriaR = new JLabel("");
		lblCategoriaR.setForeground(new Color(128, 255, 0));
		lblCategoriaR.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategoriaR.setFont(new Font("Leelawadee UI", Font.PLAIN, 22));
		lblCategoriaR.setBounds(25, 621, 256, 30);
		frame.getContentPane().add(lblCategoriaR);

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
		btnRegistrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 JOptionPane.showMessageDialog(frame, "Venda REGISTRADA!");
				limpaCampos();
			}
			
			
		});
		frame.getContentPane().add(btnRegistrar);

		btnAdicionarProduto = new JButton("");
		btnAdicionarProduto.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnAdicionarProduto.setContentAreaFilled(false);
		btnAdicionarProduto.setBorderPainted(false);
		btnAdicionarProduto.setBorder(null);
		btnAdicionarProduto.setBounds(998, 496, 264, 29);
		btnAdicionarProduto.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int qtd =(int) spinnerQtd.getValue();
				total = total+ (classePreco[comboBoxProdutos.getSelectedIndex()]*qtd);
				lblTotal.setText(String.valueOf(total));
				aux = aux + " " + String.valueOf(qtd) + "x " + nomes[comboBoxProdutos.getSelectedIndex()];
				lblResumo.setText(aux); 
				
			}
			
		});
		frame.getContentPane().add(btnAdicionarProduto);

		comboBoxProdutos = new JComboBox();
		comboBoxProdutos.setModel(new DefaultComboBoxModel(
				new String[] { "Paleta de Sombras", "Creme EKOS", "Sabonete Tododia", "Hidratane Tododia" }));
		comboBoxProdutos.setFont(new Font("Leelawadee UI", Font.PLAIN, 14));
		comboBoxProdutos.setOpaque(false);
		comboBoxProdutos.setBounds(1007, 189, 248, 22);
		comboBoxProdutos.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					lblProdutoImg.setIcon(iconesP[comboBoxProdutos.getSelectedIndex()]);
					lblValorProd.setText(String.valueOf(classePreco[comboBoxProdutos.getSelectedIndex()]));
				}
			}
			
		});
		frame.getContentPane().add(comboBoxProdutos);
		
		
		lblProdutoImg = new JLabel("");
		lblProdutoImg.setIcon(iconesP[0]);
		lblProdutoImg.setHorizontalAlignment(SwingConstants.CENTER);
		lblProdutoImg.setBounds(1014, 222, 224, 192);
		frame.getContentPane().add(lblProdutoImg);

		lblValorProd = new JLabel("");
		lblValorProd.setText(String.valueOf(classePreco[0]));
		lblValorProd.setFont(new Font("Leelawadee UI", Font.PLAIN, 15));
		lblValorProd.setBounds(1095, 431, 68, 20);
		
		frame.getContentPane().add(lblValorProd);


		spinnerQtd = new JSpinner();
		spinnerQtd.setModel(new SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
		spinnerQtd.setBorder(null);
		spinnerQtd.setOpaque(false);
		spinnerQtd.setFont(new Font("Leelawadee UI", Font.PLAIN, 13));
		spinnerQtd.setBounds(1075, 470, 33, 20);
		frame.getContentPane().add(spinnerQtd);
		
		lblCategoriaNome = new JLabel("");
		lblCategoriaNome.setForeground(new Color(0, 128, 64));
		lblCategoriaNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategoriaNome.setFont(new Font("Leelawadee UI", Font.PLAIN, 22));
		lblCategoriaNome.setBounds(24, 650, 256, 30);
		frame.getContentPane().add(lblCategoriaNome);
		
		comboBoxPagamento = new JComboBox();
		comboBoxPagamento.setModel(
				new DefaultComboBoxModel(new String[] {"Pix", "Crédito", "Débito", "Dinheiro", "Boleto"}));
		comboBoxPagamento.setOpaque(false);
		comboBoxPagamento.setFont(new Font("Leelawadee UI", Font.PLAIN, 14));
		comboBoxPagamento.setBorder(null);
		comboBoxPagamento.setBounds(317, 413, 207, 22);
		
		frame.getContentPane().add(comboBoxPagamento);

        JTextField txtCpf = new JTextField();
        txtCpf.setBounds(623, 214, 138, 20);
        txtCpf.setColumns(10);

        String placeholderCpf = "12345678900";
        txtCpf.setText("12345678900");
        txtCpf.setForeground(Color.GRAY);
        txtCpf.setFont(txtCpf.getFont().deriveFont(Font.ITALIC));
        
        txtCpf.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtCpf.getText().equals(placeholderCpf)) {
                    txtCpf.setText("");
                    txtCpf.setForeground(Color.BLACK);
                    txtCpf.setFont(txtCpf.getFont().deriveFont(Font.PLAIN));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtCpf.getText().isEmpty()) {
                    txtCpf.setText(placeholderCpf);
                    txtCpf.setForeground(Color.GRAY);
                    txtCpf.setFont(txtCpf.getFont().deriveFont(Font.ITALIC));
                }
            }
        });
        
        txtCpf.setBorder(null);

        frame.getContentPane().add(txtCpf);

		frame.getContentPane().add(txtCpf);
		
		btnProcCliente = new JButton("");
		btnProcCliente.setContentAreaFilled(false);
		btnProcCliente.setBounds(772, 413, 185, 28);
		btnProcCliente.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProcCliente.setBorderPainted(false);
		btnProcCliente.setBorder(null);
		btnProcCliente.setOpaque(false);
		btnProcCliente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 cpf = txtCpf.getText();
				 
				 if(cliente.getCpf().contains(cpf)) {
					 txtNomeCliente.setText(cliente.getNomeCliente());
					 lblBairro.setText(cliente.getBairro());
					 lblEndereco.setText(cliente.getEndereco());
					 lblNumero.setText(cliente.getNumero());
					 lblCEP.setText(cliente.getCep());
					 
					 lblNomeFicha.setText(cliente.getNomeCliente());
					 lblCategoriaR.setText(cliente.getCatFavorita());
					 lbldata.setText(cliente.getDataI());
					 lblTotalCompras.setText("Total compras: " + cliente.getNumeroCompras());
				 }else {
					 JOptionPane.showMessageDialog(frame, "CPF não encontrado!");
				 }
				
			}
			
		});
		
		frame.getContentPane().add(btnProcCliente);
		
		JLabel lblReais = new JLabel("R$");
		lblReais.setFont(new Font("Leelawadee UI", Font.PLAIN, 15));
		lblReais.setBounds(1075, 431, 33, 20);
		frame.getContentPane().add(lblReais);
		
		JLabel bg = new JLabel("");
		bg.setIcon(new ImageIcon(TelaNovaVenda.class.getResource("/imagens/bgRegistrarVenda.png")));
		bg.setBounds(0, 0, 1288, 751);
		frame.getContentPane().add(bg);
		
		
		
	}
	private void limpaCampos() {
		txtNomeCliente.setText("");
		lblCEP.setText("");
		lblBairro.setText("");
		lblEndereco.setText("");
		lblNumero.setText("");
		lblNomeFicha.setText("Fulano de Tal");
		lblCategoriaR.setText("");
		lbldata.setText("");
		lblTotalCompras.setText("Total de compras:");
		lblTotal.setText(" ");
		total =0;
	}
}
