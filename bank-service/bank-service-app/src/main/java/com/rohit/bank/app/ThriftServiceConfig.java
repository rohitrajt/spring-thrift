package com.rohit.bank.app;

import com.rohit.account.AccountService;
import com.rohit.bank.app.service.AccountServiceImpl;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServlet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;

@Configuration
public class ThriftServiceConfig {

    @Bean
    public TProtocolFactory tProtocolFactory() {
        return new TBinaryProtocol.Factory();
    }

    @Bean
    public Servlet account(TProtocolFactory protocolFactory, AccountServiceImpl accountService) {
        return new TServlet(new AccountService.Processor<AccountServiceImpl>(accountService), protocolFactory);
    }
}
