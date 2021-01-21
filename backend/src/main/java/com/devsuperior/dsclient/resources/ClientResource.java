package com.devsuperior.dsclient.resources;

import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsclient.entities.Client;

@RestController
@RequestMapping(value = "/customers")
public class ClientResource {

	@GetMapping
	public ResponseEntity<Client> findAll() {
		Client client = new Client(1L, "Rossi","318.129.898.06" , 2.000, Instant.now(), 3);
		return ResponseEntity.ok().body(client);
	}
}
