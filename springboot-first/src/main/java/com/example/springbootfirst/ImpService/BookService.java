package com.example.springbootfirst.ImpService;

import com.example.springbootfirst.model.Book;

import java.util.List;

public interface BookService {

    List<Book> selectAllBook();

    int queryMaxBookNum();

    int insert(Book book);

    int updateBook(Book book);

    int delBook(Book book);

}
