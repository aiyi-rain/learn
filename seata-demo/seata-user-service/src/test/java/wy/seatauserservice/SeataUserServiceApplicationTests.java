package wy.seatauserservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import wy.seatauserservice.service.AccountService;

import javax.annotation.Resource;
import java.math.BigDecimal;

@SpringBootTest
class SeataUserServiceApplicationTests {
    @Resource
    private AccountService accountService;


    @Test
    void contextLoads() {

        accountService.deductMoney(Long.valueOf(1), BigDecimal.valueOf(10));
    }

}
