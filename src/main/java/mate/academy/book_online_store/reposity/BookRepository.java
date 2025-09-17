package mate.academy.book_online_store.repository;

import java.util.List;
import mate.academy.book_online_store.model.Book;

public interface BookRepository {
    Book save(Book book);
    List<Book> findAll();
}
