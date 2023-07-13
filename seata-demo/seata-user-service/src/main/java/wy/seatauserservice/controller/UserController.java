package wy.seatauserservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wy.seatauserservice.domain.CommonResult;
import wy.seatauserservice.service.AccountService;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @Author:王艺
 * @Project:learn
 * @File:UserController
 * @Date:2023/7/12 13:23
 */
@RestController
@RequestMapping("/account")
public class UserController {
    @Resource
    private AccountService accountService;
    @GetMapping("/deductMoney")
    public CommonResult deductMoney(@RequestParam("user_id") Long user_id, @RequestParam("money") BigDecimal money){
        accountService.deductMoney(user_id,money);
        return new CommonResult<>("扣款成功",200);
    }
}
