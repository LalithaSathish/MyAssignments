package org.deserialization;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File f=new File("D:\\Greens Technologies\\Selenium_Framework\\org.deserialization\\src\\test\\resources\\data.json");
		FileReader fr=new FileReader(f);
		ObjectMapper om=new ObjectMapper();
		
		Json2Pojo ob=om.readValue(fr, Json2Pojo.class);
		
		System.out.println("ID: "+ob.getId() +"\nName: "+ob.getName()+"\nType: "+ob.getType()+"\nPPU: "+ob.getPpu());
		
		Batters innerBatters=ob.getBatters();
		ArrayList<Batter> innerBatter=innerBatters.getBatter();
		
		System.out.println("******* Batter********");
		for (int i = 0; i < innerBatter.size(); i++) {
			System.out.println(innerBatter.get(i).getId()+" "+innerBatter.get(i).getType());
		}
		
		ArrayList<Topping> innerTopping=ob.getTopping();
		
		System.out.println("******* Topping*******");
		
		for (int i = 0; i < innerTopping.size(); i++) {
			System.out.println(innerTopping.get(i).getId()+" "+innerTopping.get(i).getType());
		}
		
		System.out.println("***********************");
		
	}

}
