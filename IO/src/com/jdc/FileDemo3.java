package com.jdc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileDemo3 {

	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("MyReport.txt");
			pw.println(100);
			pw.println("How Are u today");
			pw.println("I'm fine");
			pw.write(100);
			pw.flush();
			
			Scanner sc = new Scanner(new File("MyReport.txt"));
//			String line = sc.nextLine();
//			System.out.println(line);
			
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			pw.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
