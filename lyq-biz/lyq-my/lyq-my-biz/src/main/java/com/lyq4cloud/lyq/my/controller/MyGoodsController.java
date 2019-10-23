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
import com.lyq4cloud.lyq.my.entity.MyGoods;
import com.pig4cloud.pig.common.core.util.R;
import com.pig4cloud.pig.common.log.annotation.SysLog;
import com.lyq4cloud.lyq.my.service.MyGoodsService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


/**
 * 货物表
 *
 * @author lyq
 * @date 2019-10-19 11:45:33
 */
@RestController
@AllArgsConstructor
@RequestMapping("/mygoods")
public class MyGoodsController {

  private final  MyGoodsService myGoodsService;

  /**
   * 简单分页查询
   * @param page 分页对象
   * @param myGoods 货物表
   * @return
   */
  @GetMapping("/page")
  public R<IPage<MyGoods>> getMyGoodsPage(Page<MyGoods> page, MyGoods myGoods) {
    return  new R<>(myGoodsService.getMyGoodsPage(page,myGoods));
  }


  /**
   * 通过id查询单条记录
   * @param id
   * @return R
   */
  @GetMapping("/{id}")
  public R<MyGoods> getById(@PathVariable("id") Long id){
    return new R<>(myGoodsService.getById(id));
  }

  /**
   * 新增记录
   * @param myGoods
   * @return R
   */
  @SysLog("新增货物表")
  @PostMapping
  @PreAuthorize("@pms.hasPermission('my_mygoods_add')")
  public R save(@RequestBody MyGoods myGoods){
    return new R<>(myGoodsService.save(myGoods));
  }

  /**
   * 修改记录
   * @param myGoods
   * @return R
   */
  @SysLog("修改货物表")
  @PutMapping
  @PreAuthorize("@pms.hasPermission('my_mygoods_edit')")
  public R update(@RequestBody MyGoods myGoods){
    return new R<>(myGoodsService.updateById(myGoods));
  }

  /**
   * 通过id删除一条记录
   * @param id
   * @return R
   */
  @SysLog("删除货物表")
  @DeleteMapping("/{id}")
  @PreAuthorize("@pms.hasPermission('my_mygoods_del')")
  public R removeById(@PathVariable Long id){
    return new R<>(myGoodsService.removeById(id));
  }

}
