package ExcelDataReader;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataInMap {
	
	public static LinkedHashMap<String, String> getExcelDataInMap(String excelfileName, String sheetName) throws EncryptedDocumentException, IOException
	{
		
		LinkedHashMap<String,String> dataMap = new LinkedHashMap<>();
		File file = new File("D:/Users/asingh6766/eclipse-workspace/SeleniumLearning/src/test/resources/testData/"+excelfileName+".xlsx");	
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet(sheetName);
		
		int row =  sheet.getLastRowNum();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(row+" and "+column);
		for(int i = 0 ;i<row ; i++)
		{
				
				String fieldName =sheet.getRow(i).getCell(0).getStringCellValue();
			   	    			
			    String fieldValue = sheet.getRow(i).getCell(1).getStringCellValue();
			     
			    dataMap.put(fieldName, fieldValue);
		}
		
		return dataMap;
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		LinkedHashMap<String, String> dataFromMap= getExcelDataInMap("StudentData","EmployeeDetails"); 
	     
		// KeySet
		System.out.println(dataFromMap.keySet());
		for(String data: dataFromMap.keySet())
		{
		System.out.println(dataFromMap.get(data));
		}
			
		//EntrySet
		 System.out.println(dataFromMap.entrySet());		  	  
		 for(Entry<String, String> dataKeySet:dataFromMap.entrySet()) { //
		 System.out.println(dataKeySet);
		 }
		 
		 System.out.println(dataFromMap.entrySet());		  	  
		 for(Entry<String, String> dataSet:dataFromMap.entrySet()) { //
		 System.out.println("Key is: "+dataSet.getKey()+"and Value: "+dataSet.getValue());
		 }
	}

}
