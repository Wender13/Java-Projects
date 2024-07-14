public abstract class Conta implements InterfaceConta
{
    protected static final int AGENCIA_PADRAO = 1;

    protected int Agencia;
    protected int Numero;
    protected double Saldo;

    protected static int SEQUENCIAL = 1;

    public Conta()
    {
        this.Agencia = AGENCIA_PADRAO;
        this.Numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return Agencia;
    }

    public int getNumero() {
        return Numero;
    }

    public double getSaldo() {
        return Saldo;
    }

    protected void ExtratoAtributos() {
        System.out.println(String.format("Agencia: %d", Agencia));
        System.out.println(String.format("Número: %d", Numero));
        System.out.println(String.format("Saldo: %.2f", Saldo));
    }

    @Override
    public void Depositar(double Valor) {
        Saldo += Valor;
    }
    
    @Override
    public void Sacar(double Valor) {
        Saldo -= Valor;
    }

    @Override
    public void Transferir(Conta Favorecido, double Valor) {
        this.Sacar(Valor);
        Favorecido.Depositar(Valor);
    }
}