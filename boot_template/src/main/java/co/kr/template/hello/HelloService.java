package co.kr.template.hello;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class HelloService {

	private HelloRepository helloRepository;
	
	@CacheEvict("foo")
	public String createHello(Hello hello) {
		helloRepository.save(hello);
		return "saved";
	}
	
	@Cacheable("foo")
	public Iterable<Hello> findAll(){
		return helloRepository.findAll();
	}
}
