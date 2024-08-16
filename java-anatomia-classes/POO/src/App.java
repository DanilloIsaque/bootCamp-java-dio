public class App {
    public static void main(String[] args) throws Exception {
       for(EstadoBrasileiro estado : EstadoBrasileiro.values()){
        System.out.println(estado.getSigla());
       }
    }
}
