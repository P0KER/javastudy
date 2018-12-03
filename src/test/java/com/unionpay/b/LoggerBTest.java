package com.unionpay.b;

import com.unionpay.a.LoggerATest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by puke on 2018/11/23
 */
public class LoggerBTest {
    private static final Logger logger = LoggerFactory.getLogger(LoggerBTest.class);

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            logger.info("ccc");
            logger.warn("ddd");
        }
    }
}
