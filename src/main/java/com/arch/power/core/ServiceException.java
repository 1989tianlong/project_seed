package com.arch.power.core;

/**
 * 服务（业务异常）异常如“账号或密码错误”,该异常只做INFO级别的日志处理 @see WebMvcConfigurer
 */
public class ServiceException extends RuntimeException {

	public ServiceException() {
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}
}
