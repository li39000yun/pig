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
package com.lyq4cloud.lyq.my.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lyq4cloud.lyq.my.entity.MyAppMenu;
import com.lyq4cloud.lyq.my.mapper.MyAppMenuMapper;
import com.lyq4cloud.lyq.my.service.MyAppMenuService;
import org.springframework.stereotype.Service;

/**
 * app菜单
 *
 * @author pig code generator
 * @date 2019-12-08 22:31:54
 */
@Service("myAppMenuService")
public class MyAppMenuServiceImpl extends ServiceImpl<MyAppMenuMapper, MyAppMenu> implements MyAppMenuService {

  /**
   * app菜单简单分页查询
   * @param myAppMenu app菜单
   * @return
   */
  @Override
  public IPage<MyAppMenu> getMyAppMenuPage(Page<MyAppMenu> page, MyAppMenu myAppMenu){
      return baseMapper.getMyAppMenuPage(page,myAppMenu);
  }

}
