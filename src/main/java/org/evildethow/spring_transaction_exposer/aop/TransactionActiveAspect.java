package org.evildethow.spring_transaction_exposer.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Aspect
public class TransactionActiveAspect {

    @SuppressWarnings("unused")
    @Before("execution(* org.evildethow.spring_transaction_exposer.dao..*.*(..))")
    public void logTransactionActive(JoinPoint joinPoint) {
        System.out.println("Transaction status [" + TransactionSynchronizationManager.isActualTransactionActive()
        + "] for method signature [" + joinPoint.toString() + "]");
    }
}
