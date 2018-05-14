package co.kr.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import com.navercorp.lucy.security.xss.servletfilter.XssEscapeServletFilter;

@SpringBootApplication
@EnableCaching
public class BootTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootTemplateApplication.class, args);
	}
	
	@Bean
	public FilterRegistrationBean xssEscapeServletFilter() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new XssEscapeServletFilter());
		registrationBean.setOrder(1);
		registrationBean.addUrlPatterns("/*");
		return registrationBean;
	}
}
