package com.cg.hrb.service;

import com.cg.hrb.bean.CustomerDetails;
import com.cg.hrb.bean1.RoomDetails;

public interface IBookingService {
	
	int bookHotel(CustomerDetails id);
	 RoomDetails Room(RoomDetails no);
	 
}
