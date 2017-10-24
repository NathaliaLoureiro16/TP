package ecommerce;

import org.junit.Assert;
import org.junit.Test;

import ecommerce.Cidade;
import ecommerce.Estado;

public class TesteCidade {

	@Test
	public void deveCriarCidade() {
		Estado estado = new Estado("Rio Grande do Sul", "RS");
		Cidade cidade = new Cidade("Porto Alegre", estado);
		Assert.assertEquals("Porto Alegre", cidade.getNome());
		Assert.assertEquals(estado, cidade.getEstado());
	}

}
