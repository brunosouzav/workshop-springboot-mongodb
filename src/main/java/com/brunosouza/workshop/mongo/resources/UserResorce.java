package com.brunosouza.workshop.mongo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunosouza.workshop.mongo.domain.User;
import com.brunosouza.workshop.mongo.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResorce {
	

	@Autowired 
	private UserService service;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
	List<User> list = service.findAll();
	
	return ResponseEntity.ok().body(list);
	}
}
