package subsistema01.crm;

public class CRMService {

private CRMService(){super();}

    public static void GravarCliente(String Nome, String CEP, String Cidade, String Estado)
    {
        System.out.println("Cliente salvo no sistema de CRM.");
        System.out.println(Nome);
        System.out.println(CEP);
        System.out.println(Cidade);
        System.out.println(Estado);
    }
}