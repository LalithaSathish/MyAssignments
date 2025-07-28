package org.excelsheetdatadriven;


import java.io.InputStream;
import java.net.URL;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args){
		try {
			String excelUrl = "https://bnetgs-my.sharepoint.com/personal/vinothkumar_bnetgs_com/_layouts/15/doc.aspx?sourcedoc={68456559-df82-448e-9dc0-ab9963456c4e}&action=edit"; 

			InputStream input=new URL(excelUrl).openStream();

			Workbook book=new XSSFWorkbook(input);

			Sheet sheet = book.getSheet("Student_Information");

			Row row = sheet.getRow(4);

			Cell cell = row.getCell(0);

			System.out.println(cell.getStringCellValue());

			book.close();
			input.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
