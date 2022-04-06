package class11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	private FileInputStream fis;
	private XSSFWorkbook wb;
	XSSFSheet sheet;

	public ExcelReader() throws IOException {
		File file = new File("C:/testing/testing.xlsx");
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);
	}

	public int getNoOfRows() throws IOException {
		return sheet.getLastRowNum() + 1;
	}

	public String readCell(int rowNo, int columnNo) {
		Row row = sheet.getRow(rowNo);
		Cell cell = row.getCell(columnNo);
		return cell.getStringCellValue();
	}

}
