package com.cg.hrb.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.cg.hrb.bean.CustomerDetails;
import com.cg.hrb.bean1.RoomDetails;
import com.cg.hrb.menu.Main;
import com.cg.hrb.utility.RoomNumberException;
import com.cg.hrb.utility.RoomStatusException;
import com.cg.hrb.utility.RoomTypeException;


public class BookingdaoImpl implements IBookingDao{
	
	
	Map<Integer,CustomerDetails> customer=new HashMap<>();
	Map<Integer,RoomDetails> room;
	
	public BookingdaoImpl(){
		
		room = new HashMap<>();
		
		room.put(101,new RoomDetails("AC_SINGLE","NOT BOOKED"));
		room.put(102,new RoomDetails("AC_SINGLE","NOT BOOKED"));
		room.put(103,new RoomDetails("AC_DOUBLE","NOT BOOKED"));
		room.put(104,new RoomDetails("NONAC_SINGLE","NOT BOOKED"));
		room.put(105,new RoomDetails("NONAC_SINGLE","NOT BOOKED"));
		room.put(106,new RoomDetails("NONAC_DOUBLE","NOT BOOKED"));
		
		
	}

	public int bookHotel(CustomerDetails id) {
		CustomerDetails id_no =id;
		RoomDetails rd= room.get(id.getRoomNumber());
		int a;
		int count=1000;
			if(room.containsKey(id.getRoomNumber()))
			{
				if(rd.getRoomType().equals(id.getRoomType()))
				{
					if(rd.getStatus().equals("NOT BOOKED"))
					{
						a=count;
						customer.put(count,CustomerDetails(id.getCustomerName()+id.getCustomerAddress()+id.getEmail()+id.getRoomNumber()+id.getMobileNumber()+id.getRoomType()+id.getBookingStatus()+id.getCustomerId()));
						count++;
					}
					else
					{
					throw new RoomNumberException();
				
				else 
				{
					
				throw new RoomTypeException();
			else
			{
			throw new RoomStatusException();		
		    }
		   }
		}
	}
	
	
	
	
			
	
		
	return a;	
}

	public RoomDetails Room(RoomDetails no) {
		RoomDetails room_no=no;
		customer = new HashMap<>();
		return room_no;
	}


}
