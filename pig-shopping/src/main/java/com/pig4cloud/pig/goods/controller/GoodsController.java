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
package com.pig4cloud.pig.goods.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pig4cloud.pig.common.core.util.R;
import com.pig4cloud.pig.common.log.annotation.SysLog;
import com.pig4cloud.pig.goods.entity.Goods;
import com.pig4cloud.pig.goods.service.GoodsService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


/**
 * 商品信息表
 *
 * @author liyunqiang
 * @date 2019-07-25 00:27:38
 */
@RestController
@AllArgsConstructor
@RequestMapping("/goods")
public class GoodsController {

  private final  GoodsService goodsService;

  /**
   * 简单分页查询
   * @param page 分页对象
   * @param goods 商品信息表
   * @return
   */
  @GetMapping("/page")
  public R<IPage<Goods>> getGoodsPage(Page<Goods> page, Goods goods) {
    return  new R<>(goodsService.getGoodsPage(page,goods));
  }


  /**
   * 通过id查询单条记录
   * @param id
   * @return R
   */
  @GetMapping("/{id}")
  public R<Goods> getById(@PathVariable("id") String id){
    return new R<>(goodsService.getById(id));
  }

  /**
   * 新增记录
   * @param goods
   * @return R
   */
  @SysLog("新增商品信息表")
  @PostMapping
  @PreAuthorize("@pms.hasPermission('goods_goods_add')")
  public R save(@RequestBody Goods goods){
    return new R<>(goodsService.save(goods));
  }

  /**
   * 修改记录
   * @param goods
   * @return R
   */
  @SysLog("修改商品信息表")
  @PutMapping
  @PreAuthorize("@pms.hasPermission('goods_goods_edit')")
  public R update(@RequestBody Goods goods){
    return new R<>(goodsService.updateById(goods));
  }

  /**
   * 通过id删除一条记录
   * @param id
   * @return R
   */
  @SysLog("删除商品信息表")
  @DeleteMapping("/{id}")
  @PreAuthorize("@pms.hasPermission('goods_goods_del')")
  public R removeById(@PathVariable String id){
    return new R<>(goodsService.removeById(id));
  }

}
