package digital.inovationone.gof.facade;

import subsistema01.crm.CRMService;
import subsistema01.subsistema02.cep.CEPApi;

public class Facade 
{
    public void MigrarCliente(String Nome, String Cep)
    {
        String Cidade = CEPApi.getInstancia().RecuperarCidade("CEP");
        String Estado = CEPApi.getInstancia().RecuperarEstado("CEP");

        CRMService.GravarCliente(Nome, Cep, Cidade, Estado);
    }
}