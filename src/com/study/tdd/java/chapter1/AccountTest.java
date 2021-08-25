package com.study.tdd.java.chapter1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AccountTest {

    private Account account;

    @Test
    public void testAccount() throws Exception {
        setup(10000);
    }

    @Test
    public void testGetBalance() throws Exception {
        setup(10000);
        assertEquals("10000원으로 계좌 생성 후 잔고 조회", 10000, account.getBalance());

        setup(1000);
        assertEquals(1000, account.getBalance());

        setup(0);
        assertEquals(0, account.getBalance());
    }

    @Test
    public void testDeposit() throws Exception {
        setup(10000);
        account.deposit(1000);
        assertEquals(11000, account.getBalance());
    }

    @Test
    public void testWithdraw() throws Exception {
        setup(10000);
        account.withdraw(1000);
        assertEquals(9000, account.getBalance());
    }

    private void setup(int i) {
        account = new Account(i);
    }
}
