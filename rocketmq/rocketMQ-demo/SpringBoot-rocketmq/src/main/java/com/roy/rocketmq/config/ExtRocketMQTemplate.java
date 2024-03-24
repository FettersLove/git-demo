package com.roy.rocketmq.config;

import org.apache.rocketmq.spring.annotation.ExtRocketMQTemplateConfiguration;
import org.apache.rocketmq.spring.core.RocketMQTemplate;

/**
 * @author ：楼兰
 * @description:
 **/
@ExtRocketMQTemplateConfiguration()//为了监听多个事务，就可以另外绑定@RocketMQTransactionListener
public class ExtRocketMQTemplate extends RocketMQTemplate {
}
