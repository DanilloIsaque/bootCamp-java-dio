package Autodromo;



public class Autodromo {
    public static void main(String[] args) {
        Carro celta = new Carro();
        celta.setChassi("123456"); 
        celta.ligar();

        Moto xj6 = new Moto();
        xj6.setChassi("654878");
        xj6.ligar();


        Veiculo coringa = celta;
        coringa.ligar();
    }
    

}
