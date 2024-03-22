package oscar.faces.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {
	

	@GetMapping("/")
	public String index(){
		return " ";
	}
}
