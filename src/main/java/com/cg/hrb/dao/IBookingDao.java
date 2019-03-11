package com.cg.hrb.dao;

import com.cg.hrb.bean.CustomerDetails;
import com.cg.hrb.bean1.RoomDetails;

public interface IBookingDao {
	
	 int bookHotel(CustomerDetails id);
	 RoomDetails Room(RoomDetails no);
	

}
