package com.go.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.go.web.modal.Modal;

@RestController
@RequestMapping("/go")
public class GoController {

	@GetMapping(value = "/list")
	public ResponseEntity<Modal> list() {
		return ResponseEntity.ok(new Modal(1l));
	}
}
