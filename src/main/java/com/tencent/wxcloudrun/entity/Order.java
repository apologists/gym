package com.tencent.wxcloudrun.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.EqualsAndHashCode;


import java.time.LocalDate;
import java.util.Date;

/**
 * 订单表实体类
 *
 * @author AI
 * @since 2023-05-29
 */
@Data
@TableName("order_info")
public class Order {

    private static final long serialVersionUID = 1L;
  @TableId(value = "order_id")
  private String orderId;
  private String userId;
  private Integer num;
  private LocalDate createTime;
  private LocalDate updateTime;
  private String startTime;
  private String endTime;
  private Integer deleted;
  private String firstTime;

}
