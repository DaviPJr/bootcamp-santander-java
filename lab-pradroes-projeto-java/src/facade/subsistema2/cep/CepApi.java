package facade.subsistema2.cep;

import singleton.SingletonEager;

public class CepApi {

    private static CepApi cep = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return cep;
    }

    public String recuperarCidade(String cep) {
        return "Poços de Caldas";
    }

    public String recuperarEstado(String cep) {
        return "Minas Gerais";
    }
}
