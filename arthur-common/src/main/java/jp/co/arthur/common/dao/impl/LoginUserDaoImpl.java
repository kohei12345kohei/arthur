package jp.co.arthur.common.dao.impl;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Repository;

import jp.co.arthur.common.dao.LoginUserDao;
import jp.co.arthur.common.entity.LoginUser;
import jp.co.arthur.common.other.OsDefine;
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
				if (row.getRowNum() == 0) continue;

				if (loginId.equals(row.getCell(0).getStringCellValue())) {

					loginUser.setLoginId(row.getCell(0).getStringCellValue());
					loginUser.setPassword(row.getCell(1).getStringCellValue());
					loginUser.setRegDate(DateUtil.formatDate(row.getCell(2).getStringCellValue()));
					loginUser.setUpdateDate(DateUtil.formatDate(row.getCell(3).getStringCellValue()));
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

}
