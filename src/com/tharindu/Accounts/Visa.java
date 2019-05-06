package com.tharindu.Accounts;

import java.io.InvalidObjectException;

public class Visa extends CreditAccount {

    @Override
    public void withdraw(Double amount) {
        System.out.println("withdraw made from Credit Account Class");
    }

    public boolean validateCardNumber(String cardNumber) throws InvalidObjectException, CreditAccountException{

        try {
            try {
                if (validateAccount(cardNumber)) {

                    if (cardNumber.startsWith("812"))
                        return true;
                    throw new InvalidObjectException("Invalid card Number");
                } else {
                    throw new CreditAccountException("Invalid Account Number");
                }
            } catch (AccountException e) {
                throw new CreditAccountException("Account validation failed",e);
            }
        }catch (IllegalArgumentException iae){
            throw new CreditAccountException("Account validation failed" ,iae);
        }
    }
}
