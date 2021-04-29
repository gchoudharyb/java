package com.gaurav.java.stream;

public class Address {
private Integer addressId;
private String address1;
private String adddress2;



public Address(Integer addressId, String address1, String adddress2) {
	super();
	this.addressId = addressId;
	this.address1 = address1;
	this.adddress2 = adddress2;
}
public Integer getAddressId() {
	return addressId;
}
public void setAddressId(Integer addressId) {
	this.addressId = addressId;
}
public String getAddress1() {
	return address1;
}
public void setAddress1(String address1) {
	this.address1 = address1;
}
public String getAdddress2() {
	return adddress2;
}
public void setAdddress2(String adddress2) {
	this.adddress2 = adddress2;
}
@Override
public String toString() {
	return "Address [addressId=" + addressId + ", address1=" + address1 + ", adddress2=" + adddress2 + "]";
}

}
