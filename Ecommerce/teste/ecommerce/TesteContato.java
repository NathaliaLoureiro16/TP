package ecommerce;

import org.junit.Assert;
import org.junit.Test;

import ecommerce.Contato;

public class TesteContato {

	@Test
	public void deveCriarContato() {
		Contato contato = new Contato("fulano@javamail.com", "55517070-6070");
		Assert.assertEquals("fulano@javamail.com", contato.getEmail());
		Assert.assertEquals("55517070-6070", contato.getTelefone());
	}

	@Test(expected = RuntimeException.class)
	public void deveValidarEmail() {
		new Contato("fulanojavamail.com", "55517070-6070");

	}

}
