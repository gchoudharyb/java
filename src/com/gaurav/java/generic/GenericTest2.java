package com.gaurav.java.generic;

import java.io.Serializable;
import java.util.ArrayList;

import javax.lang.model.type.NullType;

public class GenericTest2 {
public static void main(String[] args) {
	Genric<String> genric = new Genric<>("gaurav");
	genric.showClassname();
	Generic1<Integer> generic1 = new Generic1<>(450);
	generic1.showClassname();
	ArrayList<? extends Number> arrayList = new ArrayList<Integer>();
	ArrayList<?> arrayList2 = new ArrayList<?>();
	ArrayList<? super Integer> arrayList3 = new ArrayList<Number>();
}
}
class Genric<T>
{
	T t;
	 Genric(T t)
	 {
		 this.t=t;
	 }
	void showClassname()
	{
		
		System.out.println("Type of object for::"+ t+"is::" + t.getClass().getName());
	}
	void m1(ArrayList<String> arrayList)
	{
		
	}
	void m1(ArrayList<Integer> arrayList)
	{
		
	}
}
class Generic1<T extends Number>
{
	T obj;
	public Generic1(T obj) {
		this.obj = obj;
	}
	void showClassname()
	{
		
		System.out.println("Type of object for::"+ obj+"is::" + obj.getClass().getName());
	}
}

class Generic2<T extends Runnable>
{
	T obj;
	public Generic2(T obj) {
		this.obj = obj;
	}
	void showClassname()
	{
		
		System.out.println("Type of object for::"+ obj+"is::" + obj.getClass().getName());
	}
}

class Generic3<T extends Number & Runnable >
{
	T obj;
	public Generic3(T obj) {
		this.obj = obj;
	}
	void showClassname()
	{
		
		System.out.println("Type of object for::"+ obj+"is::" + obj.getClass().getName());
	}
}

class Generic4<T extends Comparable<T> & Runnable >
{
	T obj;
	public Generic4(T obj) {
		this.obj = obj;
	}
	void showClassname()
	{
		
		System.out.println("Type of object for::"+ obj+"is::" + obj.getClass().getName());
	}
}

class Generic5<T extends Comparable<T> & Runnable & Serializable>
{
	T obj;
	public Generic5(T obj) {
		this.obj = obj;
	}
	void showClassname()
	{
		
		System.out.println("Type of object for::"+ obj+"is::" + obj.getClass().getName());
	}
}

class Generic6<T,X>
{
	T obj;
	public Generic6(T obj) {
		this.obj = obj;
	}
	void showClassname()
	{
		
		System.out.println("Type of object for::"+ obj+"is::" + obj.getClass().getName());
	}
}


class Generic7<T,X,Z>
{
	T obj;
	public Generic7(T obj) {
		this.obj = obj;
	}
	void showClassname()
	{
		
		System.out.println("Type of object for::"+ obj+"is::" + obj.getClass().getName());
	}
}