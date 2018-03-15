package ind.xwm.thermal;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@MapperScan("ind.xwm.thermal.dao")
@SpringBootTest
public class ThermalPrintWebApplicationTests {

    @Test
    public void contextLoads() {
    }

}
