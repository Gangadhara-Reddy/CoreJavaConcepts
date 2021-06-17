
public class Array_exception {

	public static void main(String[] args) {
		System.out.println("beinning");
		try {
			int i[] = new int[4];
			i[5] =100;
		}catch(Exception e) {
			System.out.println("Error occured");
			//screenshot
			//send email with screenshot
			e.printStackTrace();
		}
		System.out.println("ending");
	}

}
