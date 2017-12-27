package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Person;

@RestController()
public class DemoController {

	@RequestMapping(value = "/hello/{name}/{gender}/{age}", method=RequestMethod.GET)
	public Person hello(@PathVariable("name") String name,
						@PathVariable("gender") String gender, 
						@PathVariable("age") Integer age) {
		return new Person(name, gender, age);
	}
}
