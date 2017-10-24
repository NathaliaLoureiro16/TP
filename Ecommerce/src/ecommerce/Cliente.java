package ecommerce;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Cliente extends Pessoa {

	private String nome;

	private String cpf;

	private String rg;

	private Calendar dataNascimento;

	private List<Endereco> enderecos;

	public Cliente(String nome, String cpf, Contato contato, Calendar dataNascimento, Endereco endereco) {
		super(contato);
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		validarTamanhoNome();
		validarDataNascimento();
		this.enderecos = new ArrayList<>();
		adicionarEndereco(endereco);
	}

	private void validarDataNascimento() {
		if (dataNascimento.after(Calendar.getInstance())) {
			throw new RuntimeException("Data igual ou maior que a atual.");
		}

	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void adicionarEndereco(Endereco endereco) {
		this.enderecos.add(endereco);
	}

	public void validarTamanhoNome() {
		if (nome.length() < 10) {
			throw new RuntimeException("Nome com menos de 10 caracteres");
		}
	}

}
