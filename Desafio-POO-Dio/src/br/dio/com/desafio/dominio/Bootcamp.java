package br.dio.com.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Objects;

public class Bootcamp 
{
    private String Nome;
    private String Descricao;
    private LocalDate DataInical = LocalDate.now();
    private LocalDate DataFinal = DataInical.plusDays(45);
    private Set<Dev> DevsInscritos = new HashSet<>();
    private Set<Conteudo> Conteudos = new LinkedHashSet<>();


    public Bootcamp() 
    {
        
    }

    public String getNome() 
    {
        return Nome;
    }

    public void setNome(String Nome) 
    {
        this.Nome = Nome;
    }

    public String getDescricao() 
    {
        return Descricao;
    }

    public void setDescricao(String Descricao) 
    {
        this.Descricao = Descricao;
    }

    public LocalDate getDataInical() 
    {
        return DataInical;
    }

    public void setDataInical(LocalDate DataInical) 
    {
        this.DataInical = DataInical;
    }

    public LocalDate getDataFinal() 
    {
        return DataFinal;
    }

    public void setDataFinal(LocalDate DataFinal) 
    {
        this.DataFinal = DataFinal;
    }

    public Set<Dev> getDevsInscritos() 
    {
        return DevsInscritos;
    }

    public void setDevsInscritos(Set<Dev> DevsInscritos) 
    {
        this.DevsInscritos = DevsInscritos;
    }

    public Set<Conteudo> getConteudos() 
    {
        return Conteudos;
    }

    public void setConteudos(Set<Conteudo> Conteudos) 
    {
        this.Conteudos = Conteudos;
    }

    @Override
    public boolean equals(Object o) 
    {
        if (o == this)
            return true;
        if (!(o instanceof Bootcamp)) {
            return false;
        }
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(Nome, bootcamp.Nome) && Objects.equals(Descricao, bootcamp.Descricao) && Objects.equals(DataInical, bootcamp.DataInical) && Objects.equals(DataFinal, bootcamp.DataFinal) && Objects.equals(DevsInscritos, bootcamp.DevsInscritos) && Objects.equals(Conteudos, bootcamp.Conteudos);
    }

    @Override
    public int hashCode() 
    {
        return Objects.hash(Nome, Descricao, DataInical, DataFinal, DevsInscritos, Conteudos);
    }

}