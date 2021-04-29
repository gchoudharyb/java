package com.gaurav.java.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupingByTest {
	public static void main(String[] args) {
		
		Benificiary benificiary10 = new Benificiary("20000", "123565584");
		
		Benificiary benificiary2 = new Benificiary("20000", "123565584");
		Benificiary benificiary3 = new Benificiary("1000", "1235265584");
		Benificiary benificiary4 = new Benificiary("40000", "1235265584");
		Benificiary benificiary5 = new Benificiary("9000", "9899557036");
		Benificiary benificiary6 = new Benificiary("100", "9899557036");
		Benificiary benificiary7 = new Benificiary("10002", "9990153610");
		Payment payment1 = new Payment(1, "10000", PaymentType.EFT,benificiary10);
		Payment payment2 = new Payment(2, "20000", PaymentType.TEST,benificiary2);
		Payment payment3 = new Payment(3, "10000", PaymentType.EFT,benificiary10);
		Payment payment4 = new Payment(4, "1000", PaymentType.IFT,benificiary3);
		Payment payment5 = new Payment(5, "40000", PaymentType.IFT,benificiary4);
		Payment payment6 = new Payment(6, "9000", PaymentType.EFT,benificiary5);
		Payment payment7 = new Payment(7, "10000", PaymentType.TEST,benificiary10);
		Payment payment8 = new Payment(8, "100", PaymentType.IFT,benificiary6);
		Payment payment9 = new Payment(9, "10002", PaymentType.IFT,benificiary7);
		Payment payment10 = new Payment(10, "100", PaymentType.EFT,benificiary6);
		
		List<Payment> payments = new ArrayList<Payment>();
		payments.add(payment1);
		payments.add(payment2);
		payments.add(payment3);
		payments.add(payment4);
		payments.add(payment5);
		payments.add(payment6);
		payments.add(payment7);
		payments.add(payment8);
		payments.add(payment9);
		payments.add(payment10);
		
		Map<String,List<Payment>> map  = payments.stream().collect(Collectors.groupingBy(Payment::getAmount));
		System.out.println(map);
		
		Map<PaymentType,List<Payment>> mapE  = payments.stream().collect(Collectors.groupingBy(Payment::getPaymentType));
		System.out.println(mapE);
		Map<String,List<Payment>> mapB  = payments.stream().collect(Collectors.groupingBy((p1)->p1.getBenificiary().getAccountNumber()));
		System.out.println(mapB);
		
		mapB.forEach((m1,m2)->System.out.println(m1+"::"+m2.size()));
		
		Map<PaymentType, Map<String,List<Payment>>> mapE1  = payments.stream().collect(Collectors.groupingBy(Payment::getPaymentType,Collectors.groupingBy((p1)->p1.getBenificiary().getAccountNumber())));
		
		
		System.out.println(mapE1);
		
		Map<PaymentType, Map<String,List<Payment>>> mapE2  = payments.stream().collect(Collectors.groupingBy(Payment::getPaymentType,LinkedHashMap::new,Collectors.groupingBy((p1)->p1.getBenificiary().getAccountNumber())));
		
		
		System.out.println(mapE2);
		
Map<PaymentType, Optional<Payment>> mapE3  = payments.stream().collect(Collectors.groupingBy(Payment::getPaymentType,Collectors.maxBy(Comparator.comparing(Payment::getAmount))));
		System.out.println("______________________________________________________________________________");
		
		mapE3.forEach((key,value)->System.out.println(key+"::"+value.get()));
	}
}
