package org.serialization;

import java.util.List;

public class Topping {
	
	private String id;
	private String type;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Topping(String id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	public Topping(List<Topping> toppingList) {
		// TODO Auto-generated constructor stub
	}
	

}
