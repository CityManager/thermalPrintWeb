package ind.xwm.thermal.service;

import ind.xwm.thermal.dao.ProductMapper;
import ind.xwm.thermal.model.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductService {
    @Resource
    private ProductMapper productMapper;

    // todo: 根据关键子搜素

    public List<Product> findAll(){
        return productMapper.findAll();
    }

    public Product findProduct(Integer id) {
        return productMapper.selectByPrimaryKey(id);
    }

    public void save(Product product) {
        productMapper.insert(product);
    }

    public void update(Product product) {
        productMapper.updateByPrimaryKeySelective(product);
    }

    public void delete(Product product) {
        productMapper.deleteByPrimaryKey(product.getId());
    }
}
