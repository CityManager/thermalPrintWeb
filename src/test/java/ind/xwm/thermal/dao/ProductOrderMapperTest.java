package ind.xwm.thermal.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ind.xwm.thermal.ThermalPrintWebApplicationTests;
import ind.xwm.thermal.enums.DeliverStatus;
import ind.xwm.thermal.enums.PayStatus;
import ind.xwm.thermal.model.ProductOrder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class ProductOrderMapperTest extends ThermalPrintWebApplicationTests {
    private static Logger logger = LogManager.getLogger(ProductOrderMapperTest.class);

    @Resource
    private ProductOrderMapper orderMapper;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void insert() {
        ProductOrder order = new ProductOrder();
        order.setOrderId("3885677837434");
        order.setCustomerName("aaaaa");
        order.setPayStatus(PayStatus.PAYED);
        order.setDeliverStatus(DeliverStatus.UNDELIVERED);
        order.setCustomerPhone("13800138000");
        logger.info("保存产品订单记录：{}", orderMapper.insert(order));
    }

    @Test
    public void findAll() throws JsonProcessingException {
        logger.info("所有订单:{}", objectMapper.writeValueAsString(orderMapper.findAll()));
    }
}