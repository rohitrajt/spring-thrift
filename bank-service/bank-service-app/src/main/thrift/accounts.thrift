namespace java com.rohit.account

include "base.thrift"

service AccountService {

    double getBalance(1:base.int accountNumber)
}