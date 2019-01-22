package com.example.demo.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.everit.json.schema.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.DemoConstant;
import com.example.demo.service.DemoService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(DemoConstant.API_ENDPOINT_PRODUCT_BASE_PATH)
public class DemoController {
	
	@Autowired
	private DemoService demoSrv;
	
	@ApiOperation(DemoConstant.API_ORIENTATION_TEST_PING)
	@RequestMapping(method = RequestMethod.GET, value = DemoConstant.API_ENDPOINT_TEST_PING,
					produces = DemoConstant.APPLICATION_JSON_VALUE)
	public String ping( ) {
		return "Ping successful";
	}
	
	@ApiOperation(DemoConstant.API_ORIENTATION_PRODUCT_UPDATE)
	@RequestMapping(method = RequestMethod.POST, value = DemoConstant.API_ENDPOINT_PRODUCT_UPDATE,
					produces = DemoConstant.APPLICATION_JSON_VALUE, consumes = DemoConstant.APPLICATION_JSON_VALUE)
	public String insertProd(@RequestBody String inputJson) throws  IOException{
		return demoSrv.addDsvProduct(inputJson);
	}
	
	@ApiOperation(DemoConstant.API_ORIENTATION_GET_PRODUCT_BY_EAN)
	@RequestMapping(method = RequestMethod.GET, value = DemoConstant.API_ENDPOINT_GET_PRODUCT_BY_EAN,
					produces = DemoConstant.APPLICATION_JSON_VALUE)
	public String getDsvProductsByEan(@PathVariable("ean") List<String> eanList) throws Exception {
		return demoSrv.getDsvProductsByListOfEan(eanList);
		
	}

}
