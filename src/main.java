import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Arrays;

public class main {
    public static void main(String[]args){
        Curso c1 = new Curso();
        c1.setTitulo("Java");
        c1.setDescricao("POO");
        c1.setCargaHoraria(100);
        System.out.println("Curso 1 --> " + c1.toString());

        Curso c2 = new Curso();
        c2.setTitulo("Maven");
        c2.setDescricao("Gerenciamento de dependências com Maven");
        c2.setCargaHoraria(80);
        System.out.println("Curso 2 --> " + c2.toString());

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Programação Java");
        m1.setDescricao("Progamação Orientado a Objetos");
        m1.setData(LocalDate.now());
        System.out.println("Mentoria 1 --> " + m1.toString());

        System.out.println("--------------------------------");

        Bootcamp boot1 = new Bootcamp();
        boot1.setNome("Java Developer");
        boot1.setDescricao("Bootcamp Java Developer");
        boot1.getConteudos().add(c1);
        boot1.getConteudos().add(c2);
        boot1.getConteudos().add(m1);

        Dev dev1 = new Dev();
        dev1.setNome("Developer 1");
        dev1.inscreverBootcampo(boot1);
        System.out.println("Conteúdos inscritos " + dev1.getConteudosInscritos());
        System.out.println("XP " + dev1.calcularTotalXp());
        dev1.progredir();
        System.out.println("Conteúdos inscritos " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + dev1.getConteudosConcluidos());
        System.out.println("XP " + dev1.calcularTotalXp());
    }
}

