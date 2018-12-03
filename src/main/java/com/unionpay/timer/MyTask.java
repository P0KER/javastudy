package com.unionpay.timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * Created by puke on 2018/11/28
 */
public class MyTask extends TimerTask{
    private static final Logger logger = LoggerFactory.getLogger(MyTask.class);
    @Override
    public void run() {
        logger.info("当前时间：{}", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()));
    }
}
