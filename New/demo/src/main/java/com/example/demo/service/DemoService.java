package com.example.demo.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.everit.json.schema.ValidationException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface DemoService {
	
	public String addDsvProduct(String jsonInput) throws JsonMappingException, JsonParseException, IOException, FileNotFoundException,ValidationException;
	
	public String getDsvProductsByListOfEan(List<String> eanList);

}
