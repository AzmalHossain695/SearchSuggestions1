package utilities;

import org.apache.poi.ss.usermodel.Workbook;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.util.List;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadXLData {

	String sheetName = GetDayName.getDayName();

	public List<String> getSearchInputs () {
		String filePath = "src\\test\\resources\\testdata\\testdata.xlsx";
		try {
			InputStream inp = new FileInputStream(filePath);
            Workbook workbook = WorkbookFactory.create(inp);
            Sheet sheet = workbook.getSheet(sheetName);
            List<String> cellValues = new ArrayList<>();

            int startRow = 2; 
            int endRow = 11;  
            int column = 2;   

            for (int rowNum = startRow; rowNum <= endRow; rowNum++) {
                Row row = sheet.getRow(rowNum);
                if (row != null) {
                    Cell cell = row.getCell(column);
                    if (cell != null) {                        
                        String cellValue = cell.toString();
                        cellValues.add(cellValue);
                   }
               }
            } 
            return cellValues;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;		
	}
}