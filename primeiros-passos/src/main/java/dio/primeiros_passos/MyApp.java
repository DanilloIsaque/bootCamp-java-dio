package dio.primeiros_passos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner { //quando eu inicializo a aplicação , o programa cria um component calculadora,
    // que terá como dependência a calculadora e executa a aplicação

    @Autowired //injetar uma depêndencia de um componente para outro
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
		System.out.println(calculadora.somar(2,7));
    }

    
    
}
