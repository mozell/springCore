package mozell.study.springCore.book3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Book3ServiceRunner implements ApplicationRunner {

    @Autowired
    Book3Service book3Service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        book3Service.printBook3Repository();
    }
}
