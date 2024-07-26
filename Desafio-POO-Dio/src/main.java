import java.time.LocalDate;

import br.dio.com.desafio.dominio.Bootcamp;
import br.dio.com.desafio.dominio.Curso;
import br.dio.com.desafio.dominio.Dev;
import br.dio.com.desafio.dominio.Mentoria;

public class main {
    public static void main(String[] args) {
        Curso curso01 = new Curso();
        curso01.setTitulo("Curso Estrutura de Dados com C");
        curso01.setDescricao("Princípios das Estruturas de Dados com C");
        curso01.setCargaHoraria(45);
        Curso curso02 = new Curso();
        curso02.setTitulo("Princípios do Java");
        curso02.setDescricao("Introdução à Linguagem Java");
        curso02.setCargaHoraria(20);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Programação Orientada a Objetos");
        mentoria.setTitulo("Descrição Mentoria");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Descrição Bootcamp Java Dev");
        bootcamp.getConteudos().add(curso01);
        bootcamp.getConteudos().add(curso02);
        bootcamp.getConteudos().add(mentoria);

        Dev dev01 = new Dev();
        dev01.setNome("Mateus");
        dev01.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Mateus: " + dev01.getConteudosInscritos());
        dev01.Progredir();
        dev01.Progredir();
        dev01.Progredir();
        System.out.println("-------------------------------------");
        System.out.println("Conteúdos inscritos Mateus: " + dev01.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Mateus: " + dev01.getConteudosConcluidos());
        System.out.println("XP Mateus: " + dev01.CalcularXP());
        
        System.out.println("-------------------------------------");
        
        Dev dev02 = new Dev();
        dev02.setNome("João");
        dev02.InscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + dev02.getConteudosInscritos());
        dev02.Progredir();
        dev02.Progredir();
        dev02.Progredir();
        System.out.println("-------------------------------------");
        System.out.println("Conteúdos inscritos João: " + dev02.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João: " + dev02.getConteudosConcluidos());
        System.out.println("XP João: " + dev02.CalcularXP());

    }
}