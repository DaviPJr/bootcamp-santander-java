package msn;

public class ComputadorPedrinho {
    public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
		
		/*
		   Trabalhando o polimorfismo, de acordo com o app escolhido, será implementado
		   o método de acordo com seu respectivo algoritmo
		 */
		String appEscolhido="tlg"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
