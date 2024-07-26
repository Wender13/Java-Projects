package br.dio.com.desafio.dominio;

public abstract class Conteudo 
{
    protected static final double XP_PADRAO = 10d;

    private String Titulo;
    private String Descricao;

    public abstract double CalcularXP();

    

    /**
     * @return String return the Titulo
     */
    public String getTitulo() 
    {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) 
    {
        this.Titulo = Titulo;
    }

    /**
     * @return String return the Descricao
     */
    public String getDescricao() 
    {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) 
    {
        this.Descricao = Descricao;
    }

}