package com.gaurav.java.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomizedSerilizationTest {
	public static void main(String[] args) throws Exception {
User user = new User("gaurav", "password");
FileOutputStream fileOutputStream = new FileOutputStream("custom_ser.ser");
ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
objectOutputStream.writeObject(user);

FileInputStream fileInputStream = new FileInputStream("custom_ser.ser");
ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
User  user2 = (User) objectInputStream.readObject();
System.out.println(user2.userName);
System.out.println(user2.password);
	}
}

class User implements Serializable
{
	String userName;
	transient String password;
	public User(String userName,String password) {
		this.userName=userName;
		this.password=password;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
		System.out.println("In custom writeObject method");
		objectOutputStream.defaultWriteObject();
		String encrypPwd = "gaurav_123";
		objectOutputStream.writeObject(encrypPwd);

	}
	private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
		System.out.println("In custom readObject method");
		objectInputStream.defaultReadObject();
		String encrypPwd1 = (String) objectInputStream.readObject();
		this.password=encrypPwd1;

	}
}