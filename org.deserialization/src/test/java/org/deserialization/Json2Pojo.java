package org.deserialization;

import java.util.ArrayList;

public class Json2Pojo {
		
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPpu() {
		return ppu;
	}

	public void setPpu(float ppu) {
		this.ppu = ppu;
	}

	public Batters getBatters() {
		return batters;
	}

	public void setBatters(Batters batters) {
		this.batters = batters;
	}

	public ArrayList<Topping> getTopping() {
		return topping;
	}

	public void setTopping(ArrayList<Topping> topping) {
		this.topping = topping;
	}

		private String id;
		private String type;
		private String name;
		private float ppu;
		
		private Batters batters;
		
		private ArrayList<Topping> topping;
		
		
	}


