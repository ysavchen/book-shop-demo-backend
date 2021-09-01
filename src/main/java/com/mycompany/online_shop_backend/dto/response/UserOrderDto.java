package com.mycompany.online_shop_backend.dto.response;

import com.mycompany.online_shop_backend.dto.services.BookDto;
import com.mycompany.online_shop_backend.dto.services.OrderDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserOrderDto {
    private long id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String createdAt;
    private List<BookDto> books;

    public static UserOrderDto toDto(OrderDto order) {
        return new UserOrderDto(
                order.id(),
                order.name(),
                order.address(),
                order.phone(),
                order.email(),
                order.createdAt(),
                order.books()
        );
    }
}
