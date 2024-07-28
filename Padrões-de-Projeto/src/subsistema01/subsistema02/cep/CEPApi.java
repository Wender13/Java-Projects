package subsistema01.subsistema02.cep;

import digital.inovationone.gof.singleton.SingletonEager;

public class CEPApi {
    private static CEPApi instancia = new CEPApi();

    private CEPApi(){super();}

    public static CEPApi getInstancia(){return instancia;}  
    
    public String RecuperarCidade(String CEP){return "Goiânia";}
    
    public String RecuperarEstado(String CEP){return "Goiás";}
}