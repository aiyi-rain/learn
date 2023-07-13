package wy.seatastockservice.domain;

import lombok.Data;

/**
 * @Author:王艺
 * @Project:learn
 * @File:Storage
 * @Date:2023/7/12 14:22
 */
@Data
public class Storage {
    private Long id;
    private Long product_id;
    private Integer total;
    private Integer used;
    private Integer residue;
}
