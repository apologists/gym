package com.tencent.wxcloudrun.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tencent.wxcloudrun.dto.OrderDTO;
import com.tencent.wxcloudrun.entity.Order;

import java.util.List;

/**
 * 订单表 服务类
 *
 * @author AI
 * @since 2023-05-29
 */
public interface IOrderService {


        Integer save(OrderDTO dto) ;

        Integer updateById(OrderDTO dto) ;

        Integer deleteLogic(List<Integer> toIntList) ;

        Order getOne(OrderDTO dto) ;
}
