package com.cg.hrb.menu;

import java.util.Scanner;

import com.cg.hrb.bean.CustomerDetails;
import com.cg.hrb.bean1.RoomDetails;
import com.cg.hrb.service.BookingServiceImpl;
import com.cg.hrb.service.IBookingService;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice");
		System.out.println("1. BookRoom");
		System.out.println("2. View Booking Status");
		System.out.println("3. Exit");
		
		int ch = sc.nextInt();

		CustomerDetails cd = new CustomerDetails(); 
		RoomDetails rd = new RoomDetails(null,null);
		IBookingService booking = new BookingServiceImpl();
		while(true) {
		switch (ch) {
		case 1:
			
			System.out.println("Enter Customer name");
			String customerName=sc.next();
			cd.setCustomerName(customerName);
			
			System.out.println("Enter Email_Id");
			String email=sc.next();
			cd.setEmail(email);
			
			System.out.println("Enter customer address");
			String customerAdd=sc.next();
			cd.setCustomerAddress(customerAdd);
			
			System.out.println("Enter mobile number");
			long mobileNo=sc.nextLong();
			cd.setMobileNumber(mobileNo);
			
			System.out.println("enter room number");
			int roomNo=sc.nextInt();
			cd.setRoomNumber(roomNo);
			
			System.out.println("Enter room type");
			String roomType=sc.next();			
			cd.setRoomType(roomType);
			
			cd=booking.bookHotel();
			
			System.out.println("Your rooom has been sucessfully booked, your customer id id:"+cd.getCustomerId());
			System.out.println("Invalid room type or room number");
		
			break;
		case 2:
			System.out.println("enter customer_id");
			int x=sc.nextInt();
			booking .Room(rd);
			System.out.println(cd.getCustomerName()+" "+cd.getBookingStatus()+" "+cd.getRoomNumber()+" "+cd.getRoomType());
			
			break;
		case 3:
			System.out.println("Thank you");
			break;

		default:
			
			System.out.println("Enter valid input");
			break;
		}
		}
		

	

	}
}
