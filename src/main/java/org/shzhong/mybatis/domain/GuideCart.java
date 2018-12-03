package org.shzhong.mybatis.domain;

import java.math.BigDecimal;
import java.util.Date;

public class GuideCart {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guide_cart.id
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guide_cart.user_id
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guide_cart.goods_id
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guide_cart.goods_sn
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    private String goodsSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guide_cart.goods_name
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    private String goodsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guide_cart.product_id
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    private Integer productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guide_cart.price
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guide_cart.number
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    private Short number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guide_cart.specifications
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    private String specifications;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guide_cart.checked
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    private Boolean checked;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guide_cart.pic_url
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    private String picUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guide_cart.add_time
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guide_cart.update_time
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column guide_cart.deleted
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guide_cart.id
     *
     * @return the value of guide_cart.id
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guide_cart.id
     *
     * @param id the value for guide_cart.id
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guide_cart.user_id
     *
     * @return the value of guide_cart.user_id
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guide_cart.user_id
     *
     * @param userId the value for guide_cart.user_id
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guide_cart.goods_id
     *
     * @return the value of guide_cart.goods_id
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guide_cart.goods_id
     *
     * @param goodsId the value for guide_cart.goods_id
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guide_cart.goods_sn
     *
     * @return the value of guide_cart.goods_sn
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public String getGoodsSn() {
        return goodsSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guide_cart.goods_sn
     *
     * @param goodsSn the value for guide_cart.goods_sn
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn == null ? null : goodsSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guide_cart.goods_name
     *
     * @return the value of guide_cart.goods_name
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guide_cart.goods_name
     *
     * @param goodsName the value for guide_cart.goods_name
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guide_cart.product_id
     *
     * @return the value of guide_cart.product_id
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guide_cart.product_id
     *
     * @param productId the value for guide_cart.product_id
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guide_cart.price
     *
     * @return the value of guide_cart.price
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guide_cart.price
     *
     * @param price the value for guide_cart.price
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guide_cart.number
     *
     * @return the value of guide_cart.number
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public Short getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guide_cart.number
     *
     * @param number the value for guide_cart.number
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public void setNumber(Short number) {
        this.number = number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guide_cart.specifications
     *
     * @return the value of guide_cart.specifications
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public String getSpecifications() {
        return specifications;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guide_cart.specifications
     *
     * @param specifications the value for guide_cart.specifications
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guide_cart.checked
     *
     * @return the value of guide_cart.checked
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public Boolean getChecked() {
        return checked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guide_cart.checked
     *
     * @param checked the value for guide_cart.checked
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guide_cart.pic_url
     *
     * @return the value of guide_cart.pic_url
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public String getPicUrl() {
        return picUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guide_cart.pic_url
     *
     * @param picUrl the value for guide_cart.pic_url
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guide_cart.add_time
     *
     * @return the value of guide_cart.add_time
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guide_cart.add_time
     *
     * @param addTime the value for guide_cart.add_time
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guide_cart.update_time
     *
     * @return the value of guide_cart.update_time
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guide_cart.update_time
     *
     * @param updateTime the value for guide_cart.update_time
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column guide_cart.deleted
     *
     * @return the value of guide_cart.deleted
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column guide_cart.deleted
     *
     * @param deleted the value for guide_cart.deleted
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}