import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.*;

public class Excel {
    public static void main(String[] args) {
        // Creating an instance of HSSFWorkbook.
        HSSFWorkbook workbook = new HSSFWorkbook();
        
        // Create two sheets in the excel document and name it First Sheet and
        // Second Sheet.
        HSSFSheet firstSheet = workbook.createSheet("FIRST SHEET");
    

        HSSFRow rowA = firstSheet.createRow(0);
        HSSFCell cellA = rowA.createCell(0);
        cellA.setCellValue(new HSSFRichTextString("FIRST SHEET"));

        // To write out the workbook into a file we need to create an output
        // stream where the workbook content will be written to.
        try (FileOutputStream fos = new FileOutputStream(new File("CreateExcelDemo.xls"))) {
            workbook.write(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}