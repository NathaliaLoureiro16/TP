package ecommerce;

import org.junit.Assert;
import org.junit.Test;

import ecommerce.Cidade;
import ecommerce.Endereco;
import ecommerce.Estado;

public class TesteEndereco {

	@Test
	public void deveCriarEndereco() {
		Estado estado = new Estado("Rio Grande do Sul", "RS");
		Cidade cidade = new Cidade("Porto Alegre", estado);
		Endereco endereco = new Endereco("Av ipiranga", "Jardim Botanico", "Residencial", "91000",cidade);
		Assert.assertEquals("Av ipiranga", endereco.getRua());
		Assert.assertEquals("100", endereco.getNumero());
		Assert.assertEquals("Jardim Botanico", endereco.getBairro());
		Assert.assertEquals("Apartamento", endereco.getComplemento());
		Assert.assertEquals("91000", endereco.getCep());
		Assert.assertEquals("Residencial", endereco.getTipo());
		Assert.assertEquals(cidade, endereco.getCidade());

	}
}
