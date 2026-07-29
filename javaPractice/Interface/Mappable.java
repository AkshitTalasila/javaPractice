package edu.umass;

public interface Mappable{

	String JSON_PROPERTY = """ 
				"properties":{%s} """;

	String getLabel();
		
	Geometry getShape();

	String getMarker();

	default String toJSON(){

		String JSON = """
				"type":"%s", "label":"%s", "marker":"%s" """.formatted(getShape(),getLabel(), getMarker());

		return JSON;
	}

	static void mapIt(Mappable m){
		
		String fullText = JSON_PROPERTY.formatted(m.toJSON());	
		System.out.println(fullText);
	}

}
