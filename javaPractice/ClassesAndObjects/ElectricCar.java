public class ElectricCar extends Car{

	private double avgKmPerCharge;
	private int batterySize;

	public ElectricCar(String description, double avgKmPerCharge, int batterySize){

		super(description);
		this.avgKmPerCharge = avgKmPerCharge;
		this.batterySize = batterySize;
	}

	public void accelerate(){
	
		System.out.println("THis car goes extremely fast");
	}
}
