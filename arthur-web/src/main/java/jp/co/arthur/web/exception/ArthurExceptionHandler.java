package jp.co.arthur.web.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import jp.co.arthur.common.exception.BaseExceptionHandler;

/**
 * アーサー例外ハンドラクラス
 *
 */
public class ArthurExceptionHandler implements BaseExceptionHandler, HandlerExceptionResolver {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ModelAndView resolveException(HttpServletRequest request
										, HttpServletResponse response
										, Object handler
										, Exception e) {
		ModelAndView model = new ModelAndView();
		model.setViewName("error");
		return null;
	}

}
