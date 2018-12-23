package com.myclassarray;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class MyClass implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1009338619095922514L;
	private int id;
	private String name;
	private double salary;
	public MyClass(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public MyClass() {
		// TODO Auto-generated constructor stub
	}
	public void main(ArrayList<MyClass> al) throws FileNotFoundException, IOException {
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\user123\\Desktop\\java\\jaf.txt"));
	oos.writeObject(al);
	oos.close();
	}
	
	public ArrayList<MyClass> read() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\user123\\Desktop\\java\\jaf.txt"));
		ArrayList<MyClass> mc = (ArrayList<MyClass>) ois.readObject();
		ois.close();
		return mc;
		
	}
	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + ", salary=" + salary
				+ "]";
	}
	
}
