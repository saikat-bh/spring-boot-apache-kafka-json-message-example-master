package com.techgeeknext.controller;

import com.techgeeknext.model.User;
import com.techgeeknext.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/gj-kafka/")
public class KafkaExampleController {

    @Autowired
    KafkaProducerService kafkaProducer;


    @PostMapping("/producer")
    public @ResponseBody User sendMessage(@RequestParam int id, @RequestParam String fsk0109)
    {
        User user = new User(id, fsk0109);
        kafkaProducer.send(user);
        return user;
        //return "Message sent successfully to the Kafka topic gjkafka-topic";
    }

}
