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
package com.lyq4cloud.lyq.my.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pig4cloud.pig.common.core.util.R;
import com.pig4cloud.pig.common.log.annotation.SysLog;
import com.lyq4cloud.lyq.my.entity.MyAppMenu;
import com.lyq4cloud.lyq.my.service.MyAppMenuService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


/**
 * app菜单
 *
 * @author pig code generator
 * @date 2019-12-08 22:31:54
 */
@RestController
@AllArgsConstructor
@RequestMapping("/myappmenu")
public class MyAppMenuController {

  private final  MyAppMenuService myAppMenuService;

  /**
   * 简单分页查询
   * @param page 分页对象
   * @param myAppMenu app菜单
   * @return
   */
  @GetMapping("/page")
  public R<IPage<MyAppMenu>> getMyAppMenuPage(Page<MyAppMenu> page, MyAppMenu myAppMenu) {
    return  new R<>(myAppMenuService.getMyAppMenuPage(page,myAppMenu));
  }


  /**
   * 通过id查询单条记录
   * @param id
   * @return R
   */
  @GetMapping("/{id}")
  public R<MyAppMenu> getById(@PathVariable("id") Long id){
    return new R<>(myAppMenuService.getById(id));
  }

  /**
   * 新增记录
   * @param myAppMenu
   * @return R
   */
  @SysLog("新增app菜单")
  @PostMapping
  @PreAuthorize("@pms.hasPermission('my_myappmenu_add')")
  public R save(@RequestBody MyAppMenu myAppMenu){
    return new R<>(myAppMenuService.save(myAppMenu));
  }

  /**
   * 修改记录
   * @param myAppMenu
   * @return R
   */
  @SysLog("修改app菜单")
  @PutMapping
  @PreAuthorize("@pms.hasPermission('my_myappmenu_edit')")
  public R update(@RequestBody MyAppMenu myAppMenu){
    return new R<>(myAppMenuService.updateById(myAppMenu));
  }

  /**
   * 通过id删除一条记录
   * @param id
   * @return R
   */
  @SysLog("删除app菜单")
  @DeleteMapping("/{id}")
  @PreAuthorize("@pms.hasPermission('my_myappmenu_del')")
  public R removeById(@PathVariable Long id){
    return new R<>(myAppMenuService.removeById(id));
  }

}
