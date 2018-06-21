package org.example.simpleSpringMvcApp.controller;

import org.example.simpleSpringMvcApp.model.User;
import org.example.simpleSpringMvcApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class UserRontroller {
	
	@Autowired
	UserService service;
	
	public ModelAndView getAll(){
		return new ModelAndView();
	}
	
//	@GetMapping(value = "/")
//	public ModelAndView getOne()
	@GetMapping(value = "/delete")
	public ModelAndView remove(@RequestParam(value = "id") Integer id){
	
	}
	
	@GetMapping(value = "/update")
	public ModelAndView update(@RequestParam(value = "id") Integer id){
	
	}
	
	@GetMapping(value = "create")
	public ModelAndView create(){
	
	}
	
	@PostMapping
	public String save(@ModelAttribute User user){
	
	}
	
}
