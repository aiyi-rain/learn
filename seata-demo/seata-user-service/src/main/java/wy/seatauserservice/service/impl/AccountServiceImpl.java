package wy.seatauserservice.service.impl;

import org.springframework.stereotype.Service;
import wy.seatauserservice.dao.AccountDao;
import wy.seatauserservice.service.AccountService;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Author:王艺
 * @Project:learn
 * @File:AccountServiceImpl
 * @Date:2023/7/12 13:09
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    @Override
    public void deductMoney(Long user_id, BigDecimal money) {
        System.out.println("---user-service模拟账户开始扣款---");
        accountDao.deductMoney(user_id,money);
        System.out.println("---user-service账户扣款成功---");
    }
}
