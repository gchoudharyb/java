package com.gaurav.java.stream;


public class Payment {
	private long paymentId;
	private String amount;
	private PaymentType paymentType;
	private Benificiary benificiary;
public Payment() {
	// TODO Auto-generated constructor stub
}
	public Payment(long paymentId, String amount, PaymentType paymentType, Benificiary benificiary) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
		this.paymentType = paymentType;
		this.benificiary = benificiary;
	}

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public PaymentType getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	public Benificiary getBenificiary() {
		return benificiary;
	}

	public void setBenificiary(Benificiary benificiary) {
		this.benificiary = benificiary;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", amount=" + amount + ", paymentType=" + paymentType
				+ ", benificiary=" + benificiary + "]";
	}

}

enum PaymentType {
	TEST, IFT("IFT", "Internal Fund Transfer"), EFT("EFT", "External Fund Transfer");

	private PaymentType() {

	}

	private PaymentType(String paymentTypeCode, String paymentDesc) {
		this.paymentTypeCode = paymentTypeCode;
		this.paymentDesc = paymentDesc;
	}

	private String paymentTypeCode;
	private String paymentDesc;

	public String getPaymentTypeCode() {
		return paymentTypeCode;
	}

	public void setPaymentTypeCode(String paymentTypeCode) {
		this.paymentTypeCode = paymentTypeCode;
	}

	public String getPaymentDesc() {
		return paymentDesc;
	}

	public void setPaymentDesc(String paymentDesc) {
		this.paymentDesc = paymentDesc;
	}

	
}
 class Benificiary {
	private String amount;
	private String accountNumber;

	public Benificiary(String amount, String accountNumber) {
		super();
		this.amount = amount;
		this.accountNumber = accountNumber;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		return "Benificiary [amount=" + amount + ", accountNumber=" + accountNumber + "]";
	}

}