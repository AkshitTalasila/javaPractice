public class AvgArray{

	public double getAvg(int[] array){
	
		SumAll one = new SumAll();
		int sum=one.sumArray(array);
		
		
		double avg = (double) sum/array.length;	
		return avg;
	}
}
