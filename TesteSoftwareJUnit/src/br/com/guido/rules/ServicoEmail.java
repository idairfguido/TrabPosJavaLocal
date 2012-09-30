package br.com.guido.rules;

import br.com.guido.model.Email;

public class ServicoEmail {

	public static final boolean ENVIO_SUCESSO = true;
	public static final boolean ENVIO_FALHA = false;

	public static boolean enviar(Email email) {

		if ((!email.getRemetente().equals(""))
				&& (!email.getDestinatario().equals(""))
				&& (!email.getAssunto().equals(""))
				&& (!email.getMensagem().equals(""))) {
			
			System.out.println(email+" enviada com sucesso");
			
			return ENVIO_SUCESSO;
		}
		System.out.println("Ops!! a mensagem nao pode ser enviada!!");
		return ENVIO_FALHA;
	}

}
