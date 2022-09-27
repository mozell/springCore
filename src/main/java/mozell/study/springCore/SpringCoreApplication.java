package mozell.study.springCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringCoreApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

//		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(beanDefinitionNames));
	}

}
