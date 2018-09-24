package jp.co.arthur.business.db.dao.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Repository;

import jp.co.arthur.business.db.dao.UserInfoDao;
import jp.co.arthur.business.db.entity.UserInfo;
import jp.co.arthur.common.type.OsDefine;
import jp.co.arthur.common.util.DateFormatType;
import jp.co.arthur.common.util.DateUtil;

/**
 * ユーザ情報Dao実装クラス<br>
 *
 */
@Repository
public class UserInfoDaoImpl implements UserInfoDao {


	/** 保存先ファイルパス */
	public static final String RESOURCES = OsDefine.isWin() ? "C:\\work\\arthur_db.xlsx" : "/Applications/arthur_db.xlsx";

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void create(UserInfo entity) {

		try (FileInputStream in = new FileInputStream(RESOURCES);
				Workbook workbook = WorkbookFactory.create(in);
				FileOutputStream fos = new FileOutputStream(RESOURCES)) {
			Sheet sheet = workbook.getSheet(TABLE_NAME);

			Row newRow = sheet.createRow(sheet.getLastRowNum() + 1);

			newRow.createCell(0).setCellValue(entity.getAccount());
			newRow.createCell(1).setCellValue(DateUtil.toString(DateUtil.getSysDate(), DateFormatType.YYYYMMDD_HHMMSS));
			newRow.createCell(2).setCellValue(DateUtil.toString(DateUtil.getSysDate(), DateFormatType.YYYYMMDD_HHMMSS));

			fos.flush();
			workbook.write(fos);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserInfo findByAccount(String account) {


		UserInfo loginUser = new UserInfo();

		try (Workbook workbook = WorkbookFactory.create(new File(RESOURCES))) {

			Sheet sheet = workbook.getSheet(TABLE_NAME);
			Iterator<Row> iteRow = sheet.rowIterator();
			while (iteRow.hasNext()) {

				// 1行取得
				Row row = iteRow.next();

				// ヘッダーの場合、次のレコードに進む
				if (row.getRowNum() == 0) {
					continue;
				}

				if (account.equals(row.getCell(0).getStringCellValue())) {

					loginUser.setAccount(row.getCell(0).getStringCellValue());
					loginUser.setRegDate(DateUtil.toDate(row.getCell(1).getStringCellValue(), DateFormatType.YYYYMMDD_HHMMSS));
					loginUser.setUpdateDate(DateUtil.toDate(row.getCell(2).getStringCellValue(), DateFormatType.YYYYMMDD_HHMMSS));

				}
			}

		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return loginUser;
	}

}
