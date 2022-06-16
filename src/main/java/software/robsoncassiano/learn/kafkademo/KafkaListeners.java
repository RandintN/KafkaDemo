package software.robsoncassiano.learn.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "robson", groupId = "meu-group-id")
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
