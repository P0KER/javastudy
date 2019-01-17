package com.unionpay.mdc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * Created by puke on 2019/1/16
 */
public class MDCThreadTest {
    private static final Logger logger = LoggerFactory.getLogger(MDCThreadTest.class);


    public static void main(String[] args) throws Exception{
        MDC.put("LOGID", "log000");
        logger.info("logger in main...");
        new Thread(() -> {
            logger.info("[" + Thread.currentThread().getName() + "]" + "logger in thread1...");
            MDC.put("LOGID", "log111");
            logger.info("[" + Thread.currentThread().getName() + "]" + "logger in thread1...");
            MDC.remove("LOGID");
            logger.info("[" + Thread.currentThread().getName() + "]" + "logger in thread1 after remove...");
            new Thread(() -> {
                logger.info("[" + Thread.currentThread().getName() + "]"  + "logger in thread2...");
                MDC.put("LOGID", "log222");
                logger.info("[" + Thread.currentThread().getName() + "]" + "logger in thread2...");
            }, "thread2").start();
        }, "thread1").start();
        Thread.sleep(5000);

        logger.info("[" + Thread.currentThread().getName() + "]" + "logger in main last...");
    }
}
