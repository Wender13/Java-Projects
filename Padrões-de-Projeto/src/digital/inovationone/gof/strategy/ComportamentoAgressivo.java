package digital.inovationone.gof.strategy;

public class ComportamentoAgressivo implements Comportamento
{
    @Override
    public void Mover() {
       System.out.println("Movendo-se agressivamente...");
    }
}