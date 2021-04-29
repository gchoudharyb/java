package com.gaurav.java.enume;

enum MyPaymentTypeEnum {
	IFT("IFT", "Internal Fund Transfer"),EFT("EFT", "External Fund Transfer");;

	MyPaymentTypeEnum() {
		System.out.println("Constructor Called2");
	}

	MyPaymentTypeEnum(String productCode, String productDesc) {
		System.out.println("Constructor Called1");
		this.productCode = productCode;
		this.productDesc = productDesc;
	}

	private String productCode;
	private String productDesc;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public static void main(String[] args) {
		
		MyPaymentTypeEnum myPaymentTypeEnum = MyPaymentTypeEnum.IFT;
		enumSwitch(myPaymentTypeEnum);;
		
		
	}
	public static  void enumSwitch(MyPaymentTypeEnum myPaymentTypeEnum) 
	{
		switch (myPaymentTypeEnum) {
		case IFT :
			System.out.println("In IFT");
			break;
		case EFT:
			System.out.println("In EFT");
		default:
			System.out.println("In DEFAULT");
			break;
		}
	}
}