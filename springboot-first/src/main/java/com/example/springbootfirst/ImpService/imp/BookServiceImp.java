package com.example.springbootfirst.ImpService.imp;

import com.example.springbootfirst.ImpService.BookService;
import com.example.springbootfirst.mapper.BookMapper;
import com.example.springbootfirst.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> selectAllBook() {
        return bookMapper.selectAllBook();
    }

    @Override
    public int queryMaxBookNum() {
        return bookMapper.queryMaxBookNum();
    }

    @Override
    public int insert(Book book) {
        return bookMapper.insert(book);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public int delBook(Book book) {
        return bookMapper.delBook(book);
    }
}
