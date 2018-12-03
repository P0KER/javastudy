package com.unionpay.a;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by puke on 2018/11/22
 */
public class LoggerATest {
    private static final Logger logger = LoggerFactory.getLogger("syslog");

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++){
            logger.info("aaa");
            logger.warn("bbb");
        }
    }
}
