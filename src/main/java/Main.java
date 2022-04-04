import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setCargaHoraria(8);
        curso1.setDescricao("Descricao curso java");

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setCargaHoraria(4);
        curso2.setDescricao("Descricao curso javascript");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devCamila.getNome() + " : " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos inscritos " + devCamila.getNome() + " : " + devCamila.getConteudosConcluidos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + devCamila.getNome() + " : " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos inscritos " + devCamila.getNome() + " : " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());
        System.out.println("-------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devJoao.getNome() + " : " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos inscritos " + devJoao.getNome() + " : " + devJoao.getConteudosConcluidos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + devJoao.getNome() + " : " + devJoao.getConteudosInscritos());
        System.out.println("Conteudos inscritos " + devJoao.getNome() + " : " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());





    }
}
