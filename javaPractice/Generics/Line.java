package edu.umass;
import java.util.*;

public class Line implements Mappable{

	private double[][] locs;

	public Line(String... points){

		this.locs = new double[points.length][2];
		
		for(int i =0;i<points.length;i++){
					
			this.locs[i] = Mappable.stringToLatLon(points[i]);	
		}
	}

	public String helper(){

		String allPoints ="";
		for(int i =0;i<locs.length;i++){
			
			allPoints+= ("[" +Arrays.toString(locs[i]) +"],") ;
		}

		return allPoints;
	}

	@Override
	public void render(){

		System.out.println("Render" +this +"((" +helper() +"))");
	}
}
