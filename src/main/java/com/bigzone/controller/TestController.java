package com.bigzone.controller;

import com.bigzone.entity.AccountEntity;
import com.bigzone.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@RequestMapping("/test")
public class TestController {
    private static Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private AccountService accountService;

    @RequestMapping(path="/hello/{id}")
    public String hello(){
        return "/helloworld";
    }

    @RequestMapping(path="/dao", method= RequestMethod.GET)
    @ResponseBody
    public String dao(@RequestBody AccountEntity accountParam){

        AccountEntity accountEntity = accountService.getOneAccount(accountParam);
        logger.debug(accountEntity.getName());

        return "success";
    }
}
