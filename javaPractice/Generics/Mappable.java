package edu.umass;

public interface Mappable{

	void render();

	static double[] stringToLatLon(String location){
		
		int splitIndex = location.indexOf(',');
		double[] latLong = new double[2];

		latLong[0] = Double.parseDouble(location.substring(0,splitIndex));
		latLong[1] = Double.parseDouble(location.substring(splitIndex+1));
		return latLong;
	}
}
