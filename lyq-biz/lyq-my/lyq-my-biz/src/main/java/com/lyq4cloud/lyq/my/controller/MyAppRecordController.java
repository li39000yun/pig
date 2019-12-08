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
import com.lyq4cloud.lyq.my.entity.MyAppRecord;
import com.lyq4cloud.lyq.my.service.MyAppRecordService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


/**
 * app记录
 *
 * @author pig code generator
 * @date 2019-12-08 23:23:23
 */
@RestController
@AllArgsConstructor
@RequestMapping("/myapprecord")
public class MyAppRecordController {

  private final  MyAppRecordService myAppRecordService;

  /**
   * 简单分页查询
   * @param page 分页对象
   * @param myAppRecord app记录
   * @return
   */
  @GetMapping("/page")
  public R<IPage<MyAppRecord>> getMyAppRecordPage(Page<MyAppRecord> page, MyAppRecord myAppRecord) {
    return  new R<>(myAppRecordService.getMyAppRecordPage(page,myAppRecord));
  }


  /**
   * 通过id查询单条记录
   * @param id
   * @return R
   */
  @GetMapping("/{id}")
  public R<MyAppRecord> getById(@PathVariable("id") Long id){
    return new R<>(myAppRecordService.getById(id));
  }

  /**
   * 新增记录
   * @param myAppRecord
   * @return R
   */
  @SysLog("新增app记录")
  @PostMapping
  @PreAuthorize("@pms.hasPermission('my_myapprecord_add')")
  public R save(@RequestBody MyAppRecord myAppRecord){
    return new R<>(myAppRecordService.save(myAppRecord));
  }

  /**
   * 修改记录
   * @param myAppRecord
   * @return R
   */
  @SysLog("修改app记录")
  @PutMapping
  @PreAuthorize("@pms.hasPermission('my_myapprecord_edit')")
  public R update(@RequestBody MyAppRecord myAppRecord){
    return new R<>(myAppRecordService.updateById(myAppRecord));
  }

  /**
   * 通过id删除一条记录
   * @param id
   * @return R
   */
  @SysLog("删除app记录")
  @DeleteMapping("/{id}")
  @PreAuthorize("@pms.hasPermission('my_myapprecord_del')")
  public R removeById(@PathVariable Long id){
    return new R<>(myAppRecordService.removeById(id));
  }

}
