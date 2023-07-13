package wy.seatauserservice.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Author:王艺
 * @Project:learn
 * @File:Account
 * @Date:2023/7/12 12:25
 */
@Data
public class Account {
    private Long id;
    private Long user_id;
    private BigDecimal total;
    private BigDecimal used;
    private BigDecimal residue;
}
