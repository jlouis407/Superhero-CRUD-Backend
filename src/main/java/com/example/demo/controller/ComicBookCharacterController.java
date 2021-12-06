package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ComicBookCharacter;
import com.example.demo.repository.ComicBookCharacterRepository;

@RestController
@RequestMapping("/api/v1/")
public class ComicBookCharacterController {
	
	@Autowired
	private ComicBookCharacterRepository comicBookCharacterRepository;
	
	@GetMapping("/comicBookCharacters")
	public List<ComicBookCharacter> getAllComicBookCharacters(){
		return comicBookCharacterRepository.findAll();
	}
	
	

}