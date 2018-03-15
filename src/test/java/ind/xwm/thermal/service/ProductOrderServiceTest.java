package ind.xwm.thermal.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ind.xwm.thermal.ThermalPrintWebApplicationTests;
import ind.xwm.thermal.enums.DeliverStatus;
import ind.xwm.thermal.model.OrderDetail;
import ind.xwm.thermal.model.ProductOrder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProductOrderServiceTest extends ThermalPrintWebApplicationTests {
    private static Logger logger = LogManager.getLogger(ProductOrderServiceTest.class);

    @Resource
    private ProductOrderService orderService;

    private ObjectMapper objectMapper = new ObjectMapper();


    @Test
    public void saveOrder() {
        ProductOrder order = new ProductOrder();
        order.setOrderId("2384087534234");
        order.setDeliverStatus(DeliverStatus.UNDELIVERED);
        List<OrderDetail> orderDetails = new ArrayList<>();
        for(int i=0; i<5; i++) {
            OrderDetail detail = new OrderDetail();
            detail.setOrderId("2384087534234");
            detail.setProductName("产品" + i);
            orderDetails.add(detail);
        }
        order.setOrderDetails(orderDetails);

        orderService.saveOrder(order);
    }


    @Test
    public void saveOrUpdate() {
        ProductOrder order = new ProductOrder();
        order.setOrderId("2384087534234");
        order.setCustomerName("vvvip客户");
        orderService.saveOrUpdate(order);
    }

    @Test
    public void findAll() throws JsonProcessingException {
        logger.info("findAll:{}", objectMapper.writeValueAsString(orderService.findAll()));
    }

    @Test
    public void findByOrderId() throws JsonProcessingException {
        logger.info("find 2384087534234:{}", objectMapper.writeValueAsString(orderService.findByOrderId("2384087534234")));
    }

    @Test
    public void findWithDetail() throws JsonProcessingException {
        logger.info("find 2384087534234:{}", objectMapper.writeValueAsString(orderService.findWithDetail("2384087534234")));
    }

    // todo: 分页
}