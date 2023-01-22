package io.abhishek.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyClass {

	@Autowired
	private MyService service;
	
	
	public Map<String, String> show() {
		return service.show();
	}
}
