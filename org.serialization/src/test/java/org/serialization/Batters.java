package org.serialization;

import java.util.ArrayList;
import java.util.List;

public class Batters {

	private ArrayList<Batter> batter;

	public ArrayList<Batter> getBatter() {
		return batter;
	}

	public void setBatter(ArrayList<Batter> batter) {
		this.batter = batter;
	}

	public Batters(List<Batter> batterList) {
		super();
		this.batter = (ArrayList<Batter>) batterList;
	}
	
}
