package wy.seatauserservice.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

/**
 * @Author:王艺
 * @Project:learn
 * @File:AccountDao
 * @Date:2023/7/12 12:50
 */
@Repository
public interface AccountDao {
    //扣减账户余额
    void deductMoney(@Param("user_id") Long user_id,@Param("money") BigDecimal money);
}
