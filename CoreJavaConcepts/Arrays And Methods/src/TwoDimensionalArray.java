
public class TwoDimensionalArray {

	public static void main(String[] args) {
		int rows=3;
		int cols=3;
		
		int table[][] = new int[rows][cols];
		
		//assign the values in first row
		table[0][0] = 10;
		table[0][1] = 11;
		table[0][2] = 12;
		
		table[1][0] = 20;
		table[1][1] = 21;
		table[1][2] = 22;
		
		table[2][0] = 30;
		table[2][1] = 31;
		table[2][2] = 32;
		
		System.out.println(table.length);  // .lengh for getting row length.
		System.out.println(table[0].length); //index of that column.length - for getting column length
		
		System.out.println(table[0][0]);  // to print the first dimension
		
		//to priont complete array in the rectangular form
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(" "+table[i][j]);  // if u dont want in a next line dont use println and use print
			}
			System.out.println("");
		}

	}

}
