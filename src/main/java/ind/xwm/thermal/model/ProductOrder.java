package ind.xwm.thermal.model;

import ind.xwm.thermal.enums.DeliverStatus;
import ind.xwm.thermal.enums.PayStatus;
import ind.xwm.thermal.enums.PrintStatus;
import org.springframework.core.annotation.Order;

import java.util.List;

public class ProductOrder {
    private List<OrderDetail> orderDetails;

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }


    // 以下是 mybatis generator 自动生成
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.ORDER_ID
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.CUSTOMER_NAME
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    private String customerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.CUSTOMER_PHONE
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    private String customerPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.DELIVER_STATUS
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    private DeliverStatus deliverStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.DELIVER_TIME
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    private String deliverTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.ORDER_TIME
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    private String orderTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.PAY_STATUS
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    private PayStatus payStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.PRINT_STATUS
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    private PrintStatus printStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.TOTAL_COUNT
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    private String totalCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column productorder.TOTAL_PRICE
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    private String totalPrice;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.ORDER_ID
     *
     * @return the value of productorder.ORDER_ID
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.ORDER_ID
     *
     * @param orderId the value for productorder.ORDER_ID
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.CUSTOMER_NAME
     *
     * @return the value of productorder.CUSTOMER_NAME
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.CUSTOMER_NAME
     *
     * @param customerName the value for productorder.CUSTOMER_NAME
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.CUSTOMER_PHONE
     *
     * @return the value of productorder.CUSTOMER_PHONE
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public String getCustomerPhone() {
        return customerPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.CUSTOMER_PHONE
     *
     * @param customerPhone the value for productorder.CUSTOMER_PHONE
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.DELIVER_STATUS
     *
     * @return the value of productorder.DELIVER_STATUS
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public DeliverStatus getDeliverStatus() {
        return deliverStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.DELIVER_STATUS
     *
     * @param deliverStatus the value for productorder.DELIVER_STATUS
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public void setDeliverStatus(DeliverStatus deliverStatus) {
        this.deliverStatus = deliverStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.DELIVER_TIME
     *
     * @return the value of productorder.DELIVER_TIME
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public String getDeliverTime() {
        return deliverTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.DELIVER_TIME
     *
     * @param deliverTime the value for productorder.DELIVER_TIME
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public void setDeliverTime(String deliverTime) {
        this.deliverTime = deliverTime == null ? null : deliverTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.ORDER_TIME
     *
     * @return the value of productorder.ORDER_TIME
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public String getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.ORDER_TIME
     *
     * @param orderTime the value for productorder.ORDER_TIME
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime == null ? null : orderTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.PAY_STATUS
     *
     * @return the value of productorder.PAY_STATUS
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public PayStatus getPayStatus() {
        return payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.PAY_STATUS
     *
     * @param payStatus the value for productorder.PAY_STATUS
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public void setPayStatus(PayStatus payStatus) {
        this.payStatus = payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.PRINT_STATUS
     *
     * @return the value of productorder.PRINT_STATUS
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public PrintStatus getPrintStatus() {
        return printStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.PRINT_STATUS
     *
     * @param printStatus the value for productorder.PRINT_STATUS
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public void setPrintStatus(PrintStatus printStatus) {
        this.printStatus = printStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.TOTAL_COUNT
     *
     * @return the value of productorder.TOTAL_COUNT
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public String getTotalCount() {
        return totalCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.TOTAL_COUNT
     *
     * @param totalCount the value for productorder.TOTAL_COUNT
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public void setTotalCount(String totalCount) {
        this.totalCount = totalCount == null ? null : totalCount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column productorder.TOTAL_PRICE
     *
     * @return the value of productorder.TOTAL_PRICE
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column productorder.TOTAL_PRICE
     *
     * @param totalPrice the value for productorder.TOTAL_PRICE
     *
     * @mbg.generated Mon Mar 12 15:41:29 CST 2018
     */
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice == null ? null : totalPrice.trim();
    }
}