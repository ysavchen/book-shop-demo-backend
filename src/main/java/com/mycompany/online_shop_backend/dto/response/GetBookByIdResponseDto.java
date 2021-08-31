package com.mycompany.online_shop_backend.dto.response;

import com.mycompany.online_shop_backend.domain.Book;
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

    public static GetBookByIdResponseDto toDto(Book book) {
        return new GetBookByIdResponseDto(
                book.getId(), book.getTitle(), book.getDescription(),
                book.getAuthor().getFullName(),
                book.getImage(), book.getPrice()
        );
    }

}
