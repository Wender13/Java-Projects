package digital.inovationone.gof.strategy;

public class Robo 
{
    private Comportamento Comportamento;

    public Comportamento getComportamento() {
        return Comportamento;
    }

    public void setComportamento(Comportamento Comportamento) {
        this.Comportamento = Comportamento;
    }

    public void Mover(){Comportamento.Mover();}

}