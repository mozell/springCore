package mozell.study.springCore.book3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Book3Service {

    @Autowired
    List<Book3Repository> book3Repositories;

    public void printBook3Repository() {
//        this.book3Repositories.forEach(System.out::println);
    }

}
