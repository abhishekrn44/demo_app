package io.abhishek.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class MyService {
	
	public Map<String, String> show() {
		Map<String, String> map = new HashMap<>();
		map.put("Name", "Abhishek");
		return map;
	}

}
