package com.gaurav.java.collection;

public class HashMapKey {
	int id;
	int name;

	public HashMapKey(int id, int name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		System.out.println("hashCode");
		if(id<=12)
		{
			return 1;
		}
		else
		{
			return 2;
		}
		
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashMapKey other = (HashMapKey) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HashMapKey [id=" + id + ", name=" + name + "]";
	}

}
