package wy.seataorderservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import wy.seataorderservice.domain.CommonResult;

/**
 * @Author:王艺
 * @Project:learn
 * @File:StockService
 * @Date:2023/7/12 14:46
 */
@FeignClient(value = "stock-service")
public interface StockService {
    //扣减库存
    @GetMapping("/stock/decrease")
    CommonResult decrease(@RequestParam("product_id") Long product_id,@RequestParam("count") Integer count);
}
