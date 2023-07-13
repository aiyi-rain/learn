package wy.seataorderservice.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import wy.seataorderservice.domain.Order;

/**
 * @Author:王艺
 * @Project:learn
 * @File:OrderDao
 * @Date:2023/7/12 13:33
 */
@Repository
public interface OrderDao {
    //创建订单
    void create(Order order);
    //修改订单状态
    void updata(@Param("user_id") Long user_id,@Param("status") Integer status);

}
