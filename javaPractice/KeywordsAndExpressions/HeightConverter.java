public class HeightConverter{

	public static double convertToCentimeters(int inches){

		double cm = (double) (inches * 2.54);
		return cm;
	}	

	public static double convertToCentimeters(int feet, int inches){

		double cm = (double)(feet*30.48)+(convertToCentimeters(inches));
		return cm;
	}


	public static void main(String[] args){

		System.out.println(convertToCentimeters(1));
		System.out.println(convertToCentimeters(5,5));
		System.out.println(convertToCentimeters(4));
	}

}
