package mozell.study.springCore;

import com.querydsl.core.annotations.Config;
import mozell.study.springCore.book2.BookRepository;
import mozell.study.springCore.book2.BookService;
import org.springframework.context.annotation.Bean;

@Config
public class ApplicationConfig {

    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean
    public BookService bookService() {
        BookService bookService = new BookService();
        bookService.setBookRepository(bookRepository());
        return bookService;
    }
}
