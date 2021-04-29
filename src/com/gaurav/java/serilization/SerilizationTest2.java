package com.gaurav.java.serilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilizationTest2 {
public static void main(String[] args) throws Exception {
	Dog dog = new Dog("dog1", "12");
	Cat cat = new Cat("Cat1","ss");
	FileOutputStream fileOutputStream = new FileOutputStream(new File("dog_cat.ser"));
	ObjectOutputStream objectInputStream = new ObjectOutputStream(fileOutputStream);
	objectInputStream.writeObject(cat);
	objectInputStream.writeObject(dog);
	
	FileInputStream fileInputStream = new FileInputStream("dog_cat.ser");
	ObjectInputStream inputStream=new ObjectInputStream(fileInputStream);
	Object o=null;
	while (null!=inputStream) {
		o=inputStream.readObject();
		if(o instanceof Cat)
		{
			System.out.println((Cat) o);
		}
		else if(o instanceof Dog)
		{
			System.out.println((Dog) o);
		}
		
	}
	
	fileInputStream.close();
	fileOutputStream.close();
	objectInputStream.close();
	inputStream.close();
}
}
class Dog implements Serializable
{
	String name;
	String id;
	public Dog(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", id=" + id + "]";
	}
	
}
class Cat implements Serializable
{
	String name;
	String id;
	public Cat(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", id=" + id + "]";
	}
	
}