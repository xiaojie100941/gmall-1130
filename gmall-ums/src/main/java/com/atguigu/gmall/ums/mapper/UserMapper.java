package com.atguigu.gmall.ums.mapper;

import com.atguigu.gmall.ums.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * 
 * @author Edmund
 * @email jie100941@gmail.com
 * @date 2021-05-14 00:29:53
 */
@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
	
}
