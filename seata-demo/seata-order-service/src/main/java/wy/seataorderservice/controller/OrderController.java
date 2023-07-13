package wy.seataorderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wy.seataorderservice.domain.CommonResult;
import wy.seataorderservice.domain.Order;
import wy.seataorderservice.service.OrderService;

import javax.annotation.Resource;

/**
 * @Author:王艺
 * @Project:learn
 * @File:OrderController
 * @Date:2023/7/12 14:11
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService orderService;
    @GetMapping("/create")
    public CommonResult create(@RequestParam("order") Order order){
        orderService.create(order);
        return new CommonResult<>("订单创建成功",200);
    }
}
