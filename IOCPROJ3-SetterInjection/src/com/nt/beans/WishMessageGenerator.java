package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator 
{
	private Date date;
	
	static
	{
		System.out.println("WishMessageGenerator-static_block");
	}
	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator-0param cons");
	}
	public void setDate(Date date)
	{
		System.out.println("WishMessageGenerator.setDate()");
		this.date=date;
	}
	public String wishMessage(String user)
	{
		System.out.println("WishMessageGenerator.generateWishMessage()");

		int hours=date.getHours();
		if(hours<12)
			return "good morning "+user;
		else if(hours<16)
			return "good afternoon "+user;
		else if(hours<20)
			return "good evening "+user;
		else 
			return "good night "+user;
	}


}









