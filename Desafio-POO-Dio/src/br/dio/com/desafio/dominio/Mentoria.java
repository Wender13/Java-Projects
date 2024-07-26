package br.dio.com.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo
{
    private LocalDate Data;

    public Mentoria()
    {

    }

    @Override
    public double CalcularXP() 
    {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() 
    {
        return this.Data;
    }
    
    public void setData(LocalDate Data) 
    {
        this.Data = Data;
    }

    @Override
    public String toString() 
    {
        return "{" +
            " Titulo ='" + getTitulo() + "'" +
            ", Descricao ='" + getDescricao() + "'" +
            ", Data ='" + getData() + "'" +
            "}";
    }
}