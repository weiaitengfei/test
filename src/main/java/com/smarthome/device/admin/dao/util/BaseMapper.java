package com.smarthome.device.admin.dao.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created with IntelliJ IDEA.
 * User: 智能家居小组
 * Date: 2019/10/29 下午 03:04
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T>{

}
