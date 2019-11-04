package pavel.kurilyuk.book.hellobootdemo.util;

import pavel.kurilyuk.book.hellobootdemo.dto.BookDto;
import pavel.kurilyuk.book.hellobootdemo.entity.Book;

public class DtoUtil {

    public static Book bookDtoToEntity(BookDto bookDto) {
        Book book = new Book(bookDto.getTitle(), bookDto.getPrice(), bookDto.getYear());
        book.setDescription(bookDto.getDescription());
        return  book;
    }
}
