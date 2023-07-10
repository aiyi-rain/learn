package wy.sentinel02.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wy.sentinel02.util.CommonResult;

/**
 * @Author:王艺
 * @Project:learn
 * @File:RateLimitController
 * @Date:2023/7/10 18:30
 */
@RestController
@RequestMapping("/rateLimit")
public class RateLimitController {
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler ="handleException")
    public CommonResult byResource(){
        return new CommonResult<>("按资源名称限流",200);
    }
    public CommonResult handleException(BlockException exception){
        return new CommonResult<>(exception.getClass().getCanonicalName(),200);
    }

}
