package br.com.guido.model;

public class Email {

	private String remetente;
	private String destinatario;
	private String mensagem;
	private String assunto;

	public Email() {

	}

	public Email(String remetente, String destinatario, String mensagem,
			String assunto) {
		this.setRemetente(remetente);
		this.setDestinatario(destinatario);
		this.setMensagem(mensagem);
		this.setAssunto(assunto);
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	@Override
	public String toString() {
		return "Mensagem de [" + this.getRemetente() + "] para ["
				+ this.getDestinatario() + "]";
	}

}
