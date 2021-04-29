package com.gaurav.oops;

public class CloneREsrt {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address("1", "Noida");
		CloneTest cloneTest1 = new CloneTest(1, 2, "Gaurav",address);
		System.out.println(cloneTest1);
		CloneTest cloneTest2 = (CloneTest) cloneTest1.clone();
		cloneTest1.setStr("Kumar");
		address.setAddress("Delhi");
		System.out.println(cloneTest2);
	}
}

class CloneTest implements Cloneable {
	private int x;
	private Integer y;
	private String str;
	private Address address;

	public CloneTest(int x, Integer y, String str, Address address) {
		super();
		this.x = x;
		this.y = y;
		this.str = str;
		this.address = address;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public Integer getY() {
		return y;
	}

	public void setY(Integer y) {
		this.y = y;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CloneTest [x=" + x + ", y=" + y + ", str=" + str + ", address=" + address + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Address address = new Address(this.getAddress().getAddressId(),this.getAddress().getAddress());
		CloneTest cloneTest = new CloneTest(this.getX(), this.getY(), this.getStr(), address);
		return cloneTest;
	}

	
}