package org.evildethow.spring_transaction_exposer.dao;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

public class SpringJdbcDao {

    public boolean nonTransactionalMethod() {
        return TransactionSynchronizationManager.isActualTransactionActive();
    }

    @Transactional
    public boolean transactionalMethod() {
        return TransactionSynchronizationManager.isActualTransactionActive();
    }

}
