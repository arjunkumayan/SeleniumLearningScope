package ExcelDataReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelDataInListOfMap {

	//public static String excelFileName="./src/test/resources/testData/"+excelfileName+".xlsx";
	
	
	// Data in List of Map
	public static List<LinkedHashMap<String, String>> getExcelDataAsMap(String ExcelFileName, String sheetName)
	{
		List<LinkedHashMap<String, String>> dataList = new ArrayList<>();
		
		String fileName = "./src/test/resources/testData/"+ExcelFileName+".xlsx";
		
		File file = new File(fileName);
		Workbook book = null;
		Sheet sheet = null;
		
		try {
			book = WorkbookFactory.create(file);
			sheet = book.getSheet(sheetName);
			
		} catch (IOException e) {
				e.printStackTrace();
		}
		
		System.out.println("Total rows in a sheet: "+sheet.getLastRowNum());
		System.out.println("Total columns in a sheet: "+sheet.getRow(0).getLastCellNum());
		
		// Get Data set count which will be equal to cell counts of any row
		int countOfDataSet = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("Count of physical data set: "+countOfDataSet);
		
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("Count of physical data rows: "+rowCount);
		// skip the first rows as it contains the field name
		
		for(int i = 1; i<countOfDataSet ; i++)
		{
			LinkedHashMap<String,String> data =  new LinkedHashMap<>();
			
			for(int j=1; j<rowCount ; j++)
			{
				Row r = sheet.getRow(j);
				
			String fieldName = r.getCell(0).getStringCellValue();
			System.out.println(fieldName);
			String fieldValue = r.getCell(i).getStringCellValue();	
			System.out.println(fieldValue);
			
			data.put(fieldName, fieldValue);
			
				
			}
			dataList.add(data);
			
		}
		
		return dataList;
		
	}
	
	public static void main(String[] args) {
		
		getExcelDataAsMap("StudentData", "EmployeeList");
		

	}

}
