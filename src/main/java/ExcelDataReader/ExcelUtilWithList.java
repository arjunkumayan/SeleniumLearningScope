package ExcelDataReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilWithList {
	
	public static Workbook book;
	public static Sheet sheet;
	
	
	public static String TESTDATA_SHEET_PATH="D:\\Users\\asingh6766\\eclipse-workspace\\SeleniumLearning\\src\\test\\resources\\testData\\HubSpotTestData.xlsx";

	public static List<String> getTestData(String sheetName)
	{
		List<String> dataList = new ArrayList<>();
		
		try {
			FileInputStream ip = new FileInputStream(TESTDATA_SHEET_PATH);
			book = WorkbookFactory.create(ip);
			sheet = book.getSheet(sheetName);
			
		int row = sheet.getLastRowNum();
		int column = sheet.getRow(0).getLastCellNum();
		
			System.out.println("Row is: "+row);
			System.out.println("Column is: "+column);

			String data[][] = new String[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

			for (int i = 0; i < sheet.getLastRowNum(); i++) {

				for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {

					System.out.println("Value of I: "+i);
					System.out.println("value of K: "+k);
					
					data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				   // System.out.println(data[i][k]);
					dataList.add(data[i][k]);
				    
				}
			}

			return dataList;

		} catch (FileNotFoundException e) {
			System.out.println("File not foundException");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IO Exception");
			e.printStackTrace();
		}

		return null;

	}
	
	  public static void main(String args[]) {
		  List<String> data=getTestData("contacts"); 
		 // System.out.println(" ");
		  	  
		  for(int i=0 ; i<data.size(); i++)
		  { 
			  System.out.print(data.get(i));
			  System.out.println();
		  }
	 
	  }
	
}
