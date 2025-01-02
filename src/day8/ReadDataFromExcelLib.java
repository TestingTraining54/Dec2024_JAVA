package day8;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelLib {
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public ReadDataFromExcelLib(String filePath, String sheetName) throws IOException {
		wb = new XSSFWorkbook(filePath);
		sheet = wb.getSheet(sheetName);
	}

	public int noOfRow() {
		return sheet.getPhysicalNumberOfRows();
	}

	public int noOfCol() {
		return sheet.getRow(0).getPhysicalNumberOfCells();
	}

	public void getData() {
		for (int row = 0; row < noOfRow(); row++) {// row=3<3
			for (int col = 0; col < noOfCol(); col++) {// col=0<2
				System.out.print(sheet.getRow(row).getCell(col).getStringCellValue() + " ");

			}
			System.out.println();
		}

	}
}
