package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SslServerApplication {
	public static String getSecureHash(String data) {
	    try {
	        java.security.MessageDigest digest = java.security.MessageDigest.getInstance("SHA-256");
	        byte[] hash = digest.digest(data.getBytes(java.nio.charset.StandardCharsets.UTF_8));
	        StringBuilder hexString = new StringBuilder();
	        for (byte b : hash) {
	            String hex = Integer.toHexString(0xff & b);
	            if (hex.length() == 1) hexString.append('0');
	            hexString.append(hex);
	        }
	        return hexString.toString();
	    } catch (Exception e) {
	        return "Error generating hash";
	    }
	}

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}