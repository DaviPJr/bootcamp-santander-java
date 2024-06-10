package msn;
// trabalhando o conceito de herança, criamos a classe pai
// e trabalhando o conceito de abstração, tornamos a classe pai abstract 
// e obrigamos as classes filhas a implementarem seus métodos de suas formas particulares
public abstract class ServicoMensagemInstantanea  {
    public abstract void enviarMensagem();
	public abstract void receberMensagem();

    //somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
}
