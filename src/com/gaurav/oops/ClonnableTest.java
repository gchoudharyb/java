package com.gaurav.oops;

public class ClonnableTest{
public static void main(String[] args) throws CloneNotSupportedException{
	Address address = new Address("10", "delhi");
	Employee employee = new Employee("1", address);
	
	Employee employee2 = (Employee) employee.clone();
	employee .getAddress().setAddress("Noida");
	System.out.println(employee2);
	System.out.println(employee);
	
}
}
class Employee implements Cloneable
{
	private String employeeId;
	private Address address;
	public Employee(String employeeId, Address address) {
		this.employeeId = employeeId;
		this.address = address;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", address=" + address + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		/*Address address = new Address(this.getAddress().getAddressId(), this.getAddress().getAddress());
		Employee employee = new Employee(this.employeeId,address);
		return employee;*/
	}
	
}
class Address
{
	public String addressId;
	public String address;
	
	public Address(String addressId, String address) {
		this.addressId = addressId;
		this.address = address;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", address=" + address + "]";
	}
	
}