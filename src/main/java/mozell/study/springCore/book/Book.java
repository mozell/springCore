package mozell.study.springCore.book;

import lombok.Data;
import java.util.Date;

@Data
public class Book {

    private Date created;
    private BookStatus bookStatus;

}
