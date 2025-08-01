package kardo.designpatterns.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import kardo.designpatterns.model.User;
import kardo.designpatterns.repository.UserRepository;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadUsers(UserRepository userRepository) {
        return args -> {
            if (userRepository.count() == 0) {
                userRepository.save(User.builder().name("John").build());
                userRepository.save(User.builder().name("Paul").build());
                userRepository.save(User.builder().name("George").build());
                userRepository.save(User.builder().name("Ringo").build());
            }
        };
    }
}
