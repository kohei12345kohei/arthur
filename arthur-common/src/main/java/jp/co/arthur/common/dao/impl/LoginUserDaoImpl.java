package jp.co.arthur.common.dao.impl;

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
@Repository
public class LoginUserDaoImpl implements LoginUserDao {

	/** 保存先ファイルパス */
	public static final String RESOURCES = OsDefine.isWin() ? "C:\\work\\arthur_db.xlsx" : "/Applications/arthur_db.xlsx";

	/**
	 * {@inheritDoc}
	 */
	@Select
	@Override
	public LoginUser findByLoginId(String loginId) {

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
					loginUser.setRegDate(DateUtil.toDate(row.getCell(3).getStringCellValue(), DateFormat.YYYYMMDD_HHMMSS));
					loginUser.setUpdateDate(DateUtil.toDate(row.getCell(4).getStringCellValue(), DateFormat.YYYYMMDD_HHMMSS));

				}
			}

		} catch (EncryptedDocumentException e) {
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
	public void create(LoginUser entity) {

		try (FileInputStream in = new FileInputStream(RESOURCES);
				Workbook workbook = WorkbookFactory.create(in);
				FileOutputStream fos = new FileOutputStream(RESOURCES)) {
			Sheet sheet = workbook.getSheet(TABLE_NAME);

			Row newRow = sheet.createRow(sheet.getLastRowNum() + 1);

			newRow.createCell(0).setCellValue(entity.getLoginId());
			newRow.createCell(1).setCellValue(entity.getPassword());
			newRow.createCell(2).setCellValue(entity.getAccount());
			newRow.createCell(3).setCellValue(DateUtil.toString(DateUtil.getSysDate(), DateFormat.YYYYMMDD_HHMMSS));
			newRow.createCell(4).setCellValue(DateUtil.toString(DateUtil.getSysDate(), DateFormat.YYYYMMDD_HHMMSS));

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
	@Select
	@Override
	public LoginUser findByAccount(String account) {


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

				if (account.equals(row.getCell(2).getStringCellValue())) {

					loginUser.setLoginId(row.getCell(0).getStringCellValue());
					loginUser.setPassword(row.getCell(1).getStringCellValue());
					loginUser.setAccount(row.getCell(2).getStringCellValue());
					loginUser.setRegDate(DateUtil.toDate(row.getCell(3).getStringCellValue(), DateFormat.YYYYMMDD_HHMMSS));
					loginUser.setUpdateDate(DateUtil.toDate(row.getCell(4).getStringCellValue(), DateFormat.YYYYMMDD_HHMMSS));

				}
			}

		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return loginUser;
	}

}
