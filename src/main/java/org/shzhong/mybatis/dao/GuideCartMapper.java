package org.shzhong.mybatis.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.shzhong.mybatis.domain.GuideCart;
import org.shzhong.mybatis.domain.GuideCartExample;

public interface GuideCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_cart
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    long countByExample(GuideCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_cart
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    int deleteByExample(GuideCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_cart
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_cart
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    int insert(GuideCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_cart
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    int insertSelective(GuideCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_cart
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    List<GuideCart> selectByExample(GuideCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_cart
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    GuideCart selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_cart
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    int updateByExampleSelective(@Param("record") GuideCart record, @Param("example") GuideCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_cart
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    int updateByExample(@Param("record") GuideCart record, @Param("example") GuideCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_cart
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    int updateByPrimaryKeySelective(GuideCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guide_cart
     *
     * @mbg.generated Thu Nov 29 16:43:22 CST 2018
     */
    int updateByPrimaryKey(GuideCart record);
}