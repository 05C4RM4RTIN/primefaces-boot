package oscar.faces.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	

	@GetMapping("/")
	public String index(){
		return " ";
	}
}
