package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream; 
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class WriteXLData {
	
	String sheetName = GetDayName.getDayName();
	int rowNum = 2;
	
	public void writeIntoExel(String longestSuggestion, String shortestSuggestion) {
		String filePath = "src\\test\\resources\\testdata\\testdata.xlsx";
		try {
			InputStream inp = new FileInputStream(filePath);
			Workbook workbook = WorkbookFactory.create(inp);
			Sheet sheet = workbook.getSheet(sheetName);
			
			Row row = sheet.getRow(rowNum);
			if (row == null) {
                row = sheet.createRow(rowNum);
            }
			row.createCell(3).setCellValue(longestSuggestion);
            row.createCell(4).setCellValue(shortestSuggestion);
            rowNum++;
            FileOutputStream outputStream = new FileOutputStream(filePath);
            workbook.write(outputStream);
            outputStream.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
