
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWriter {


	public static void main(String[] args) {
		String excelFilePath = "CreateExcelDemo.xls";
		Scanner scan = new Scanner(System.in);
		try {
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
			Workbook workbook = WorkbookFactory.create(inputStream);

			Sheet sheet = workbook.getSheetAt(0);
			
			
			for(int i = 0; i<10; i++) {
				Row rowA = sheet.createRow(i);
				Cell cellA = rowA.createCell(0);
				Cell cellB = rowA.createCell(1);
				cellB.setCellValue(new HSSFRichTextString("[insert ID]"));
				cellA.setCellValue(new HSSFRichTextString("[insert name]"));
			}
			
			
			
			
			inputStream.close();

			FileOutputStream outputStream = new FileOutputStream(new File("CreateExcelDemo.xls"));
			workbook.write(outputStream);
			workbook.close();
			outputStream.close();
			
		} catch (IOException | EncryptedDocumentException ex) {
			ex.printStackTrace();
		}
	}

}