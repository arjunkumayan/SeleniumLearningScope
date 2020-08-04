package ExcelDataReader;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelDataInMap {

	public static LinkedHashMap<String, String> getExcelDataInMap(String excelfileName, String sheetName)
	{
		LinkedHashMap<String, String> data = new LinkedHashMap<String, String>();
		
		Workbook workbook = null;
		File file = new File("./src/test/resources/testData/"+excelfileName+".xlsx");
		try {
			workbook = WorkbookFactory.create(file);
		} catch (EncryptedDocumentException e) {
			} catch (IOException e) {
			}
		Sheet sheet = workbook.getSheet(sheetName);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		
		System.out.println(rowCount);
		
		for( int i=1; i<rowCount ; i++)
		{
			Row row = sheet.getRow(i);
			String fieldName = row.getCell(0).getStringCellValue();
			String fieldValue = row.getCell(1).getStringCellValue();
			System.out.println(fieldName+" "+fieldValue);
			data.put(fieldName, fieldValue);
		}		
		return data;
	}
	
	
	
	public static void main(String[] args) {
		LinkedHashMap<String, String> mapData = getExcelDataInMap("StudentData", "EmployeeDetails");
		for(String d:mapData.keySet())
		{
			System.out.println("Value of "+d+" is = "+mapData.get(d));
		}
		

	}

}
