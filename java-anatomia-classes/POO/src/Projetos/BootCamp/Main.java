package BootCamp;

import java.time.LocalDate;

public class Main {
    
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("POO com Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJs = new Curso();
        cursoJs.setTitulo("Curso JavaScript");
        cursoJs.setDescricao("Aprenda JavaScript do básico ao avançado");
        cursoJs.setCargaHoraria(4);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Tire suas dúvidas sobre Java");
        mentoriaJava.setData(LocalDate.now());

        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp para desenvolvedores Java");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJs);
        bootcamp.getConteudos().add(mentoriaJava);

        
        Dev devDanillo = new Dev();
        devDanillo.setNome("Danillo");
        devDanillo.inscreverBootcamp(bootcamp);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);

        
        System.out.println("=== Conteúdos do Bootcamp ===");
        for (Conteudo conteudo : bootcamp.getConteudos()) {
            conteudo.imprimirInfos();
            System.out.println("-----------------------------");
        }

        System.out.println("=== Progresso dos Devs ===");
        System.out.println("Conteúdos Inscritos Danillo: " + devDanillo.getConteudosInscritos());
        devDanillo.progredir();
        devDanillo.progredir();
        System.out.println("Conteúdos Inscritos Danillo após progressão: " + devDanillo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Danillo: " + devDanillo.getConteudosConcluidos());
        System.out.println("XP Danillo: " + devDanillo.calcularTotalXp());

        System.out.println("----");

        System.out.println("Conteúdos Inscritos Maria: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("Conteúdos Inscritos Maria após progressão: " + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maria: " + devMaria.getConteudosConcluidos());
        System.out.println("XP Maria: " + devMaria.calcularTotalXp());
    }
}
