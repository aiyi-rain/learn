package wy.seatastockservice.service.impl;

import org.springframework.stereotype.Service;
import wy.seatastockservice.dao.StockDao;
import wy.seatastockservice.service.StockService;

import javax.annotation.Resource;

/**
 * @Author:王艺
 * @Project:learn
 * @File:StockServiceImpl
 * @Date:2023/7/12 14:39
 */
@Service
public class StockServiceImpl implements StockService {
    @Resource
    private StockDao stockDao;
    @Override
    public void decrease(Long product_id, Integer count) {
        System.out.println("---stock-service模拟扣减库存---");
        stockDao.delete(product_id,count);
        System.out.println("---扣减库存成功---");
    }
}
