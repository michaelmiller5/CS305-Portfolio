package com.snhu.sslserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;

@RestController
public class HashController {

    @GetMapping("/hash")
    public String getHash(@RequestParam String data) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hash = md.digest(data.getBytes());
        StringBuilder hexString = new StringBuilder();

        for (byte b : hash) {
            hexString.append(String.format("%02x", b));
        }

        return "{\"data\":\"" + data + "\", \"hash\":\"" + hexString.toString() + "\"}";
    }
}