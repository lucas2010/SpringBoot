package pt.lucas2010.demo.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import pt.lucas2010.demo.resources.LcObject;

public interface KafkaProducer {
    int publishToKafka(LcObject obj);
}
