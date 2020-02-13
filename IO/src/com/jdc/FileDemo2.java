package com.jdc;

import java.io.File;

public class FileDemo2 {

	private static int dirCount = 0;
	private static int fileCount = 0;

	public static void main(String[] args) {
		readFile(new File("C:\\Intel\\Logs"));
		System.out.println("Dir Count : " + dirCount);
		System.out.println("File Count :" + fileCount);
		
	}

	private static void readFile(File file) {
		for(File f : file.listFiles()) {
			if(f.isDirectory()) {
				dirCount++;
				readFile(f);
			}else {
				fileCount++;
			}
		}
		
	}
}
