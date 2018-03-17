package jp.co.arthur.common.web;

/**
 * ウィザード形式の基底コントローラクラス<br>
 *
 */
public interface BaseWizardController {

	String input();

	String confirm();

	String complete();
}
