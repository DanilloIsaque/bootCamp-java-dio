package Strategy;
/*
 * Define uma família de algoritmos, encapsula cada um e os torna intercambiáveis. 
 * O padrão Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.
 * 
 */
public class Test {
    public static void main(String[] args) {

        Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
    }
    
}
