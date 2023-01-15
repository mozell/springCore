package mozell.study.springCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SpringCoreApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);

//		SpringApplication.run(SpringCoreApplication.class, args);
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
