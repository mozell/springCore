package mozell.study.springCore.book3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Book3Service {

    @Autowired(required = false)
    Book3Repository bookRepository;

}
