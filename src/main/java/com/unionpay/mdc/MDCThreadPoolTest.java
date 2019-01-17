package com.unionpay.mdc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by puke on 2019/1/16
 */
public class MDCThreadPoolTest {

    private static final Logger logger = LoggerFactory.getLogger(MDCThreadPoolTest.class);
    private static ExecutorService es = Executors.newFixedThreadPool(1);

    public static void main(String[] args) throws Exception{
        MDC.put("LOGID", "log000");
        logger.info("[" + Thread.currentThread().getName() + "]" + "logger in main...");
        es.execute(()->{
            logger.info("[" + Thread.currentThread().getName() + "]" + "logger in thread...");
            MDC.put("LOGID", "log111");
            logger.info("[" + Thread.currentThread().getName() + "]" + "logger in thread...");
            MDC.remove("LOGID");
            logger.info("[" + Thread.currentThread().getName() + "]" + "logger in thread...");
        });
        Thread.sleep(5000);
        logger.info("[" + Thread.currentThread().getName() + "]" + "logger in main...");
    }
}
