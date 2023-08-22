package defaultpacakge;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadriven 
{

	//once column is indentify  then scan entire test cases colomn to identify purchase testcases row
	//after you grap purchase testcases row = pull all the data of that row and feed into test
	
	public static void main(String[] args) throws IOException 
	{
		//fileinputStream argument
		
		FileInputStream  file=new  FileInputStream("\"C:\\Users\\Priya Ingole\\Desktop\\selenium tool\\New Microsoft Excel Worksheet.xlsx\"");
		XSSFWorkbook  workbook=new XSSFWorkbook(file);
		
		int sheet = workbook.getNumberOfSheets();
		for(int i=0; i<sheet; i++) 
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet10")) 
			{
				
			
			XSSFSheet sheets = workbook.getSheetAt(i);
			//identify test cases column by scanning the entire 1st row
			
			Iterator<Row> rows = sheets.iterator();
			Row firstrow = rows.next();
			
			Iterator<Cell>  ce=firstrow.cellIterator();
			int k =0;
			int coloumn = 0;
			while(ce.hasNext()) 
			{
				Cell  value = ce.next();
				if(value.getStringCellValue().equalsIgnoreCase("priya")) 
				{
					
					coloumn=k;
					
				}
			k++;	
			}
			System.out.println(coloumn);
			
			
			
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
