package pavel.kurilyuk.book.hellobootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pavel.kurilyuk.book.hellobootdemo.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
