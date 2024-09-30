package dio.scopes.app;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Remetente remetente(){
        System.out.println("CRIANDO UM OBJETO REMETENTE");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@dio.com.br");
        remetente.setNome("Digital Innovation One");
        return remetente;
    }

     /*  as duas variáveis estavam apontando para  a mesma referência, então cada vez q o spring tiver uma nova referência de um objeto
    dentro da aplicação o Remtente sofre alterações. cada execução, cada referência, ele terá um objeto pertinente e saberá q deve existir
    objetos para suas necessidade. Por isso o @Scope("prototype")
    */
}