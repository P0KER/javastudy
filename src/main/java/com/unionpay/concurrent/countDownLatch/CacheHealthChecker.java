package com.unionpay.concurrent.countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by puke on 2018/10/22
 */
public class CacheHealthChecker extends BaseHealthChecker
{
    public CacheHealthChecker(CountDownLatch latch)  {
        super("Cache Service", latch);
    }

    @Override
    public void verifyService()
    {
        System.out.println("Checking " + this.getServiceName());
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("[" + Thread.currentThread().getName() + "]" + this.getServiceName() + " is UP");
    }
}