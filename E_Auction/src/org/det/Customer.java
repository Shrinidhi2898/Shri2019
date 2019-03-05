package org.det;

public class Customer {
	
	 private int UserId;
	 private String PdtName,ShortDesc,DetDesc,Category;
	 private int Price;
	 private String Bid_End_date,Status;
	 Customer()
	 {
		 
	 }
	public Customer(int userId, String pdtName, String shortDesc,
			String detDesc, String category, int price, String bid_End_date,
			String status) {
		super();
		UserId = userId;
		PdtName = pdtName;
		ShortDesc = shortDesc;
		DetDesc = detDesc;
		Category = category;
		Price = price;
		Bid_End_date = bid_End_date;
		Status = status;
	}
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getPdtName() {
		return PdtName;
	}
	public void setPdtName(String pdtName) {
		PdtName = pdtName;
	}
	public String getShortDesc() {
		return ShortDesc;
	}
	public void setShortDesc(String shortDesc) {
		ShortDesc = shortDesc;
	}
	public String getDetDesc() {
		return DetDesc;
	}
	public void setDetDesc(String detDesc) {
		DetDesc = detDesc;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getBid_End_date() {
		return Bid_End_date;
	}
	public void setBid_End_date(String bid_End_date) {
		Bid_End_date = bid_End_date;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	
	
	
	 
	 
	 
	 
	
	 
	 
	
	 
	 

}
