package pavel.kurilyuk.book.hellobootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pavel.kurilyuk.book.hellobootdemo.dto.BookDto;
import pavel.kurilyuk.book.hellobootdemo.entity.Book;
import pavel.kurilyuk.book.hellobootdemo.service.BookService;

import java.util.List;
import javax.persistence.EntityNotFoundException;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> allBooks() {
        return bookService.findAll();
    }

    @GetMapping("/{bookId}")
    public Book getById(@PathVariable("bookId") Long id) {
        return bookService.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Can't find book by id " + id));

    }

    @PostMapping
    public void add(@RequestBody BookDto bookDto) {
        Book book = bookDtoToEntity(bookDto);
        bookService.save(book);
    }

    @DeleteMapping("/{bookId}")
    public void delete(@PathVariable("bookId") Long id) {
        bookService.delete(id);
    }

    @PutMapping("/{bookId}")
    public Book update(@PathVariable("bookId") Long id, Book book) {
        return null;
    }

    private Book bookDtoToEntity(BookDto bookDto) {
        Book book = new Book(bookDto.getTitle(), bookDto.getPrice(), bookDto.getYear());
        book.setDescription(bookDto.getDescription());
        return  book;
    }
}
