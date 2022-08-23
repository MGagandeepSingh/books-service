package me.gagan.service.document;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "books-collection")
public class Book {

    @Id
    private String asin;

    @NotNull
    private String isbn10;

    @NotNull
    private String isbn13;

    @NotNull
    private String publisher;

    @NotNull
    private String language;

    @NotNull
    private int pages;

    @NotNull
    private String name;

    @NotNull
    private List<String> authors;
}
