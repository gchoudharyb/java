package com.gaurav.java.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class SerializeInheritanceTest {

public static void main(String[] args) throws Exception {
	Child12 child = new Child12(10,100);
	FileOutputStream fileOutputStream = new FileOutputStream("inh_ser.ser");
	ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	objectOutputStream.writeObject(child);
	
	FileInputStream fileInputStream = new FileInputStream("inh_ser.ser");
	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	Child12 child12 = (Child12) objectInputStream.readObject();
	System.out.println(child.i);
	System.out.println(child.j);
}

}
class Parent
{
	int i;

	public Parent(int i) {
		super();
		this.i = i;
	}
	public Parent() {
		// Mandatory default constructor to de=serialize child Object
	}
}
class Child12 extends Parent implements Serializable
{
	int j;

	public Child12(int j,int i) {
		super(i);
		this.j = j;
	}
	
}