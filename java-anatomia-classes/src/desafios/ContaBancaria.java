package desafios;

import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria extends Exception{
    public static void main(String[] args) {
    Scanner scannerNumerico = new Scanner(System.in).useLocale(Locale.US);
    Scanner scannerTexto = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite seu nome:");
    String nome = scannerTexto.nextLine();


    System.out.println("Digite o número de sua agência:");
    while (!scannerNumerico.hasNextInt()) {
        System.out.println("Entrada. Por favor, digite um número:");
        scannerNumerico.next(); // Descarta a entrada inválida
    }
    Integer numeroAgencia = scannerNumerico.nextInt();

    System.out.println("Digite a sua agência:");
    String agencia = scannerTexto.nextLine();

    System.out.println("Digite seu saldo:");
    while (!scannerNumerico.hasNextDouble()) {
        System.out.println("Entrada inválida. Por favor, digite um número:");
        scannerNumerico.next(); // Descarta a entrada inválida
    }
    Double saldo = scannerNumerico.nextDouble();

    System.out.println("Olá,"+nome + ",obrigado por criar uma conta em nosso banco"+
    ",sua agência é "+agencia+" , conta "+ numeroAgencia+" e seu saldo "+saldo+" já está disponível para saque.");

    scannerTexto.close();
    scannerNumerico.close();

    }
    



}
