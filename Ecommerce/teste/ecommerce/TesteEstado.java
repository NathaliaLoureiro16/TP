package ecommerce;

import org.junit.Assert;
import org.junit.Test;

import ecommerce.Estado;

public class TesteEstado {

	@Test
	public void deveCriarEstado() {
		Estado estado = new Estado("Rio Grande do Sul", "RS");
		Assert.assertEquals("Rio Grande do Sul", estado.getNome());
		Assert.assertEquals("RS", estado.getSigla());
	}

}
