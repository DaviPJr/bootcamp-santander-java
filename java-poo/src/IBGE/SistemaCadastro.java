package IBGE;
public class SistemaCadastro {
    public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa davi = new Pessoa("12345678", "Davi Junior");
		
		//definimos o endereço de marcos
		davi.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do marcos ?
		
		//imprimindo o marcos sem o nome e cpf
		
		System.out.println(davi.getNome() + "-" + davi.getCpf());
	}
}
