package digital.inovationone.gof;

import digital.inovationone.gof.facade.Facade;
import digital.inovationone.gof.singleton.SingletonEager;
import digital.inovationone.gof.singleton.SingletonLazy;
import digital.inovationone.gof.singleton.SingletonLazyHolder;
import digital.inovationone.gof.strategy.Comportamento;
import digital.inovationone.gof.strategy.ComportamentoAgressivo;
import digital.inovationone.gof.strategy.ComportamentoDefesivo;
import digital.inovationone.gof.strategy.ComportamentoNormal;
import digital.inovationone.gof.strategy.Robo;

public class Test {
    public static void main(String[] args) {
        
        //Singleton
        // SingletonLazy lazy = SingletonLazy.getInstancia();
        // System.out.println(lazy);
        // lazy = SingletonLazy.getInstancia();
        // System.out.println(lazy);

        // SingletonEager eager = SingletonEager.getInstancia();
        // System.out.println(eager);
        // eager = SingletonEager.getInstancia();
        // System.out.println(eager);

        // SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        // System.out.println(lazyHolder);
        // lazyHolder = SingletonLazyHolder.getInstancia();
        // System.out.println(lazyHolder);

        //Strategy
        // Comportamento Normal = new ComportamentoNormal();
        // Comportamento Defensivo = new ComportamentoDefesivo();
        // Comportamento Agressivo = new ComportamentoAgressivo();

        // Robo Robo = new Robo();
        // Robo.setComportamento(Normal);

        // Robo.Mover();

        //Facade

        Facade Facade = new Facade();
        Facade.MigrarCliente("Mateus", "74.710-080");
    }
}