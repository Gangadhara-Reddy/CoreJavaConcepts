package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testFilereading_writing {

	public static void main(String[] args) throws IOException {
		
		/*//create a file
		File file = new File("E:\\Selenium\\My Prepared Selenium Docs with Videos\\Selenium Webdriver with Java (Basics + Advance + Architect)\\Readin and writing Files\\test.txt");
		file.createNewFile();
		
		//write inside a file
		FileWriter fw = new FileWriter("E:\\Selenium\\My Prepared Selenium Docs with Videos\\Selenium Webdriver with Java (Basics + Advance + Architect)\\Readin and writing Files\\test.txt");
		BufferedWriter filewriter = new BufferedWriter(fw);
		filewriter.write("Please Write inside this file");
		filewriter.newLine();
		filewriter.write("This is my second line");
		
		filewriter.flush();*/
		
		//read from a file
		FileReader fr = new FileReader("E:\\Selenium\\My Prepared Selenium Docs with Videos\\Selenium Webdriver with Java (Basics + Advance + Architect)\\Readin and writing Files\\test.txt");
		BufferedReader filereader = new BufferedReader(fr);
		/*System.out.println(filereader.readLine());
		System.out.println(filereader.readLine());
		System.out.println(filereader.readLine());
		System.out.println(filereader.readLine());*/
		
		String i = "";
		while((i=filereader.readLine())!=null) {
			System.out.println(i);
		}
	}

}
