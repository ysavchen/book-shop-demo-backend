package com.mycompany.online_shop_backend.dto.response;

import com.mycompany.online_shop_backend.dto.services.BookDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetBookByIdResponseDto {

    private long id;
    private String title;
    private String description;
    private String author;
    private String image;
    private double price;

    public static GetBookByIdResponseDto toDto(BookDto book) {
        return new GetBookByIdResponseDto(
                book.id(),
                book.title(),
                book.description(),
                book.author(),
                book.image(),
                book.price()
        );
    }

}
