package dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(10);

        // System.out.println(curso1);
        // System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        // Tudo que eu tenho em conteudo eu tenho em curso
        // Mas nem tudo que eu tenho em curso eu tenho em conteudo
        // Isso é polimorfismo
        // Conteudo conteudo = new Curso();
        // Conteudo conteudo1 = new Mentoria();

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev davi = new Dev();
        davi.setNome("Davi");
        davi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + davi.getConteudosInscritos());
        davi.progredir();
        davi.progredir();
        davi.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + davi.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + davi.getConteudosConcluidos());
        System.out.println("XP: " + davi.calcularTotalXP());


        System.out.println("----------------");

        Dev joao = new Dev();
        joao.setNome("João");
        joao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + joao.getConteudosInscritos());
        joao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos: " + joao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos: " + joao.getConteudosConcluidos());
        System.out.println("XP: " + joao.calcularTotalXP());
    
    }
}
