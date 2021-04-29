package com.gaurav.java.io;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
public static void main(String[] args) throws IOException {
	File file = new File("gaurav");
	file.mkdir();
	File file2 = new File("gaurav","gaurav.txt");
	file2.createNewFile();
	System.out.println(file2.exists());
	
	FileWriter fileWriter = new FileWriter(file2);
	fileWriter.append("sdfsdfsdfsdfsdf");
	fileWriter.flush();
	
	FileWriter fileWriter1 = new FileWriter("sss.txt");
	
	fileWriter1.append("gaurav");
	fileWriter1.flush();
	fileWriter.close();
	
	FileReader fileReader = new FileReader(file2);
	int i = fileReader.read();
	System.out.println(i);
	while (i!=-1) {
		System.out.println((char)i);
		i=fileReader.read();
		
	}
}
}
