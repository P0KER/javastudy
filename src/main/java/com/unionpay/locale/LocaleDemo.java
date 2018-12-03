package com.unionpay.locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by puke on 2018/11/26
 */
public class LocaleDemo {
    private static final Logger logger = LoggerFactory.getLogger(LocaleDemo.class);
    public static void main(String[] args) {
        Locale localeCN = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle("res.MessageBundle", localeCN);
        logger.info("zh_CN: hello --> {}", bundle.getString("hello"));

        Locale localeUS = Locale.US;
        ResourceBundle bundle1 = ResourceBundle.getBundle("res.MessageBundle", localeUS);
        logger.info("en_US: hello --> {}", bundle1.getString("hello"), localeUS);
    }
}
