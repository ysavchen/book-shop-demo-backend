package com.mycompany.online_shop_backend.service;

import com.mycompany.online_shop_backend.dto.response.GetBookByIdResponseDto;
import com.mycompany.online_shop_backend.dto.response.GetBooksResponseDto;
import com.mycompany.online_shop_backend.exceptions.EntityNotFoundException;
import com.mycompany.online_shop_backend.repositories.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    @Transactional(readOnly = true)
    public GetBookByIdResponseDto getById(long id) {
        return bookRepository.findById(id)
                .map(GetBookByIdResponseDto::toDto)
                .orElseThrow(() -> new EntityNotFoundException("Book with id = " + id + " is not found"));
    }

    @Transactional(readOnly = true)
    public List<GetBooksResponseDto> getAllBooks() {
        return bookRepository.findAll()
                .stream()
                .map(GetBooksResponseDto::toDto)
                .collect(toList());
    }
}
