package com.bigzone.controller;

import com.bigzone.service.AccountService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@RunWith(SpringRunner.class)
@WebMvcTest(TestController.class)
public class TestControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private AccountService accountService;

    @Test
    public void hello() throws Exception {
        int userId = 10;
        int expectedCredit = 100;
//        BDDMockito.given(this.creditSystemService.getUserCredit(anyInt())).willReturn(expectedCredit);

        mvc.perform(get("/test/hello/{id}", userId)).andExpect(content().string(String.valueOf(expectedCredit)));
    }

    @Test
    @Ignore
    public void dao() {
    }
}