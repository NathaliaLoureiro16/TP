package ecommerce;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

public class TesteCliente {
	
	@Test
	public void deveCriarCliente(){
		Estado estado = new Estado("Rio Grande do Sul", "RS");
		Cidade cidade = new Cidade("Porto Alegre", estado);
		Endereco endereco = new Endereco("Av ipiranga", "Jardim Botanico","Residencial", "91000",cidade);
		Contato contato = new Contato("fulano@javamail.com", "55517070-6070");
		Calendar nascimento = Calendar.getInstance();
		nascimento.add(Calendar.YEAR, -10);
		Cliente cliente = new Cliente ("Java da Silva","000.123.456-00",contato,nascimento ,endereco);
		Assert.assertEquals("Java da Silva", cliente.getNome());
		Assert.assertEquals("000.123.456-00", cliente.getCpf());
		Assert.assertEquals(contato, cliente.getContato());
		Assert.assertEquals(nascimento, cliente.getDataNascimento());
		Assert.assertEquals(endereco, cliente.getEnderecos().get(0));
		
	}

	@Test(expected=RuntimeException.class)
	public void deveValidarNome(){
		Estado estado = new Estado("Rio Grande do Sul", "RS");
		Cidade cidade = new Cidade("Porto Alegre", estado);
		Endereco endereco = new Endereco("Av ipiranga", "Jardim Botanico","Residencial", "91000",cidade);
		Contato contato = new Contato("fulano@javamail.com", "55517070-6070");
		Calendar nascimento = Calendar.getInstance();
		nascimento.add(Calendar.YEAR, -10);
		new Cliente ("Java","000.123.456-00",contato,nascimento ,endereco);

	}
	@Test(expected=RuntimeException.class)
	public void deveVerificarSeDataNascimentoNaoEhIgualADataAtual(){
		Contato contatoDoGuilherme = new Contato("guilherme@testejava.com","99999-9999");
		Estado estadoDoGuilherme = new Estado("Rio Grande do Sul", "RS");
		Cidade cidadeDoGuilherme = new Cidade("Porto Alegre", estadoDoGuilherme);
		Endereco enderecoDoGuilherme = new Endereco("Av Assis Brasil", "São João","Comercial", "91010",cidadeDoGuilherme);
		Calendar nascimentoDoGuilherme = Calendar.getInstance();
		nascimentoDoGuilherme.add(Calendar.DATE, +1);
		new Cliente("Guilherme Faria","000000",contatoDoGuilherme, nascimentoDoGuilherme, enderecoDoGuilherme);
		
		
	}
}
