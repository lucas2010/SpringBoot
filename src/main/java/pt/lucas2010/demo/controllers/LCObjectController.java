package pt.lucas2010.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pt.lucas2010.demo.integration.KafkaProducer;
import pt.lucas2010.demo.resources.LcObject;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
public class LCObjectController {

    private KafkaProducer kfkPrd;

    @Autowired
    public LCObjectController(KafkaProducer kfkPrd){
        this.kfkPrd = kfkPrd;
    }

    @RequestMapping(path = "/lcobject", method = PUT)
    public ResponseEntity createLCObject(@RequestBody LcObject obj) {

        int i = kfkPrd.publishToKafka(obj);

        if(i>0)
            return ResponseEntity.ok(obj);
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
}
