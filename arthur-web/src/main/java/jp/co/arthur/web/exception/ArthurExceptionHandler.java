package jp.co.arthur.web.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

import jp.co.arthur.common.exception.BaseExceptionHandler;
import jp.co.arthur.common.log.Logger;
import jp.co.arthur.common.log.LoggerFactory;
import jp.co.arthur.common.web.ArthurView;

/**
 * アーサー例外ハンドラクラス
 *
 */
public class ArthurExceptionHandler implements BaseExceptionHandler {

	private static final Logger LOG = LoggerFactory.getLogger(ArthurExceptionHandler.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ModelAndView resolveException(HttpServletRequest request
										, HttpServletResponse response
										, Object handler
										, Exception e) {
		LOG.error("", e);
		ModelAndView model = new ModelAndView();
		model.setViewName(ArthurView.ERROR.getUrl());
		return model;
	}

}
