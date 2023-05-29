package com.tencent.wxcloudrun.common;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ClassName ModelRo.java
 * @Description 功能描述：
 * @author AI 2018年3月6日19:31:15
 */
@Data
public class CommonDto {

    /**
     * 页码
     */
    private Integer       pageNum  = 1;
    /**
     * 每页数量
     */
    private Integer       pageSize = 50;
    /**
     * 排序参数
     */
    private String        orderAsc;
    /**
     * 排序方式：asc/desc
     */
    private String        orderDesc;

    /**
     * 查询关键字
     */
    private String        keywords;

    /**
     * 查询关键字字段
     */
    private String        column;


    /**
     * 查询开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date          startTime;
    /**
     * 查询结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date          endTime;

}
