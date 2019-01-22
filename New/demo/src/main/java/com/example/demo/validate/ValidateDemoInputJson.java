package com.example.demo.validate;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.springframework.util.ResourceUtils;

import com.example.demo.constant.DemoConstant;

public class ValidateDemoInputJson {
	
	public void validateInput(String inputJson) throws  IOException{
		
		File file = ResourceUtils.getFile("classpath:"+DemoConstant.DEMO_SCHEMA_FILE);
		@SuppressWarnings("deprecation")
		String dsvSchema = FileUtils.readFileToString(file);
		JSONObject jsonSchema = new JSONObject(
			      new JSONTokener (dsvSchema));
		
		JSONObject jsonSubject = new JSONObject(
			      new JSONTokener(inputJson));
			     
			    Schema schema = SchemaLoader.load(jsonSchema);
			    schema.validate(jsonSubject);
	}

}
