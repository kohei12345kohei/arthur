package jp.co.arthur.common.log;

/**
 * logger
 *
 */
public class Logger {

	private org.slf4j.Logger logger;

	Logger(org.slf4j.Logger logger) {
		this.logger = logger;
	}

	public void trace(String message) {
		logger.trace(message);
	}

	public void info(String message) {
		logger.info(message);
	}

	public void warn(String message) {
		logger.warn(message);
	}

	public void warn(String message, Throwable t) {
		logger.warn(message, t);
	}

	public void error(String message) {
		logger.error(message);
	}

	public void error(String message, Throwable t) {
		logger.error(message, t);
	}

	public void traceBean(Object bean) {
		trace(LogMessageFactory.getMessage(bean));
	}

	public void infoBean(Object bean) {
		info(LogMessageFactory.getMessage(bean));
	}

	public void warnBean(Object bean) {
		warn(LogMessageFactory.getMessage(bean));
	}

	public void warnBean(Object bean, Throwable t) {
		warn(LogMessageFactory.getMessage(bean), t);
	}

	public void errorBean(Object bean) {
		error(LogMessageFactory.getMessage(bean));
	}

	public void errorBean(Object bean, Throwable t) {
		error(LogMessageFactory.getMessage(bean), t);
	}

}
