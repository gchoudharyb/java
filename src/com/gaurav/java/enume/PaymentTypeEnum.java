package com.gaurav.java.enume;

public enum PaymentTypeEnum {
IFT("Internal","IFT","Internal Fund Transfer"),EFT("External","EFT","external Fund Transfer"),
RTGS("External","RTGS","External Fund Transfer"),CITAD("External","RTGS","External Fund Transfer")
{
	public void m1()
	{
		System.out.println("ACB");
	}
};
	private String productType;
	private String productCode;
	private String productDesc;
	private PaymentTypeEnum(String productType,String productCode,String productDesc) {
		System.out.println("Constructor called");
		this.productCode=productCode;
		this.productDesc=productDesc;
		this.productType=productType;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
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
	
}
