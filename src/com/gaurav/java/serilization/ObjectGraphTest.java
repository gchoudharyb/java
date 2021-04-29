package com.gaurav.java.serilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectGraphTest {
public static void main(String[] args) throws Exception{
	Dog12 dog12 = new Dog12();
	FileOutputStream fileOutputStream = new FileOutputStream(new File("object_graph.ser"));
	ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	objectOutputStream.writeObject(dog12);
	
	FileInputStream fileInputStream = new FileInputStream("object_graph.ser");
	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	Dog12 dog122 = (Dog12) objectInputStream.readObject();
	System.out.println(dog122.cat1.rat.size);
}
}
class Dog12 implements Serializable
{
	Cat1 cat1 = new Cat1();
}
class Cat1 implements Serializable
{
	Rat rat = new Rat();
}
class Rat implements Serializable
{
	int size=200;
}