package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private String nomeCliente;
	private String cpf, cep, numero;
	private String bairro, endereco;
	private int numeroCompras;
	private String catFavorita;
	private Date dataI = new Date();
	private DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	public Cliente(String nomeCliente, String cpf, String cep, String bairro, String endereco, String numero, int numeroCompras, String catFavorita) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpf = cpf;
		this.cep = cep;
		this.bairro = bairro;
		this.endereco = endereco;
		this.numero = numero;
		this.numeroCompras = numeroCompras;
		this.catFavorita = catFavorita;
		this.dataI = new Date(System.currentTimeMillis());
	}

	public int getNumeroCompras() {
		return numeroCompras;
	}

	public void setNumeroCompras(int numeroCompras) {
		this.numeroCompras = numeroCompras;
	}

	public String getCatFavorita() {
		return catFavorita;
	}

	public void setCatFavorita(String catFavorita) {
		this.catFavorita = catFavorita;
	}

	public String getDataI() {
		return df.format(dataI);
	}

	public void setDataI(Date dataI) {
		this.dataI = dataI;
	}

	public Cliente() {

	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		bairro = bairro;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}


}
