package com.unionpay.concurrent.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by puke on 2018/10/22
 */
public class DatabaseHealthChecker extends BaseHealthChecker
{
    public DatabaseHealthChecker(CountDownLatch latch)  {
        super("Database Service", latch);
    }

    @Override
    public void verifyService()
    {
        System.out.println("Checking " + this.getServiceName());
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("[" + Thread.currentThread().getName() + "]" + this.getServiceName() + " is UP");
    }
}