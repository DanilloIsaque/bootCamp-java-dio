package Generics;

public class Main {

    public static void main(String[] args) {
        
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();

        bolsaNinja.addFerramentas(new Kunai("Kunai explosiva"));
        bolsaNinja.addFerramentas(new Shuriken(15));
        bolsaNinja.addFerramentas(new Pergaminho("Olá, Mundo"));

        System.out.println("Itens");
        bolsaNinja.mostrarLista();



    }
}
