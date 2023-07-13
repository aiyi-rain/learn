package wy.seataorderservice.service.impl;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.stereotype.Service;
import wy.seataorderservice.dao.OrderDao;
import wy.seataorderservice.domain.Order;
import wy.seataorderservice.service.AccountService;
import wy.seataorderservice.service.OrderService;
import wy.seataorderservice.service.StockService;

import javax.annotation.Resource;

/**
 * @Author:王艺
 * @Project:learn
 * @File:OrderServiceImpl
 * @Date:2023/7/12 13:51
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private AccountService accountService;
    @Resource
    private StockService stockService;
    //业务流程
    //创建订单->扣减库存->扣款->修改订单状态
    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {
        //创建订单
        System.out.println("---order-service模拟添加订单---");
        orderDao.create(order);
        System.out.println("---order-service订单创建成功");
        //扣减库存
        System.out.println("---stock-service模拟扣减库存");
        stockService.decrease(order.getProduct_id(),order.getCount());
        System.out.println("---stock-service扣减库存成功");
        //扣款
        System.out.println("---user-service模拟扣款---");
        accountService.deductMoney(order.getUser_id(),order.getMoney());
        System.out.println("---user-service扣款成功---");
        //修改订单状态
        System.out.println("---order-serice模拟修改订单状态---");
        orderDao.updata(order.getUser_id(), order.getStatus());
        System.out.println("---order-service订单状态修改成功---");
    }
}
