package ind.xwm.thermal.dao;

import ind.xwm.thermal.model.OrderDetail;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface OrderDetailMapper {
    @Select("select * from OrderDetail where ORDER_ID = #{orderId}")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "AMOUNT", property = "amount", jdbcType = JdbcType.VARCHAR),
            @Result(column = "PRODUCT_COUNT", property = "productCount", jdbcType = JdbcType.VARCHAR),
            @Result(column = "PRODUCT_NAME", property = "productName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "PRODUCT_PRICE", property = "productPrice", jdbcType = JdbcType.VARCHAR),
            @Result(column = "PRODUCT_UNIT", property = "productUnit", jdbcType = JdbcType.VARCHAR),
            @Result(column = "ORDER_ID", property = "orderId", jdbcType = JdbcType.VARCHAR)
    })
    List<OrderDetail> selectByOrderId(@Param("orderId") String orderId);

    void insertBatch(List<OrderDetail> orderDetailList);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderDetail
     *
     * @mbg.generated Sat Mar 17 11:38:42 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderDetail
     *
     * @mbg.generated Sat Mar 17 11:38:42 CST 2018
     */
    int insert(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderDetail
     *
     * @mbg.generated Sat Mar 17 11:38:42 CST 2018
     */
    int insertSelective(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderDetail
     *
     * @mbg.generated Sat Mar 17 11:38:42 CST 2018
     */
    OrderDetail selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderDetail
     *
     * @mbg.generated Sat Mar 17 11:38:42 CST 2018
     */
    int updateByPrimaryKeySelective(OrderDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table OrderDetail
     *
     * @mbg.generated Sat Mar 17 11:38:42 CST 2018
     */
    int updateByPrimaryKey(OrderDetail record);
}