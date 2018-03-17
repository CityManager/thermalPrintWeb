package ind.xwm.thermal.service;

import ind.xwm.thermal.dao.OrderDetailMapper;
import ind.xwm.thermal.dao.OrderIDMapper;
import ind.xwm.thermal.dao.ProductOrderMapper;
import ind.xwm.thermal.model.OrderDetail;
import ind.xwm.thermal.model.OrderID;
import ind.xwm.thermal.model.ProductOrder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductOrderService {

    @Resource
    private OrderIDMapper orderIDMapper;

    @Resource
    private ProductOrderMapper orderMapper;

    @Resource
    private OrderDetailMapper orderDetailMapper;

    @Transactional
    public void saveOrder(ProductOrder order) {
        orderMapper.insertSelective(order);
        List<OrderDetail> orderDetailList = order.getOrderDetails();
        if(orderDetailList != null && orderDetailList.size() > 0) {
            orderDetailMapper.insertBatch(orderDetailList);
        }
        updateOrderIdStatus(order.getOrderId());
    }

    @Transactional
    public void saveOrUpdate(ProductOrder order) {
        if(orderMapper.exist(order) == 1) {
            orderMapper.updateByPrimaryKeySelective(order);
        } else {
            orderMapper.insertSelective(order);
            updateOrderIdStatus(order.getOrderId());
        }
    }

    private void updateOrderIdStatus(String id)  {
        String KEY_ID = "orderId";
        OrderID orderId = orderIDMapper.selectByPrimaryKey(KEY_ID);
        if (orderId != null && orderId.getOrderId().equals(id)) {
            orderId.setStatus(0);
            orderIDMapper.updateByPrimaryKey(orderId);
        }
    }

    public List<ProductOrder> findAll() {
        return orderMapper.findAll();
    }


    public ProductOrder findByOrderId(String orderId) {
        return orderMapper.selectByPrimaryKey(orderId);
    }

    public ProductOrder findWithDetail(String orderId) {
        return orderMapper.findDetail(orderId);
    }

}
