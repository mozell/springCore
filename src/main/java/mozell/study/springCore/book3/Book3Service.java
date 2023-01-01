package mozell.study.springCore.book3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Book3Service {

    Book3Repository bookRepository;

    @Autowired
    public Book3Service(Book3Repository bookRepository) {
        this.bookRepository = bookRepository;
    }
}
