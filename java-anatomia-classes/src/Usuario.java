public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);
        System.out.println(smartTv.ligada);

        smartTv.ligar();
        System.out.println(smartTv.ligada);


    }
}
