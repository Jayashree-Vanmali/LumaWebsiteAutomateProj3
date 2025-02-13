package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility3 
{
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	XSSFCell celldata_name;
	XSSFCell celldata_password;

	public XSSFSheet setworkbook() throws IOException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\x8hsbp\\git\\E-CommerceWebsite\\LumaProject3\\src\\main\\java\\testData\\LumaProjectData.xlsx");
		workbook =new XSSFWorkbook(fs);
		sheet = workbook.getSheetAt(0);
		return sheet;
	}
	public XSSFCell get_Username(int rownum, int colnum) throws IOException 
	{
		sheet = setworkbook();
		celldata_name = sheet.getRow(rownum).getCell(colnum);
		return celldata_name;
	}
	public XSSFCell get_password(int rownum, int colnum) throws IOException 
	{
		sheet = setworkbook();
		celldata_password=sheet.getRow(rownum).getCell(colnum);
		return celldata_password;
	}
}
