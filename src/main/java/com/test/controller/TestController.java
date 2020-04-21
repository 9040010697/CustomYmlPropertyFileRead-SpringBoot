package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.config.CustomConfig;

@RestController
public class TestController {

	@Autowired
	private CustomConfig config;

	@GetMapping
	public ResponseEntity<?> getData(){
		return ResponseEntity.ok("Data "+config.getDbName());
	}
}
