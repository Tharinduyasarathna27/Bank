package com.tharindu;

import com.tharindu.Accounts.Credit;

public class Application {

    public static void main(String[] args) {

        Credit creditCard =new Credit();
        creditCard.withdraw(1000.0);
    }
}
