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
package com.lyq4cloud.lyq.my.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyq4cloud.lyq.my.entity.MyGoods;
import org.apache.ibatis.annotations.Param;

/**
 * 货物表
 *
 * @author lyq
 * @date 2019-10-19 11:45:33
 */
public interface MyGoodsMapper extends BaseMapper<MyGoods> {
  /**
    * 货物表简单分页查询
    * @param myGoods 货物表
    * @return
    */
  IPage<MyGoods> getMyGoodsPage(Page page, @Param("myGoods") MyGoods myGoods);


}
