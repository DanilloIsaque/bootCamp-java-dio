package desafios.DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, digite um número:");
            scanner.next(); // Descarta a entrada inválida
        }
		int parametroUm = scanner.nextInt();

		System.out.println("Digite o segundo parâmetro");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, digite um número:");
            scanner.next(); // Descarta a entrada inválida
        }
		int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm,parametroDois);
        } catch (ParametrosInvalidosException e) {
            
        }

        scanner.close();

    }
    

    static void contar(int parametroUm,int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm>parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        for(int i=1;i<=contagem;i++){
            System.out.println("Imprimindo o número "+i);
        }
    } 
}
