package com.techgeeknext;

import com.techgeeknext.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class KafaExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafaExampleApplication.class, args);
    }

    @KafkaListener(topics = "gjkafka-topic", groupId = "gjkafka-group")
    public void listen(User user) {

        System.out.println("Received User information : " + user);
    }
}
