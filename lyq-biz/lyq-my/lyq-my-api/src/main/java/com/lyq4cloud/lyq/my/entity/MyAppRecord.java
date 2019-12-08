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
package com.lyq4cloud.lyq.my.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * app记录
 *
 * @author pig code generator
 * @date 2019-12-08 23:23:23
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("my_app_record")
public class MyAppRecord extends Model<MyAppRecord> {
private static final long serialVersionUID = 1L;

    /**
   * 编号
   */
    @TableId
    private Long id;
    /**
   * 类型
   */
    private String type;
    /**
   * 标题
   */
    private String title;
    /**
   * 备注
   */
    private String remark;
    /**
   * 图片链接
   */
    private String url;
    /**
   * 记录时间
   */
    private LocalDateTime date;
    /**
   * 创建者
   */
    private String createBy;
    /**
   * 创建时间
   */
    private LocalDateTime createTime;
    /**
   * 更新人
   */
    private String updateBy;
    /**
   * 更新时间
   */
    private LocalDateTime updateTime;
    /**
   * 删除标记
   */
    private String delFlag;
  
}
