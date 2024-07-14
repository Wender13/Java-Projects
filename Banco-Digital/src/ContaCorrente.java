public class ContaCorrente extends Conta 
{
    @Override
    public void Extrato()
    {
        System.out.println("*** Extrato Conta Corrente ***");
        ExtratoAtributos();
    }
}