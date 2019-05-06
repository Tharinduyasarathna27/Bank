package com.tharindu.Accounts;

public class CreditAccount extends Account {

    boolean validateAccount(String accountNumber) throws AccountException {

        try {
            if (accountWithdrawValidation()) {

                if (accountNumber.length() > 5)
                    return true;
                throw new IllegalArgumentException("account number should length over 5 digits");
            } else {
                return false;
            }
        }catch (AccountException ae){
            throw new IllegalArgumentException("withdraw count validation failed",ae);
        }
    }

}

