package pavel.kurilyuk.book.hellobootdemo.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class BookDto {

    @NotNull
    @NotEmpty
    private String title;

    @NotNull
    @NotEmpty
    private String description;

    @NotNull
    @NotEmpty
    private Double price;

    @NotNull
    @NotEmpty
    private Integer year;

    public BookDto() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
}
