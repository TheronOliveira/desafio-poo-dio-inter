import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.Arrays;

public class main {
    public static void main(String[]args){
        Curso c1 = new Curso();
        c1.setTitulo("Java");
        c1.setDescricao("POO");
        c1.setCargaHoraria(100);

        System.out.println(c1.toString());

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Programação Java");
        m1.setDescricao("Progamação Orientado a Objetos");
        m1.setData(LocalDate.now());
        System.out.println(m1.toString());
    }
}

