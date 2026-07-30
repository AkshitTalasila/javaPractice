package edu.umass;

public class Park extends Point{

	private String name;
	public Park(String name, String locs){
		super(locs);
		this.name = name;		
	}

	public Park(String name, double lat, double lon){
		
		super(lat,lon);
		this.name = name;
	}
}
