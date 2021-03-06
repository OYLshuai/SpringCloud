package com.example.springbootfirst.mapper;

import com.example.springbootfirst.model.Book;

import java.util.List;

public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated
     */
    int insert(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated
     */
    int insertSelective(Book record);

    List<Book> selectAllBook();

    int queryMaxBookNum();

    int updateBook(Book book);

    int delBook(Book book);
}