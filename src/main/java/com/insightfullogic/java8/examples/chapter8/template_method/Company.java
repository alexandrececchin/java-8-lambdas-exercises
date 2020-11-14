package com.insightfullogic.java8.examples.chapter8.template_method;

public interface Company {

    // BEGIN checkSignatures
    void checkIdentity() throws ApplicationDenied;

    void checkProfitAndLoss() throws ApplicationDenied;

    void checkHistoricalDebt() throws ApplicationDenied;
    // END checkSignatures

}
