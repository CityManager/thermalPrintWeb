package ind.xwm.thermal.service;

import ind.xwm.thermal.dao.OrderIDMapper;
import ind.xwm.thermal.model.OrderID;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class OrderIdService {
    private static String KEY_ID = "orderId";

    @Resource
    private OrderIDMapper orderIDMapper;

    @Transactional
    public String getOrderId() {
        String id;
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
        String todayStr = df.format(new Date());
        OrderID orderId = orderIDMapper.selectByPrimaryKey(KEY_ID);
        if (orderId == null) {
            id = todayStr + "0001";
        } else if (orderId.getStatus().equals(1)) {
            id = orderId.getOrderId();
        } else {
            id = String.valueOf(Long.valueOf(orderId.getOrderId()) + 1);
        }

        OrderID newOrderId = new OrderID();
        newOrderId.setId(KEY_ID);
        newOrderId.setOrderId(id);
        newOrderId.setStatus(1);
        orderIDMapper.insertSelective(newOrderId);
        return id;
    }

    @Transactional
    public void usedOrderId(String id) {
        OrderID orderId = orderIDMapper.selectByPrimaryKey(KEY_ID);
        if (orderId != null && orderId.getOrderId().equals(id)) {
            orderId.setStatus(0);
            orderIDMapper.updateByPrimaryKey(orderId);
        }
    }
}
