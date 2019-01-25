package com.example.springbootfirst.controller;

import com.example.springbootfirst.ImpService.BookService;
import com.example.springbootfirst.model.Book;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Resource
    private BookService bookService;

    @RequestMapping(value = "/selectAllBook", method = RequestMethod.POST)
    public List<Book> selectAllBook() {
        return bookService.selectAllBook();
    }

    @RequestMapping(value = "/selectMaxBookNum", method = RequestMethod.POST)
    public int selectMaxBookNum() {
        return bookService.queryMaxBookNum();
    }

    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    public int addBook(@RequestBody Book book) {
        return bookService.insert(book);
    }

    @RequestMapping(value = "/delBook", method = RequestMethod.POST)
    public int delBook(@RequestBody Book book) {
        return bookService.delBook(book);
    }

    @RequestMapping(value = "/modBook", method = RequestMethod.POST)
    public int modBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }
}
