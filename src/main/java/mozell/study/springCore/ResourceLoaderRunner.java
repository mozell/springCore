package mozell.study.springCore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;

@Component
public class ResourceLoaderRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext resourceLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(resourceLoader.getClass()); // ~~WebApplicationContext

        Resource resource = resourceLoader.getResource("classpath:test.txt");
        System.out.println(resource.getClass()); // 원래는 ServletContextResource 여야 하는데, 리소스 타입을 강제로 명시했으니, ClassPathResource 이다.

        System.out.println(resource.exists());
        System.out.println(resource.getDescription());
        System.out.println(Files.readString(Path.of(resource.getURI())));
    }
}
