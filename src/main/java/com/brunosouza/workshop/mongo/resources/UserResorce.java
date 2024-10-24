package com.brunosouza.workshop.mongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brunosouza.workshop.mongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResorce {
	
	@GetMapping
	public ResponseEntity<List<User>> findAllUser() {
		User bruno = new User(1l, "Bruno Souza", "bruno78@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(bruno));
		
		return ResponseEntity.ok().body(list) ;
	
	}
	
}
