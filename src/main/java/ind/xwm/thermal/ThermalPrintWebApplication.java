package ind.xwm.thermal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("ind.xwm.thermal.dao")
public class ThermalPrintWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThermalPrintWebApplication.class, args);
    }
}
