package mozell.study.springCore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SpELRunner implements ApplicationRunner {

    @Value("#{1+1}")
    int value;

    @Value("#{'hello '+'world'}")
    String greeting;

    @Value("#{1 eq 1}")
    boolean tf;

    @Value("hello")
    String hello;

    @Value("${my.value}")
    int myValue;

    @Value("#{${my.value} +100}")
    int myValue2;

    @Value("#{sample.data}")
    int sampleData; // Bean Reference

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("===============");
        System.out.println(value);
        System.out.println(greeting);
        System.out.println(tf);
        System.out.println(hello);
        System.out.println(myValue);
        System.out.println(myValue2);
        System.out.println("=Bean Reference=");
        System.out.println(sampleData);
    }
}
