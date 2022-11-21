package com.Mentorrant.mentorrant.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Mentorrant.mentorrant.Entity.EbooksEntity;
import com.Mentorrant.mentorrant.Service.EbooksService;

@RestController
@RequestMapping("/Ebooks")
public class EbooksController {

	@Autowired
	EbooksService ebserve;
	
	@PostMapping("/postEbooks")
	public EbooksEntity addEbook(@RequestBody EbooksEntity book) {
		return ebserve.addEbook(book);
	}
	
}
