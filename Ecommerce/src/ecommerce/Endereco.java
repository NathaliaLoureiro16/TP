package ecommerce;

public class Endereco {

	private String rua;
	private String numero;
	private String bairro;
	private String complemento;
	private String tipo;
	private String cep;
	private Cidade cidade;

	public Endereco(String rua, String bairro, String tipo, String cep,
			Cidade cidade) {
		this.rua = rua;
		this.bairro = bairro;
		this.tipo = tipo;
		this.cep = cep;
		this.cidade = cidade;

	}

	public String getRua() {
		return rua;
	}

	public String getNumero() {
		return numero;
	}

	public String getBairro() {
		return bairro;
	}

	public String getComplemento() {
		return complemento;
	}

	public String getTipo() {
		return tipo;
	}

	public String getCep() {
		return cep;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	

}
