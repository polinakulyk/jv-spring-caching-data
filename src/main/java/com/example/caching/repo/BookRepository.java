package com.example.caching.repo;

import com.example.caching.model.Book;

public interface BookRepository {
    Book getByIsbn(String isbn);
}
