package com.gaurav.java.lamda.predefined.func.interf;

import java.util.Date;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierTest {
public static void main(String[] args) {
	Supplier<Date> supplier = ()->new Date();
	System.out.println(supplier.get());
	
	Supplier<String> supplier2 = ()->
	{
		Random random = new Random();
		return random.nextGaussian()+"";
	};
	System.out.println(supplier2.get());
	
	Supplier<String> otpSupplier = ()->
	{
		String otp="";
		for (int i = 0; i < 6; i++) {
			otp=otp+(int)(Math.random()*10)+"";
		}
		return otp;
	};
	System.out.println(otpSupplier.get());
	
	Supplier<String> advOtpSupplier = ()->
	{
		String otp="";
		Supplier<Integer> supplier10 =()-> (int)((Math.random())*10);
		String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYG@#$";
		Supplier<Character> supplierChar = ()->symbols.charAt((int)Math.random()*29);
		for (int j = 0; j <=8; j++) {
			if(j%2==0)
			{
				otp+=supplier10.get();
			}
			else
			{
				otp+=supplierChar.get();
			}
			
		}
		return otp;
	};
	System.out.println(advOtpSupplier.get());
}

}
