package com.bigzone.dao;

import com.bigzone.entity.AccountEntity;

public interface AccountDao {

    AccountEntity selectOne(AccountEntity account);
}
