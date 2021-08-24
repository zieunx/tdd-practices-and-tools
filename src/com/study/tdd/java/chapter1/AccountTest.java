package com.study.tdd.java.chapter1;

public class AccountTest {

    public void testAccount() throws Exception {
        Account account = new Account();

        if (account == null) {
            throw  new Exception("계좌 생성 실패");
        }
    }

    public void testGetBalance() {

    }

    public static void main(String[] args) {
        AccountTest test = new AccountTest();
        try {
            test.testAccount(); // 계좌생성 테스트
            test.testGetBalance(); // 잔고조회 테스트12
        } catch (Exception e) {
            System.out.println("실패 X");
            return;
        }
        System.out.println("성공 O");
    }
}
