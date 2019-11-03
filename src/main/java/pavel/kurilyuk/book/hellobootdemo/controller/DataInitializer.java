package pavel.kurilyuk.book.hellobootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pavel.kurilyuk.book.hellobootdemo.entity.Book;
import pavel.kurilyuk.book.hellobootdemo.service.BookService;

import javax.annotation.PostConstruct;

@Component
public class DataInitializer {
    @Autowired
    private BookService bookService;

    @PostConstruct
    public void initData() {
        saveBooks();
    }

    private void saveBooks() {
        Book kobzar = new Book("Kobzar", 100.0, 2019);
        kobzar.setDescription("lombok is ok");
        bookService.save(kobzar);
        Book kobzar1 = new Book("Kobzar", 80.0, 2015);
        bookService.save(kobzar1);
        Book lysovaMavka = new Book("Lysova Mavka", 121.15, 2018);
        bookService.save(lysovaMavka);
        Book lysovaPisnya = new Book("Lysova Pisnya", 42.0, 1981);
        bookService.save(lysovaPisnya);
        Book kamenyary = new Book("Kamenyary", 29.99, 2010);
        bookService.save(kamenyary);
        Book kamenyaryGold = new Book("Kamenyary. Gold Edition", 439.99, 1990);
        bookService.save(kamenyaryGold);
    }
}
