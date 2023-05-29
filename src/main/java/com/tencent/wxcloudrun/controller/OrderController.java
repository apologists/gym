package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.OrderDTO;
import com.tencent.wxcloudrun.entity.Order;
import com.tencent.wxcloudrun.service.CounterService;
import com.tencent.wxcloudrun.service.IOrderService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

/**
 * 订单表 控制器
 *
 * @author AI
 * @since 2023-05-29
 */
@RestController
@AllArgsConstructor
@RequestMapping("order")
public class OrderController {

	@Resource
	private IOrderService orderService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	public ApiResponse detail(OrderDTO dto) {
		Order detail = orderService.getOne(dto);
		return ApiResponse.ok(detail);
	}

	/**
	 * 新增 订单表
	 */
	@PostMapping("/save")

	public ApiResponse save(@RequestBody OrderDTO dto) {
		return ApiResponse.ok(orderService.save(dto));
	}

	/**
	 * 修改 订单表
	 */
	@PutMapping("/update")
	public ApiResponse update(@RequestBody OrderDTO dto) {
		return ApiResponse.ok(orderService.updateById(dto));
	}


}
