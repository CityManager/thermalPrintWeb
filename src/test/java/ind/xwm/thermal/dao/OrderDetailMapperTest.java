package ind.xwm.thermal.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ind.xwm.thermal.ThermalPrintWebApplicationTests;
import ind.xwm.thermal.model.OrderDetail;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.junit.Test;

import javax.annotation.Resource;

public class OrderDetailMapperTest extends ThermalPrintWebApplicationTests {
    private static Logger logger = LogManager.getLogger(OrderDetailMapperTest.class);
    @Resource
    private OrderDetailMapper orderDetailMapper;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void insert() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setAmount("100");
        orderDetail.setOrderId("29293477743");
        orderDetail.setProductCount("1");
        orderDetail.setProductPrice("100.00");
        orderDetail.setProductUnit("件");
        logger.info("成功保存记录：{}", orderDetailMapper.insert(orderDetail));
    }

    @Test
    public void select() throws JsonProcessingException {
        logger.info("查询记录：{}", objectMapper.writeValueAsString(orderDetailMapper.selectByPrimaryKey(1)));
    }

    @Test
    public void selectByOrderId() throws JsonProcessingException {
        logger.info("查询特定id下的订单详情：{}", objectMapper.writeValueAsString(orderDetailMapper.selectByOrderId("2384087534234")));
    }
}