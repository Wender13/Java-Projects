public abstract interface InterfaceConta 
{
    void Depositar(double Valor);

    void Sacar(double Valor);

    void Transferir(Conta Favorecido, double Valor);

    void Extrato();
}