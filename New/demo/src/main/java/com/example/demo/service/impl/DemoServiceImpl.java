package com.example.demo.service.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.everit.json.schema.ValidationException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.model.Stock;
import com.example.demo.service.DemoService;
import com.example.demo.validate.ValidateDemoInputJson;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@Service
public class DemoServiceImpl implements DemoService{
	
	public String addDsvProduct(String jsonInput) throws  IOException {
		
		ValidateDemoInputJson validateDemo = new ValidateDemoInputJson();
		validateDemo.validateInput(jsonInput);
		JSONObject jsonStr = new JSONObject(jsonInput);
		int qty = jsonStr.getInt("qty");				
		ObjectMapper mapper = new ObjectMapper();
		Product prod = mapper.readValue(jsonInput, Product.class);
		String strQty = "Quantity----"+prod.getQty();
		String jsonString = new Gson().toJson(strQty);
		return jsonString;
		
	}
	
	public String getDsvProductsByListOfEan(List<String> eanList) {
		return deriveOutput(eanList);
	}
	
	private String deriveOutput(List<String> eanList){
		
		List<Stock> stockList = new ArrayList<Stock>();
		for(String inputEan : eanList) { //Use for ean does not exist
			Stock stock = new Stock();
			stock.setEan(inputEan);
			stock.setQty(10);
			stock.setStatus("Availble");
			stock.setReason("Ok");
			stockList.add(stock);
		}
		String jsonString = new Gson().toJson(stockList);
		return jsonString;
	}

}
