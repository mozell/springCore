package mozell.study.springCore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = SpringCoreApplication.class)
public class ApplicationConfig {
//
//    @Bean
//    public BookRepository bookRepository() {
//        return new BookRepository();
//    }
//
//    @Bean
//    public BookService bookService() {
//        BookService bookService = new BookService();
//        bookService.setBookRepository(bookRepository());
//        return bookService;
//    }
}
