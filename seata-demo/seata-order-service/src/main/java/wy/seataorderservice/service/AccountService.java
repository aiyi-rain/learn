package wy.seataorderservice.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import wy.seataorderservice.domain.CommonResult;

import java.math.BigDecimal;

/**
 * @Author:王艺
 * @Project:learn
 * @File:AccountService
 * @Date:2023/7/12 13:55
 */
@FeignClient(value = "user-service")
public interface AccountService {
    //扣减账户余额
    @GetMapping("/account/deductMoney")
    CommonResult deductMoney(@RequestParam("user_id") Long user_id, @RequestParam("money") BigDecimal money);
}
