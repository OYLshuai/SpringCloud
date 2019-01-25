package com.example.springbootfirst.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Shopcart {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.shop_id
     *
     * @mbggenerated
     */
    private Integer shopId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.shop_amount
     *
     * @mbggenerated
     */
    private Integer shopAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.shop_add_date
     *
     * @mbggenerated
     */
    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Date shopAddDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.shop_update_date
     *
     * @mbggenerated
     */
    @JsonFormat( pattern="yyyy-MM-dd HH:mm:ss")
    private Date shopUpdateDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.book_num
     *
     * @mbggenerated
     */
    private Integer bookNum;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.shop_id
     *
     * @return the value of shopcart.shop_id
     *
     * @mbggenerated
     */
    public Integer getShopId() {
        return shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.shop_id
     *
     * @param shopId the value for shopcart.shop_id
     *
     * @mbggenerated
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.shop_amount
     *
     * @return the value of shopcart.shop_amount
     *
     * @mbggenerated
     */
    public Integer getShopAmount() {
        return shopAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.shop_amount
     *
     * @param shopAmount the value for shopcart.shop_amount
     *
     * @mbggenerated
     */
    public void setShopAmount(Integer shopAmount) {
        this.shopAmount = shopAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.shop_add_date
     *
     * @return the value of shopcart.shop_add_date
     *
     * @mbggenerated
     */
    public Date getShopAddDate() {
        return shopAddDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.shop_add_date
     *
     * @param shopAddDate the value for shopcart.shop_add_date
     *
     * @mbggenerated
     */
    public void setShopAddDate(Date shopAddDate) {
        this.shopAddDate = shopAddDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.shop_update_date
     *
     * @return the value of shopcart.shop_update_date
     *
     * @mbggenerated
     */
    public Date getShopUpdateDate() {
        return shopUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.shop_update_date
     *
     * @param shopUpdateDate the value for shopcart.shop_update_date
     *
     * @mbggenerated
     */
    public void setShopUpdateDate(Date shopUpdateDate) {
        this.shopUpdateDate = shopUpdateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.book_num
     *
     * @return the value of shopcart.book_num
     *
     * @mbggenerated
     */
    public Integer getBookNum() {
        return bookNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.book_num
     *
     * @param bookNum the value for shopcart.book_num
     *
     * @mbggenerated
     */
    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }
}