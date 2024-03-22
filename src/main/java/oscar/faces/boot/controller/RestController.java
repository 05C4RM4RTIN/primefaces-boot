package oscar.faces.boot.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestController {
	

	@GetMapping("/")
	public String index(){
		return " ";
	}
}
