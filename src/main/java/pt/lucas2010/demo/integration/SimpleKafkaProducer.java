package pt.lucas2010.demo.integration;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import pt.lucas2010.demo.resources.LcObject;

@Service
public class SimpleKafkaProducer implements KafkaProducer {

    private static final Logger logger = LoggerFactory.getLogger(SimpleKafkaProducer.class);
    private static final String TOPIC = "lc_object";

    private final KafkaTemplate<String, String> kafkaTemplate;
    private ObjectMapper objectMapper;

    @Autowired
    public SimpleKafkaProducer(KafkaTemplate<String, String> kafkaTemplate, ObjectMapper objectMapper) {
        this.kafkaTemplate = kafkaTemplate;
        this.objectMapper = objectMapper;
    }

    public int publishToKafka(LcObject obj) {
        try {
            String json = objectMapper.writeValueAsString(obj);
            //String objJackson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj));
            kafkaTemplate.send(TOPIC, json);
            return 1;
        } catch (JsonProcessingException e) {
            logger.error("failed conversion: LcObject object to Json", e);
             return -1;
        } catch(Throwable th) {
            logger.error("Unknown exception", th);
            return -1;
        }

    }
}
