package com.gaurav.java.serilization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilizationnTest1 {
public static void main(String[] args) throws Exception{
	FscmVo fscmVo = new FscmVo("Invoice", "210","Invoice payment");
	
	//Serilization
	FileOutputStream fileOutputStream = new FileOutputStream(new File("fscm.ser"));
	ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
	objectOutputStream.writeObject(fscmVo);
	
	//Deserilizatio
	
	FileInputStream fileInputStream = new FileInputStream("fscm.ser");
	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	FscmVo fscmVo2 = (FscmVo) objectInputStream.readObject();
	
	System.out.println(fscmVo2);
	System.out.println(fscmVo==fscmVo2);
	
	
}
}
class FscmVo implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	transient static String productName;
	transient String productId;
	final String productDesc;
	public FscmVo(String productName, String productId, String productDesc) {
		this.productName = productName;
		this.productId = productId;
		this.productDesc=productDesc;
	}
	@Override
	public String toString() {
		return "FscmVo [productName ="+ productName+", productId=" + productId + ", productDesc=" + productDesc + "]";
	}
	
	
}