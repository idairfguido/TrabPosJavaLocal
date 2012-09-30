package br.com.guido.test;


import org.junit.Test;

import br.com.guido.model.Email;
import br.com.guido.rules.ServicoEmail;

import junit.framework.TestCase;

public class ServicoEmailTest extends TestCase {

	private Email email;
	
	@Test
	public void testEnviar() {
		//fail("Not yet implemented");
		
		boolean valorEsperado = ServicoEmail.ENVIO_SUCESSO;
		
		
		//Caso de Sucesso
		//email = new Email("idairguido@gmail.com", "teste@teste.com", "Testando com JUnit", "Teste de Software");
		//assertEquals(valorEsperado, ServicoEmail.enviar(email));
		
		//Caso de Erro
		email = new Email("idairguido@gmail.com", "", null, "Teste de Software");
		assertEquals(valorEsperado, ServicoEmail.enviar(email));
	}

}
