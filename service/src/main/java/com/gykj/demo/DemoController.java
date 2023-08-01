package com.gykj.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author
 * @Date: 2023-08-01  19:56
 */
public class DemoController {
    private final static Logger logger = LoggerFactory.getLogger(DemoController.class);
    public static void main(String[] args) {
        logger.info("logback 成功了");
        logger.error("logback 成功了");
        logger.debug("logback 成功了");
    }
}
