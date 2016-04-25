package com.github.hualuomoli.plugin.mq;

/**
 * 消息服务
 * @author hualuomoli
 *
 */
public interface Message {

	/**
	 * get message destination name
	 * @return default destination message name
	 */
	String getDestinationName();

}
