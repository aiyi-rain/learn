package wy.seatauserservice.service;

import java.math.BigDecimal;

/**
 * @Author:王艺
 * @Project:learn
 * @File:AccountService
 * @Date:2023/7/12 13:07
 */
public interface AccountService {
    //扣款操作
    void deductMoney(Long user_id, BigDecimal money);
}
