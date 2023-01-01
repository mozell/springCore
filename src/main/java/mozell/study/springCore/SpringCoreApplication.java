package mozell.study.springCore;

import mozell.study.outBean.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringCoreApplication {

	// 컴포넌트스캔 외부 위치에 등록된 빈 제대로 등록되었는지 확인
	@Autowired
	MyService myService;
	
	public static void main(String[] args) {
//		SpringApplication.run(SpringCoreApplication.class, args);

		var app = new SpringApplication(SpringCoreApplication.class);
		//외부 빈 등록
		app.addInitializers((ApplicationContextInitializer<GenericApplicationContext>) ctx -> ctx.registerBean(MyService.class));
		app.run();
	}

}
