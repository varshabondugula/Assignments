package com.assignmentPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TreeSetEample1 {

	public static void main(String a[]) throws IOException {

		TreeSet<Person> set = new TreeSet<Person>(new MyNameComp());
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\vandanavenkatesh\\Desktop\\person.xlsx"));
		XSSFWorkbook workbook1 = new XSSFWorkbook(fis);
		XSSFSheet spreadsheet1 = workbook1.getSheetAt(0);
		Row row;

		for (int i = 0; i < spreadsheet1.getPhysicalNumberOfRows(); i++) {
			row = spreadsheet1.getRow(i);
			Person p = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
			set.add(p);
		}
		for (Person p : set) {
			System.out.println(p);
		}
	}
}

class MyNameComp implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}
}

class Person {
	private String id;
	private String name;
	private String description;

	public Person(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getdescription() {
		return description;
	}

	public void setdescription(String description) {
		this.description = description;
	}

	public String toString() {
		return "Id:" + this.id + " name: " + this.name + " description: " + this.description;
	}
}
