package br.dio.com.desafio.dominio;

public class Curso extends Conteudo
{
    private int CargaHoraria;

    public Curso()
    {

    }

    @Override
    public double CalcularXP() 
    {
        return XP_PADRAO * CargaHoraria;
    }

    public int getCargaHoraria() 
    {
        return CargaHoraria;
    }

    public void setCargaHoraria(int CargaHoraria) 
    {
        this.CargaHoraria = CargaHoraria;
    }


    @Override
    public String toString() 
    {
        return "{" +
            " Titulo ='" + getTitulo() + "'" +
            ", Descricao ='" + getDescricao() + "'" +
            ", CargaHoraria ='" + getCargaHoraria() + "'" +
            "}";
    }
}