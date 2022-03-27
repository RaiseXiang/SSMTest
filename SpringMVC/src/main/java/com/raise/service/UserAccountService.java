package com.raise.service;

import com.raise.bean.UserAccount;

import java.util.List;

/**
 * @author xiangxiaolong
 * @create 2022-03-27 13:59
 */
public interface UserAccountService {
    void save(UserAccount userAccount);
    List<UserAccount> selectAll();
}
