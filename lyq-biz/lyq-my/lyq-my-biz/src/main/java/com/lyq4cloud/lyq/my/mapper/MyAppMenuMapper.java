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
import com.lyq4cloud.lyq.my.entity.MyAppMenu;
import org.apache.ibatis.annotations.Param;

/**
 * app菜单
 *
 * @author pig code generator
 * @date 2019-12-08 22:31:54
 */
public interface MyAppMenuMapper extends BaseMapper<MyAppMenu> {
  /**
    * app菜单简单分页查询
    * @param myAppMenu app菜单
    * @return
    */
  IPage<MyAppMenu> getMyAppMenuPage(Page page, @Param("myAppMenu") MyAppMenu myAppMenu);


}
