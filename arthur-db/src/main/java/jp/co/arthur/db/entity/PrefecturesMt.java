package jp.co.arthur.db.entity;

import java.io.Serializable;

import jp.co.arthur.common.log.annotation.Ignore;

public class PrefecturesMt implements Serializable {
	/**
	 *
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column prefectures_mt.PREFECTURES_ID
	 *
	 * @mbg.generated Sun Oct 14 18:45:27 JST 2018
	 */
	private Integer prefecturesId;

	/**
	 *
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column prefectures_mt.NAME
	 *
	 * @mbg.generated Sun Oct 14 18:45:27 JST 2018
	 */
	private String name;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database table prefectures_mt
	 *
	 * @mbg.generated Sun Oct 14 18:45:27 JST 2018
	 */
	@Ignore
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column prefectures_mt.PREFECTURES_ID
	 *
	 * @return the value of prefectures_mt.PREFECTURES_ID
	 *
	 * @mbg.generated Sun Oct 14 18:45:27 JST 2018
	 */
	public Integer getPrefecturesId() {
		return prefecturesId;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column prefectures_mt.PREFECTURES_ID
	 *
	 * @param prefecturesId the value for prefectures_mt.PREFECTURES_ID
	 *
	 * @mbg.generated Sun Oct 14 18:45:27 JST 2018
	 */
	public void setPrefecturesId(Integer prefecturesId) {
		this.prefecturesId = prefecturesId;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column prefectures_mt.NAME
	 *
	 * @return the value of prefectures_mt.NAME
	 *
	 * @mbg.generated Sun Oct 14 18:45:27 JST 2018
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column prefectures_mt.NAME
	 *
	 * @param name the value for prefectures_mt.NAME
	 *
	 * @mbg.generated Sun Oct 14 18:45:27 JST 2018
	 */
	public void setName(String name) {
		this.name = name;
	}
}