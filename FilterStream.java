package com.assignmentPrograms;

import java.io.*;

public class FilterStream  {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\vandanavenkatesh\\Desktop\\file.txt");
		FileOutputStream fout = new FileOutputStream(file);
		FilterOutputStream filter = new FilterOutputStream(fout);
		byte[] b = "Hey, Hi there!".getBytes();
		filter.write(b);
		fout.close();
		System.out.println("Done");

		File file1 = new File("C:\\Users\\vandanavenkatesh\\Desktop\\file.txt");
		FileInputStream fin = new FileInputStream(file1);
		FilterInputStream filter1 = new BufferedInputStream(fin);
		int i = 0;
		while ((i = filter1.read()) != -1) {
			System.out.print((char) i);
		}
		fin.close();
		filter1.close();
	}
}
