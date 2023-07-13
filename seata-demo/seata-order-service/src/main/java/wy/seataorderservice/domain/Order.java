package wy.seataorderservice.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author:王艺
 * @Project:learn
 * @File:Order
 * @Date:2023/7/12 13:21
 */
@Data
public class Order {
    private Long id;
    private Long user_id;
    private Long product_id;
    private Integer count;
    private BigDecimal money;
    private Integer status;
}
