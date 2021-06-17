
public class finally_block {

	public static void main(String[] args) {
		final int x =100;  //u can not change difference between final and finally
		//x=200;//it thorws error if i uncomment this as "the value can't be changed"
		try {
			//db conneciton
			//executing query
			//validating the data and comparing with UI website
			//closing the conneciton
			int i[]= new int[4];
			i[5] = 100;
			System.out.println("Close db conenciton in try block");
		}catch(Exception e) {
			System.out.println("Error occured");
			
		}finally {
			System.out.println("Closing db conneciton in finally block");
		}

	}

}


//lets say there is excepiton in executing query and db conneciton will still be there.
//only 1 person can login at a time.so we need to close the db conneciton..but here it is remaining active
//these cases finallly is useful

//no matter like irrespective of error occured or not..finally block gets executed.
