package edu.umass;
import java.util.*;

public class Point implements Mappable{

	private double[] loc;

	public Point(String location){

		this.loc = Mappable.stringToLatLon(location);
	}

	public Point(double lat, double lon){
		
		this.loc = new double[2];
		this.loc[0] = lat;
		this.loc[1] = lon;
	}

	private String helper(){

		return (Arrays.toString(this.loc));
	}

	@Override
	public void render(){

		System.out.println("Render: " +this +"((" +helper() +"))" );
	}
}
