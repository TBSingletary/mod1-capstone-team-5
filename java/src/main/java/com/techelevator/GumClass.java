package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GumClass extends VendingMachineItem{
	
	public GumClass(String code, String name, double price, String type)
	{
		super(code, name, price, type);
		
	}
	@Override
	public void setSound()
	{
		sound = "Chew Chew, Yum!";
	}	
}
