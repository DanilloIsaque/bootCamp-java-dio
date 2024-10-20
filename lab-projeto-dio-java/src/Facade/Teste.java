package Facade;
/*
 * prover uma interface que reduza a complexidade nas integrações com subsistemas
 * 
 */
public class Teste {

    public static void main(String[] args) {
        	
		Facade facade = new Facade();
		facade.migrarCliente("Venilton", "14801788");
    }
}
