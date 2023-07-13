package wy.seatastockservice.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author:王艺
 * @Project:learn
 * @File:StockDao
 * @Date:2023/7/12 14:27
 */
@Repository
public interface StockDao {
    //扣减库存
    void delete(@Param("product_id") Long product_id,@Param("count") Integer count);
}
