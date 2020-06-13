package com.lpc.gmall.user.service;

import com.lpc.gmall.user.bean.UmsMember;
import com.lpc.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * Created by DELL on 2020/6/11.
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
