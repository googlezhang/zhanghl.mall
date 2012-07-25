package com.zhanghl.mall.log4jexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLog4j {
    final Logger logger = LoggerFactory.getLogger(TestLog4j.class);
    Integer t;
    Integer oldT;
    public void setTemperature(Integer temperature) {
        oldT = t;
        t = temperature;
        logger.error("Temperature set to {}. Old temperature was {}.", t, oldT);
        if (temperature.intValue() > 50) {
            logger.info("Temperature has risen above 50 degrees.");
        }
    }
    public static void main(String[] args) {
        TestLog4j wombat = new TestLog4j();
        wombat.setTemperature(1);
        wombat.setTemperature(55);
    }

}
