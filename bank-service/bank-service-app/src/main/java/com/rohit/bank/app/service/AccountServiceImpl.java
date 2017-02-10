package com.rohit.bank.app.service;

import com.rohit.account.AccountService;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.springframework.stereotype.Component;

@Component(value = "accountService")
public class AccountServiceImpl implements AccountService.Iface, AccountService.AsyncIface {

    @Override
    public double getBalance(int accountNumber) throws TException {
        return 0;
    }

    @Override
    public void getBalance(int accountNumber, AsyncMethodCallback<Double> resultHandler) throws TException {

    }
}
