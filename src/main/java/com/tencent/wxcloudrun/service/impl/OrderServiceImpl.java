package com.tencent.wxcloudrun.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tencent.wxcloudrun.common.Condition;
import com.tencent.wxcloudrun.dao.OrderMapper;
import com.tencent.wxcloudrun.dto.OrderDTO;
import com.tencent.wxcloudrun.entity.Order;
import com.tencent.wxcloudrun.service.IOrderService;
import com.tencent.wxcloudrun.utils.BeanCopyUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

/**
 * 订单表 服务实现类
 *
 * @author AI
 * @since 2023-05-29
 */
@Service
@AllArgsConstructor
public class OrderServiceImpl implements IOrderService {

    protected OrderMapper orderMapper;

    @Override
    public Integer save(OrderDTO dto) {
        dto.setCreateTime(LocalDate.now());
        dto.setUpdateTime(LocalDate.now());
        return orderMapper.insert(BeanCopyUtils.copy(dto,Order.class));
    }

    @Override
    public Integer updateById(OrderDTO dto) {
        dto.setCreateTime(LocalDate.now());
        dto.setUpdateTime(LocalDate.now());
        dto.setDeleted(1);
        return orderMapper.updateById(BeanCopyUtils.copy(dto,Order.class));
    }


    @Override
    public Integer deleteLogic(List<Integer> toIntList) {
        return orderMapper.deleteBatchIds(toIntList);
    }

    @Override
    public Order getOne(OrderDTO dto) {
        return orderMapper.selectOne(Condition.getQueryWrapper(BeanCopyUtils.copy(dto,Order.class)));
    }
}
