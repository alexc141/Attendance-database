
	import java.io.FileOutputStream;

	import org.apache.poi.hssf.usermodel.HSSFCell;
	import org.apache.poi.hssf.usermodel.HSSFRow;
	import org.apache.poi.hssf.usermodel.HSSFSheet;
	import org.apache.poi.hssf.usermodel.HSSFWorkbook;

	public class ExcelWriter {

	private static String dest = "CreateExcelDemo.xls";
	private static HSSFWorkbook myWorkBook = new HSSFWorkbook();
	private static HSSFSheet mySheet = myWorkBook.createSheet();

	private static void excelLog(int row, int col, String value) {
	    HSSFRow myRow = mySheet.getRow(row);

	    if (myRow == null)
	        myRow = mySheet.createRow(row);

	    HSSFCell myCell = myRow.createCell(col);
	    myCell.setCellValue(value);
	}

	public static void main(String[] args) {
	    int numCol = 10; // assume 10 cols

	    for (int i = 0; i < 10; i++) {
	        for (int j = 0; j < numCol; j++) {
	            excelLog(i, j, "Row : " + i + ", Cell : " + j);
	        }
	    }

	    try {
	        FileOutputStream out = new FileOutputStream(dest);
	        myWorkBook.write(out);
	        out.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	}
