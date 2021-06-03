package com.atguigu.gmall.oms.mapper;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author Edmund
 * @email jie100941@gmail.com
 * @date 2021-05-14 00:27:06
 */
@Mapper
public interface OrderMapper extends BaseMapper<OrderEntity> {
	
}
