package dio.data_jpa;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import dio.data_jpa.model.User;
import dio.data_jpa.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner { // assim que inicializa o container, ele executa automaticamente

    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.findByNameContaining("GLEYSON");
        for(User u: users){
            System.out.println(u);
        }
    }
    private void insertUser(){
        User user = new User();
        user.setName("Danillo Isaque");
        user.setUsername("danIsaque");
        user.setPassword("123456");
        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }
}