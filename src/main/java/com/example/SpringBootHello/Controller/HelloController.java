package com.example.SpringBootHello.Controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
	 private static final Logger logger = LogManager.getLogger(HelloController.class);
	 @RequestMapping("/Hello")
	    public String HelloWorld() {
	        logger.info("My first Hello");
	        return "Hello World";
	    }
}
