package com.raise.service.impl;

import com.raise.bean.UserAccount;
import com.raise.mapper.AccountMapper;
import com.raise.service.UserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xiangxiaolong
 * @create 2022-03-27 13:59
 */
@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private AccountMapper accountMapper;
    @Override
    public void save(UserAccount userAccount) {
        accountMapper.save(userAccount);
    }

    @Override
    public List<UserAccount> selectAll() {
        List<UserAccount> userAccounts = accountMapper.selectAll();
        return userAccounts;
    }
}
