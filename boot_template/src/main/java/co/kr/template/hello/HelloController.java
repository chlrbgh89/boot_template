package co.kr.template.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class HelloController {

	private HelloService helloService;
	
	@GetMapping("/")
	public String hello() {
		return "hello";		
	}
	
	@GetMapping("/create")
	public @ResponseBody String create(Hello hello) {
		return helloService.createHello(hello);
	}
	
	@GetMapping("/all")
	public @ResponseBody Iterable<Hello> all() {
		return helloService.findAll();
	}
}
