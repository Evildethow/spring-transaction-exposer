package org.evildethow.spring_transaction_exposer.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class SpringJdbcDaoTest {

    @SuppressWarnings("unused")
    @Autowired
    private SpringJdbcDao springJdbcDao;

    @Test
    public void assertNoTransactionForNonTransactionalMethod() {
        Assert.assertFalse(springJdbcDao.nonTransactionalMethod("test"));
    }

    @Test
    public void assertTransactionForTransactionalMethod() {
        Assert.assertTrue(springJdbcDao.transactionalMethod());
    }
}
