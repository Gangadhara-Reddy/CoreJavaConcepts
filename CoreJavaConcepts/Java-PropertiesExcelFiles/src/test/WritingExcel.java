package test;

/*import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;*/

public class WritingExcel {

	//public static void main(String[] args) {
		public static void main(String[] args) throws IOException {
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet Sheet0 = workbook.createSheet("firstSheet");
			
			Row row0 = Sheet0.createRow(0);
			Cell cellA = row0.createCell(0);
			Cell cellB = row0.createCell(1);
			
			
			cellA.setCellValue("first cell");
			cellA.setCellValue("second cell");
			
			//connecting streams
			File f = new File("E:\\Selenium\\My Prepared Selenium Docs with Videos\\Selenium Webdriver with Java (Basics + Advance + Architect)\\Readin and writing Files\\MyExcelFile.xlsx");
			FileOutputStream fo = new FileOutputStream(f);
			
			workbook.write(fo);
			
			//closing the stream
			fo.close();
			
			System.out.println("File created!!!");


	}

}
