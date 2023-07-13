package wy.seataorderservice.service;

import wy.seataorderservice.domain.Order;

/**
 * @Author:王艺
 * @Project:learn
 * @File:OrderService
 * @Date:2023/7/12 13:48
 */
public interface OrderService {
    //创建订单
    void create(Order order);
}
