package com.assignmentPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	
	public static void main(String s[]) throws IOException
	{
		FileWriter fout=new FileWriter("C:\\Users\\vandanavenkatesh\\Desktop\\BufferWriterEX.txt");
		BufferedWriter bw=new BufferedWriter(fout);
		bw.write("hello this is a example program for BufferWriter ");
		bw.close();
		System.out.println("program excecuted!");
	}
}
