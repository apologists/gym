package com.tencent.wxcloudrun.dto;


import lombok.Data;

import java.time.LocalDate;

/**
 * 订单表数据传输对象实体类
 *
 * @author AI
 * @since 2023-05-29
 */
@Data
public class OrderDTO  {

					private String orderId;
					private String userId;
					private Integer num;
					private LocalDate createTime;
					private LocalDate updateTime;
					private Integer deleted;


		}
