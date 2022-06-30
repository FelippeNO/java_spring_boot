package dio.aulaspringdatajpa;

import dio.aulaspringdatajpa.model.User;
import dio.aulaspringdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {

     List<User> users = repository.findByNameContaining("Felippe");
     for(User u: users){
         System.out.println(u);
     }

    }
}
