package com.cg.hrb.bean;

public class CustomerDetails {
	
	private String customerName;
	private String email;
	private String customerAddress;
	private long mobileNumber;
	private String roomType;
	private int roomNumber;
	private String bookingStatus;
	private int customerId;
	
	
	public void customer(String customerName,String email, String customerAddress, long mobileNumber,String roomType,int roomNumber,String bookingStatus,int customerId) {
		this.customerName=customerName;
		this.email=email;
		this.customerAddress=customerAddress;
		this.mobileNumber=mobileNumber;
		this.roomType=roomType;
		this.roomNumber=roomNumber;
		this.bookingStatus=bookingStatus;
		this.customerId=customerId;
		
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	public CustomerDetails(String string, String string2) {
		
	}
	public CustomerDetails() {
		// TODO Auto-generated constructor stub
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNo) {
		this.mobileNumber = mobileNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getBookingStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
