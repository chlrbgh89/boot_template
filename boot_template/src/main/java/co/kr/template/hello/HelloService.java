package co.kr.template.hello;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HelloService {

	private HelloRepository helloRepository;
	
	public String createHello() {
		Hello hello = new Hello();
		hello.setName("choi");
		helloRepository.save(hello);
		return "saved";
	}
	
	public Iterable<Hello> findAll(){
		return helloRepository.findAll();
	}
}
