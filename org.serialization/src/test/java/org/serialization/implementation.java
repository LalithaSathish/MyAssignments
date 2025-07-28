package org.serialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class implementation {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		File f=new File("D:\\Greens Technologies\\Selenium_Framework\\org.serialization\\src\\test\\resources\\DataWrite.json");
		ObjectMapper om=new ObjectMapper();	
	
		ArrayList<Batter> batter = new ArrayList<>();
			
		batter.add(new Batter("1001", "Regular"));
		batter.add(new Batter("1002", "Chocolate"));
		batter.add(new Batter("1003", "Chocolate"));
		batter.add(new Batter("1004", "Chocolate"));
		
		Batters batters=new Batters(batter);
		
		ArrayList<Topping> topping = new ArrayList<>();

		topping.add(new Topping("5001", "None"));
		topping.add(new Topping("5002", "Glazed"));
		topping.add(new Topping("5005", "Sugar"));
		topping.add(new Topping("5007", "Powdered Sugar"));
		topping.add(new Topping("5006", "Chocolate with Sprinkles"));
		topping.add(new Topping("5003", "Chocolate"));
		topping.add(new Topping("5004", "Maple"));
		
		Root root=new Root("0001", "donut", "cake", 0.55, batters, topping);
		om.writeValue(f, root);
		
	}

}
