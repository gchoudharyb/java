package com.gaurav.java.enume;

public class PaymentTypeEnumTest {
public static void main(String[] args) {
	PaymentTypeEnum [] paymentTypeEnum = PaymentTypeEnum.values();
	for (PaymentTypeEnum paymentTypeEnum2 : paymentTypeEnum) {
		System.out.println(paymentTypeEnum2.getProductCode()+"::"+paymentTypeEnum2.getProductDesc()+"::"+paymentTypeEnum2.getProductType());
	}
}
}
