package net.thumbtack.bank.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank/ping")
public class BankPingController {

    @GetMapping
    public ResponseEntity<?> ping() {

        return ResponseEntity.ok().body("ping");
    }
}