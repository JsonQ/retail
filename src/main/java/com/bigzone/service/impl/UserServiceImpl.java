package com.bigzone.service.impl;

import com.bigzone.service.CreditSystemService;
import com.bigzone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private CreditSystemService creditSystemService;

    @Override
    public int getCredit(int userId) {
        return creditSystemService.getUserCredit(userId);
    }
}
