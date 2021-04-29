package com.gaurav.java.collection;

import java.util.HashMap;
import java.util.Map;

public class EqualAndHashCodeContract {
	public static void main(String[] args) {
		Map<Transaction, String> map = new HashMap<Transaction, String>();
		Transaction transaction1 = new Transaction(1, "Payments");
		Transaction transaction2 = new Transaction(2, "FSCM");
		Transaction transaction3 = new Transaction(3, "LM");
		Transaction transaction5 = new Transaction(1, "Payments");
		map.put(transaction1, "ACB");
		map.put(transaction2, "RBL");
		map.put(transaction3, "BRI");
		map.put(transaction5, "DD");
		System.out.println(map);
		System.out.println(map.get(new Transaction(1, "Payments")));
		
	}
}

class Transaction {
	private Integer txnId;
	private String txnType;

	public Transaction(Integer txnId, String txnType) {
		super();
		this.txnId = txnId;
		this.txnType = txnType;
	}

	public Integer getTxnId() {
		return txnId;
	}

	public void setTxnId(Integer txnId) {
		this.txnId = txnId;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	@Override
	public String toString() {
		return "Transaction [txnId=" + txnId + ", txnType=" + txnType + "]";
	}

@Override
	public boolean equals(Object obj) {
		Transaction transaction = (Transaction) obj;
		if (this.txnType == transaction.getTxnType()) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return txnId*10000;
	}
}