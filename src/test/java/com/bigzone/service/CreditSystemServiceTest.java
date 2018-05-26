package com.bigzone.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CreditSystemServiceTest {

    @Test
    public void test(){
        int userId = 10;

        CreditSystemService creditSystemService = mock(CreditSystemService.class);
        when(creditSystemService.getUserCredit(anyInt())).thenReturn(100);

        int ret = creditSystemService.getUserCredit(10);

        Assert.assertEquals(100, ret);
    }
}