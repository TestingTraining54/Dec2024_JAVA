package day8;
import java.io.IOException;
public class ReadExcelData {
/*
 * .xls - HSSFWorkbook/HSSFSheet/HSSFRow/HSSFCell
 * .xlsx - XSSFWorkbook/XSSFSheet/XSSFRow/XSSFCell
 */
	public static void main(String[] args) throws IOException {
		
		ReadDataFromExcelLib readExcel = new ReadDataFromExcelLib("./src/day8/testdata.xlsx", "Registration");
		readExcel.getData();
	}
}
