/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */
package com.pig4cloud.pig.goods.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.math.BigDecimal;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 商品信息表
 *
 * @author liyunqiang
 * @date 2019-07-25 00:27:38
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("goods")
public class Goods extends Model<Goods> {
private static final long serialVersionUID = 1L;

    /**
   * 主键
   */
    @TableId
    private String id;
    /**
   * 一级分类代码
   */
    private String typeOneCode;
    /**
   * 一级分类名称
   */
    private String typeOneName;
    /**
   * 二级分类代码
   */
    private String typeTwoCode;
    /**
   * 二级分类名称
   */
    private String typeTwoName;
    /**
   * 编号
   */
    private String goodsCode;
    /**
   * 商品名称
   */
    private String goodsName;
    /**
   * 价格
   */
    private BigDecimal price;
    /**
   * 货号
   */
    private String goodsNum;
    /**
   * 排序
   */
    private Integer orders;
    /**
   * 库存
   */
    private Integer goodsStock;
    /**
   * 销量
   */
    private Integer salesVolume;
    /**
   * 审核状态
   */
    private Integer auditStatus;
    /**
   * 审核状态名称
   */
    private String auditStatusName;
    /**
   * 创建时间
   */
    private LocalDateTime createTime;
    /**
   * 创建人id
   */
    private String createUserId;
    /**
   * 创建人名称
   */
    private String createUserName;
    /**
   * 修改时间
   */
    private LocalDateTime updateTime;
    /**
   * 修改人id
   */
    private String updateUserId;
    /**
   * 修改人名称
   */
    private String updateUserName;
    /**
   * 删除状态（0:否;1:是）
   */
    private Boolean deleted;
  
}
