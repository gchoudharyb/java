package com.gaurav.java.serilization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationTes  {
public static void main(String[] args)  throws Exception{
	ExternizableDemo externizableDemo = new ExternizableDemo("gaurav", "gg", "123");
	FileOutputStream fileOutputStream = new  FileOutputStream("exter.ser");
	ObjectOutputStream 	objectOutputStream = new ObjectOutputStream(fileOutputStream);
	objectOutputStream.writeObject(externizableDemo);
	
	FileInputStream fileInputStream = new FileInputStream("exter.ser");
	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	ExternizableDemo externizableDemo2 = (ExternizableDemo) objectInputStream.readObject();
	
	System.out.println(externizableDemo2);
}
}
class ExternizableDemo implements Externalizable
{
String name;
String pass;
String roll;
public ExternizableDemo() {
	// Mandatory for externizable call
	System.out.println("In default constructor");
}
	public ExternizableDemo(String name, String pass, String roll) {
	super();
	this.name = name;
	this.pass = pass;
	this.roll = roll;
}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		System.out.println("In readExternal method");
		String name = (String) in.readObject();
		this.name = name;
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("In writeExternal method");
		out.writeObject(name);
		
	}

	@Override
	public String toString() {
		return "ExternizableDemo [name=" + name + ", pass=" + pass + ", roll=" + roll + "]";
	}
	
	
}