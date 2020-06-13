package com.lpc.gmall.user.mapper;

import com.lpc.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by DELL on 2020/6/11.
 */
public interface UserMapper extends Mapper<UmsMember>{

    List<UmsMember> selectAllUser();

}
