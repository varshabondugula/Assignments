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


		 
	 public static void main(String a[]) throws IOException{
	     
	        TreeSet<Person> set = new TreeSet<Person>(new MyNameComp());
	        FileInputStream fis = new FileInputStream(new File("C:\\Users\\vandanavenkatesh\\Desktop\\person.xlsx"));
	    	XSSFWorkbook workbook1 = new XSSFWorkbook(fis);
	    	XSSFSheet spreadsheet1 = workbook1.getSheetAt(0);
	    	Row row;
	    	row = spreadsheet1.getRow(1);
	    	Person p1 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p1);
	    	row = spreadsheet1.getRow(2);
	    	Person p2 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p2);
	    	row = spreadsheet1.getRow(3);
	    	Person p3 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p3);
	    	row = spreadsheet1.getRow(4);
	    	Person p4 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p4);
	    	row = spreadsheet1.getRow(5);
	    	Person p5 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p5); 
	    	row = spreadsheet1.getRow(6);
	    	Person p6 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p6); 
	    	row = spreadsheet1.getRow(7);
	    	Person p7 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p7); 
	    	row = spreadsheet1.getRow(8);
	    	Person p8 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p8); 
	    	row = spreadsheet1.getRow(9);
	    	Person p9 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p9); 
	    	row = spreadsheet1.getRow(10);
	    	Person p10 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p10); 
	    	row = spreadsheet1.getRow(11);
	    	Person p11 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p11); 
	    	row = spreadsheet1.getRow(12);
	    	Person p12 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p12); 
	    	row = spreadsheet1.getRow(13);
	    	Person p13 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p13); 
	    	row = spreadsheet1.getRow(14);
	    	Person p14 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p14); 
	    	row = spreadsheet1.getRow(15);
	    	Person p15 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p15); 
	    	row = spreadsheet1.getRow(16);
	    	Person p16 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p16); 
	    	row = spreadsheet1.getRow(17);
	    	Person p17 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p17); 
	    	row = spreadsheet1.getRow(18);
	    	Person p18 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p18); 
	    	row = spreadsheet1.getRow(19);
	    	Person p19 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p19); 
	    	row = spreadsheet1.getRow(20);
	    	Person p20 = new Person(row.getCell(0).toString(), row.getCell(1).toString(), row.getCell(2).toString());
	    	set.add(p20); 
	        for(Person p: set){
	            System.out.println(p);
	        }
	    }
	}
	class MyNameComp implements Comparator<Person>{
	    public int compare(Person p1, Person p2) {
	        return p1.getName().compareTo(p2.getName());
	    }
	}   
	class Person{
		private String id; 
	    private String name;
	    private String description;
	     
	    public Person(String id, String name,String description){
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
	    public String toString(){
	        return "Id:"+this.id+" name: "+this.name+" description: "+this.description;
	    }
	    }
