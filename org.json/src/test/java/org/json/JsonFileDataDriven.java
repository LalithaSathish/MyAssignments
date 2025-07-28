package org.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonFileDataDriven {

	public static void main(String[] args) throws IOException, ParseException {

		File f=new File("D:\\Greens Technologies\\Selenium_Framework\\org.json"
				+ "\\src\\test\\resources\\Data.json");
		FileReader fr=new FileReader(f);
		JSONParser JP=new JSONParser();
		Object parse=JP.parse(fr);
		JSONObject json=(JSONObject) parse;

		System.out.println("*********Top-level pairs*********");
		System.out.println("ID: "+json.get("id") + "\n" +"Type: "+json.get("type") + "\n" 
		+"Name: "+json.get("name") + "\n" +"PPU: "+json.get("ppu"));

		System.out.println("*********JSON batter Array*********");
		JSONObject batters=(JSONObject) json.get("batters");
		JSONArray batterArray=(JSONArray) batters.get("batter");
		for (Object object : batterArray) {
			JSONObject batter=(JSONObject)object;
			System.out.println("ID: "+batter.get("id")+" Type: "+batter.get("type"));
		}

		System.out.println("*********JSON topping Array*********");
		JSONArray toppingsArray=(JSONArray)json.get("topping");
		for (Object object : toppingsArray) {
			JSONObject toppings=(JSONObject)object;
			System.out.println("ID: "+toppings.get("id")+" Type: "+toppings.get("type"));
		}

	}
}
