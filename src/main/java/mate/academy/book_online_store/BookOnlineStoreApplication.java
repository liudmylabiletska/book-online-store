package mate.academy.book_online_store;

import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;
import mate.academy.book_online_store.model.Book;
import mate.academy.book_online_store.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class BookOnlineStoreApplication {
    private final BookService bookService;

    public static void main(String[] args) {

        SpringApplication.run(BookOnlineStoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book myBook = new Book();
            myBook.setTitle("Clean Code: A Handbook of Agile Software Craftsmanship"); // Назва книги
            myBook.setAuthor("Robert C. Martin");
            myBook.setPrice(BigDecimal.valueOf(399));
            myBook.setIsbn("978-0-13-235088-4");

            bookService.save(myBook);

            System.out.println(bookService.findAll());
        };
    }
}
