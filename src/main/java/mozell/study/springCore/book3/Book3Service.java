package mozell.study.springCore.book3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Book3Service {

    @Autowired
    Book3Repository bookRepository;

}
