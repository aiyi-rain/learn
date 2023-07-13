package wy.seatastockservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wy.seatastockservice.domain.CommonResult;
import wy.seatastockservice.service.StockService;

import javax.annotation.Resource;

/**
 * @Author:王艺
 * @Project:learn
 * @File:StockController
 * @Date:2023/7/12 14:42
 */
@RestController
@RequestMapping("/stock")
public class StockController {
    @Resource
    private StockService service;
    @GetMapping("/decrease")
    public CommonResult decrease(@RequestParam("product_id") Long product_id,@RequestParam("count") Integer count){
        service.decrease(product_id, count);
        return new CommonResult<>("扣减库存成功",200);
    }
}
