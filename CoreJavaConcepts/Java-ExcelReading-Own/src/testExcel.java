
public class testExcel {

	public static void main(String[] args) {
		ExcelReader excel = new ExcelReader("E:\\\\Selenium\\\\My Prepared Selenium Docs with Videos\\\\Navin Reddy\\\\Excel Reading\\\\Excel_Reading.xlsx");
		String sheetname = "abc";
		
		//excel.getRowCount(sheetname);
		System.out.println(excel.getRowCount(sheetname));
		System.out.println(excel.getColumnCount(sheetname));
		
		System.out.println(excel.getCellData(sheetname, "emp id", 2));
		
		excel.setCellData(sheetname, "emp name", 5, "Ganga");
	}

}
