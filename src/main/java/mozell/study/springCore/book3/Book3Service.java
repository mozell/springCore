package mozell.study.springCore.book3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Book3Service {

    @Autowired
    @Qualifier("mozellBook3Repository")
    Book3Repository bookRepository;

    public void printBook3Repository() {
        System.out.println(bookRepository.getClass());
    }

}
