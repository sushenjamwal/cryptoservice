package com.web.project.cryptoservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CryptoController {
	
	
 	@RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}
