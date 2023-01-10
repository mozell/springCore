package mozell.study.springCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreApplication.class, args);
	}

//	@Bean
//	public MessageSource messageSource() {
//		var messageSource = new ReloadableResourceBundleMessageSource();
//		messageSource.setBasename("classpath:/messages");
//		messageSource.setDefaultEncoding("UTF-8");
//		messageSource.setCacheSeconds(3);
//		return messageSource;
//	}

}
