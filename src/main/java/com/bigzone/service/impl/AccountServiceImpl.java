package com.bigzone.service.impl;

import com.bigzone.dao.AccountDao;
import com.bigzone.entity.AccountEntity;
import com.bigzone.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public AccountEntity getOneAccount(AccountEntity account) {
        return accountDao.selectOne(account);
    }
}
