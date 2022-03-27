package com.raise.mapper;

import com.raise.bean.UserAccount;

import java.util.List;

/**
 * @author xiangxiaolong
 * @create 2022-03-27 13:14
 */
public interface AccountMapper {
    public void save(UserAccount userAccount);
    public List<UserAccount> selectAll();
}
