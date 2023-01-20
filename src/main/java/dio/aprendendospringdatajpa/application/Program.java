package dio.aprendendospringdatajpa.application;

import dio.aprendendospringdatajpa.model.User;
import dio.aprendendospringdatajpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Program implements CommandLineRunner {

    @Autowired
    public UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setName("Luis Felipe Rodrigues");
        user.setEmail("luisfelipe_br@hotmail.com");
        user.setTelefone("(16)99719-8565");

        userRepository.save(user);

        for (User u: userRepository.findAll()){
            System.out.println(u);
        }


    }
}
