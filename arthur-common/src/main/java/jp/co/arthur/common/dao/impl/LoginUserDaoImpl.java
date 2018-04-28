package jp.co.arthur.common.dao.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import jp.co.arthur.common.dao.LoginUserDao;
import jp.co.arthur.common.entity.LoginUser;
import jp.co.arthur.common.other.Insert;
import jp.co.arthur.common.other.OsDefine;
import jp.co.arthur.common.other.Select;
import jp.co.arthur.common.util.DateFormat;
import jp.co.arthur.common.util.DateUtil;

/**
 * ログインユーザDao実装クラス<br>
 *
 */
public class LoginUserDaoImpl implements LoginUserDao {

	/** 保存先ファイルパス */
	public static final String RESOURCES = OsDefine.isWin() ? "C:\\work\\arthur_db.xlsx" : "/Applications/arthur_db.xlsx";

	/**
	 * {@inheritDoc}
	 */
	@Select
	@Override
	public LoginUser findLoginUserByLoginId(String loginId) {

		LoginUser loginUser = new LoginUser();

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

				if (loginId.equals(row.getCell(0).getStringCellValue())) {

					loginUser.setLoginId(row.getCell(0).getStringCellValue());
					loginUser.setPassword(row.getCell(1).getStringCellValue());
					loginUser.setAccount(row.getCell(2).getStringCellValue());
					loginUser.setRegDate(DateUtil.formatDate(row.getCell(3).getStringCellValue()));
					loginUser.setUpdateDate(DateUtil.formatDate(row.getCell(4).getStringCellValue()));

				}
			}

		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return loginUser;
	}

	/**
	 * {@inheritDoc}
	 */
	@Insert
	@Override
	public void registLoginUser(LoginUser entity) {

		try (FileInputStream in = new FileInputStream(RESOURCES);
				Workbook workbook = WorkbookFactory.create(in);
				FileOutputStream fos = new FileOutputStream(RESOURCES)) {
			Sheet sheet = workbook.getSheet(TABLE_NAME);

			Row newRow = sheet.createRow(sheet.getLastRowNum() + 1);

			newRow.createCell(0).setCellValue(entity.getLoginId());
			newRow.createCell(1).setCellValue(entity.getPassword());
			newRow.createCell(2).setCellValue(entity.getAccount());
			newRow.createCell(3).setCellValue(DateUtil.toString(entity.getRegDate(), DateFormat.YYYYMMDD_HHMMSS));
			newRow.createCell(4).setCellValue(DateUtil.toString(entity.getUpdateDate(), DateFormat.YYYYMMDD_HHMMSS));

			fos.flush();
			workbook.write(fos);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
