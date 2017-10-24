package ecommerce;

public class Contato {

	private String email;
	private String telefone;

	public Contato(String email, String telefone) {
		this.email = email;
		this.telefone = telefone;
		validarEmail();

	}

	private void validarEmail() {
		if (!email.contains("@")) {
			throw new RuntimeException("EMAIL INVALIDO COLOQUE UM @");

		}

	}

	public String getEmail() {
		return email;
	}

	public String getTelefone() {
		return telefone;
	}

}
