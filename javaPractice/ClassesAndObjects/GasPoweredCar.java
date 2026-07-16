public class GasPoweredCar extends Car{

	private double avgKmPerLit;
	private int cylinders;
	
	public GasPoweredCar(String description, double avgKmPerLit, int cylinders){
		
		super(description);
		this.avgKmPerLit = avgKmPerLit;
		this.cylinders = cylinders;
	}

	public double getMilage(){
	
		return avgKmPerLit;
	}

	public String getEngineType(){
	
		return("THis is a " +cylinders +" engine");
	}
}
