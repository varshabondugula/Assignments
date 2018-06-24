
package com.assignmentPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ArrayListExample {

	public static void main(String s[]) {
		try {

			FileInputStream fin = new FileInputStream(
					new File("C:\\Users\\vandanavenkatesh\\Desktop\\Customer Detail.xlsx"));

			XSSFWorkbook wb1 = new XSSFWorkbook(fin);
			XSSFSheet spreadsheet = wb1.getSheetAt(0);
			ArrayList<String> a = new ArrayList<String>();

			Iterator<Row> rowIterator = spreadsheet.iterator();
			while (rowIterator.hasNext()) {
				XSSFRow row = (XSSFRow) rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					a.add(cell.getStringCellValue());
				}
			}
			fin.close();
			Iterator<String> itr = a.iterator();

			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
