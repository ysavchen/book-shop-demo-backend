package com.mycompany.online_shop_backend.dto.response;

import com.mycompany.online_shop_backend.dto.services.BookDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetBooksResponseDto {

    private long id;
    private String title;
    private String description;
    private String author;
    private String image;
    private double price;

    public static GetBooksResponseDto toDto(BookDto book) {
        return new GetBooksResponseDto(
                book.getId(), book.getTitle(), book.getDescription(),
                book.getAuthor(),
                book.getImage(), book.getPrice()
        );
    }

}
