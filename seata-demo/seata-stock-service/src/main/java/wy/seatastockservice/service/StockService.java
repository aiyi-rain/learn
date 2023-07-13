package wy.seatastockservice.service;

/**
 * @Author:王艺
 * @Project:learn
 * @File:StockService
 * @Date:2023/7/12 14:38
 */
public interface StockService {
    //扣减库存
    void decrease(Long product_id,Integer count);
}
