package digital.inovationone.gof.strategy;

public class ComportamentoDefesivo implements Comportamento 
{

    @Override
    public void Mover() {
        System.out.println("Movendo defensivamente...");
    }
}