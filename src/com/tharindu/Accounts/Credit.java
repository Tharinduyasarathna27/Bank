package com.tharindu.Accounts;

import java.io.InvalidObjectException;

public class Credit extends Visa {

    @Override
    public void withdraw(Double amount) {

        try {
            if(validateCardNumber("8126")){
                super.withdraw(amount);
            }
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        } catch (CreditAccountException e) {
            e.printStackTrace();
        }
    }
}
