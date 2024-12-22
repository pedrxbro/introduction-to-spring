package com.univali.course.config;

import com.univali.course.entities.User;
import com.univali.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 =  new User(null, "Amanda", "amanda@gmail.com", "99999020", "12345678");
        User u2 = new User (null, "João"  , "joao@gmail.com"  , "99999021", "87654321");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }

}
