package co.kr.template.hello;

import javax.cache.CacheManager;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@AllArgsConstructor
@Slf4j
public class CacheManagerCheck implements CommandLineRunner{

	private CacheManager cacheManager;
	
	@Override
	public void run(String... args) throws Exception {
		log.info("\n\n" + "=========================================================\n"
                + "Using cache manager: " + this.cacheManager.getClass().getName() + "\n"
                + "=========================================================\n\n");
	}
}
