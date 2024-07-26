package br.dio.com.desafio.dominio;

import java.util.Set;

import javax.swing.text.html.Option;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;

public class Dev 
{
    private String Nome;
    private Set<Conteudo> ConteudosInscritos = new LinkedHashSet();
    private Set<Conteudo> ConteudosConcluidos = new LinkedHashSet();

    public Dev() 
    {

    }

    public void InscreverBootcamp(Bootcamp bootcamp)
    {
        this.ConteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public double CalcularXP()
    {
        return this.ConteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::CalcularXP)
                .sum();
    }

    public void Progredir()
    {
        Optional<Conteudo> Conteudos = this.ConteudosInscritos.stream().findFirst();
        if (Conteudos.isPresent()) 
        {
            this.ConteudosConcluidos.add(Conteudos.get());
            this.ConteudosInscritos.remove(Conteudos.get());
        }
        else
        {
            System.err.println("Você não está matriculado(a) em nenhum conteúdo!");
        }
    }

    public String getNome() 
    {
        return Nome;
    }

    public void setNome(String Nome) 
    {
        this.Nome = Nome;
    }

    public Set<Conteudo> getConteudosInscritos() 
    {
        return ConteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> ConteudosInscritos) 
    {
        this.ConteudosInscritos = ConteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() 
    {
        return ConteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> ConteudosConcluidos) 
    {
        this.ConteudosConcluidos = ConteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) 
    {
        if (o == this) return true;
        if (!(o instanceof Dev)) {return false;        }
        Dev dev = (Dev) o;
        return Objects.equals(Nome, dev.Nome) && Objects.equals(ConteudosInscritos, dev.ConteudosInscritos) && Objects.equals(ConteudosConcluidos, dev.ConteudosConcluidos);
    }

    @Override
    public int hashCode() {return Objects.hash(Nome, ConteudosInscritos, ConteudosConcluidos);}

    @Override
    public String toString() 
    {
        return "{" +
            " Nome='" + getNome() + "'" +
            ", ConteudosInscritos ='" + getConteudosInscritos() + "'" +
            ", ConteudosConcluidos ='" + getConteudosConcluidos() + "'" +
            "}";
    }
}