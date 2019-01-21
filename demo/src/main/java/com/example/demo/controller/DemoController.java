package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/test", produces = "application/json")
	public String ping( ) {
		return "Ping successful";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/insertProduct", produces = "application/json", consumes = "application/json")
	public String insertProd(@RequestBody String inputJson) {
		return inputJson;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/{id}/{ean}", produces = "application/json")
	public String ping(@PathVariable("id") String id, @PathVariable("ean") String ean) {
		return id+"XXXXX"+ean;
	}

}
