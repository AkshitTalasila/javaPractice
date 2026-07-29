package edu.umass;

public class Point implements Mappable{
	
	private String name;
	
	public enum type{

		RESIDENTIAL,
		BUSINESS,
		GOVERNMENT,
		PUBLIC
	}

	public Point(String name){
		
		this.name = name;
	}

	public String getLabel(){

		return (this.name +" (" +type.BUSINESS +")" );
	}

	public Geometry getShape(){
		
		return Geometry.POINT;
	}

	public String getMarker(){
	
		return (PointMarker.SQUARE +" " +Color.BLUE);
	}

	public String toJSON(){

		String text = """
			"type":"%s", "label":"%s", "marker":"%s" , "name":"%s", "type":"%s" """.formatted(getShape(),getLabel(), getMarker(),this.name, type.BUSINESS);

		return text;
	}


	public static void main(String[] args){

		Point p = new Point("BlueMoon");
		Mappable.mapIt(p);		
	}

			

}
