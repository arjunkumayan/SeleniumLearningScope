package ExcelDataReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelDataInMapAndAddToListOFMap {
	public static List<LinkedHashMap<String, String>> getExcelDataAsMap(String excelFileName, String sheetName) throws EncryptedDocumentException, IOException
	{
		// Create a workbook
	Workbook wb = WorkbookFactory.create(new File("./src/test/resources/testData/"+excelFileName+".xlsx"));
		
	// Get sheet with given name "Sheet1"
	 
	           Sheet sheet = wb.getSheet(sheetName);
	           
	           // Initialized a empty list which retain order
	           List<LinkedHashMap<String,String>> dataList = new ArrayList<LinkedHashMap<String, String>>();
	           
	           // Get data set count which will be equal to cell counts of any row
	           
	          int countOfDataSet =  sheet.getRow(0).getPhysicalNumberOfCells();
	          
	          System.out.println("Total number of columns: "+countOfDataSet);
	          
	          // skipping first column as it is field names
	          for( int i=1; i< countOfDataSet ; i++)
	          {
	        	  // Create a map to store each data set individually
	        	  
	        	  LinkedHashMap<String,String> data = new LinkedHashMap<String, String>();
	        	  // Get the row i.e field names count
	        	  
	        	  int rowCount =  sheet.getPhysicalNumberOfRows();
	        	  System.out.println("Total number of row is: "+rowCount);
	        	  // Now we need to iterate all rows but cell should increase once all row is done
	        	  // i.e (1,1),(2,1),(3,1),(4,1),(5,1) - first iteration
	        	  //     (1,2),(2,2),(3,2),(4,2),(5,2) - Second iteration
	        	  //     (1,3),(2,3),(3,3),(4,3),(5,3)  - Third iteration
	        	  
	        	  for( int j=1 ; j<rowCount ; j++)
	        	  {
	        		  Row r = sheet.getRow(j);
	        		  // field name is constant at 0th index 
	        		     String fieldName=  r.getCell(0).getStringCellValue();
	        		     System.out.println(fieldName);
	        		     String fieldValue=  r.getCell(i).getStringCellValue();
	        		     System.out.println(fieldValue);
	        		     // add data in Map
	        		     data.put(fieldName, fieldValue);
	        		    
	        	  }
	        	  // Add map to list after each iteration
	        	  
	        	  dataList.add(data);
	        	  
	        	  
	        	  
	          }
	          return dataList;
		
		
		
	}


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		List<LinkedHashMap<String, String>> mapDataList= getExcelDataAsMap("StudentData", "EmployeeList");
		
		System.out.println(" ");
		for(int i=0; i<mapDataList.size() ; i++)
		{
			System.out.println("Data set "+(i+1)+" : ");
			for(String s:mapDataList.get(i).keySet())
			{
				System.out.println(" Value of "+s+" is : "+mapDataList.get(i).get(s));
								
			}
			System.out.println("-----------------------------------");
		}
		
	}

}
