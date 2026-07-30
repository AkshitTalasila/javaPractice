package edu.umass;

public class River extends Line{

	private String name;
	
	public River(String name,String... points){

		super(points);
		this.name = name;
	}
}
