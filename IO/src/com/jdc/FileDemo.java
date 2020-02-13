package com.jdc;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		System.out.println(File.pathSeparator);
		System.out.println(File.separator);
		
		File file = new File("Sample.txt");
		file.createNewFile();
		System.out.println(file.exists());
		
		File dir = new File("Photo");
		dir.mkdir();
		
		file.renameTo(new File("MyReport.txt"));
		System.out.println("Name :" + file.getName());
		
	}
}
